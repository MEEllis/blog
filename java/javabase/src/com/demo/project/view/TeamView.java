package com.demo.project.view;

import com.demo.project.domain.Employee;
import com.demo.project.domain.Programmer;
import com.demo.project.service.NameListService;
import com.demo.project.service.TeamException;
import com.demo.project.service.TeamService;

public class TeamView {
    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.MenuList();


    }

    private void MenuList() {
        boolean flag = true;
        char key = '0';
        while (flag) {
            if (key != '1') {
                getEmployeeList();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出");
            key = TSUtility.readMenuSelection();
            switch (key) {
                case '1':
                    teamList();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    delMember();
                    break;
                case '4':
                    flag = false;
                    break;
            }
        }

    }

    private void delMember() {
        System.out.print("请输入删除成员memberId");
        int key = TSUtility.readInt();
        try {
            teamService.removeMember(key);
        } catch (TeamException e) {
            System.out.print(key + e.getMessage());
        }
    }

    private void teamList() {
        Programmer[] team = teamService.getTeam();
        if(team.length>0){
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailForTeam());
            }
        }else{
            System.out.println("---------没有团队列表----------");
        }

    }

    //添加成员
    private void addMember() {
        System.out.println("---------添加团队成员----------");
        System.out.print("请输入添加成员id");
        int key = TSUtility.readInt();
        Employee employee = null;
        try {
            employee = nameListService.getEmployee(key);
        } catch (TeamException e) {
            System.out.print(key + e.getMessage());
        }
        try {
            teamService.addMember(employee);
        } catch (TeamException e) {
            System.out.print(e.getMessage());
        } finally {
            TSUtility.readReturn();
        }


    }

    private void getEmployeeList() {
        System.out.println("----------------------------------------开发团队调度软件----------------------------------------\n");
        System.out.println("ID\t姓名\t\t年龄\t\t工资\t\t职位\t状态\t\t奖金\t\t股票\t\t领用设备");
        Employee[] employees = nameListService.getEmployeeList();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}
