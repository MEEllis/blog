package com.demo.project.service;

import com.demo.project.domain.*;

import static com.demo.project.service.Data.*;

public class NameListService {
    private Employee[] employee;

    public NameListService() {
        employee = new Employee[EMPLOYEES.length];
        for (int i = 0; i < EMPLOYEES.length; i++) {
            int key = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Integer.parseInt(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (key) {
                case EMPLOYEE:
                    employee[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employee[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employee[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employee[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    //创建一个设备
    private Equipment createEquipment(int i) {
        switch (Integer.parseInt(EQUIPMENTS[i][0])) {
            case PC:
                return new PC(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
            case NOTEBOOK:
                return new NoteBook(EQUIPMENTS[i][1], Double.parseDouble(EQUIPMENTS[i][2]));
            case PRINTER:
                return new Printer(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);

        }
        return null;
    }

    public Employee[] getEmployeeList() {
        return employee;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employee.length; i++) {
            if (id == employee[i].getId()) {
                return employee[i];
            }
        }
        throw new TeamException("没有找到该成员");
    }

}
