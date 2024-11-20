package com.vue.exerabstract;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emp = new Employee[]{new SalariedEmployee("熊爱明", 1001, new Mydate(1992, 1, 11), 10000),
                new HoulyEmployee("我爱罗", 1002, new Mydate(1992, 2, 11), 50, 200)};
        System.out.println(emp[0].earnings());
    }
}
