package com.github.surzia.composite.codec.salary;

public class Main {

    public static void main(String[] args) {
        Department company = new Department("BugMaker");

        SalaryComposite accounting = new Department("Accounting");
        Salary emmy = new Employee("Emmy", 5000);
        Salary emma = new Employee("Emma", 8000);
        accounting.addDependent(emmy);
        accounting.addDependent(emma);

        SalaryComposite it = new Department("IT");
        Salary joy = new Employee("Joy", 15000);
        Salary mike = new Employee("Mike", 20000);
        it.addDependent(joy);
        it.addDependent(mike);

        SalaryComposite friend = new Department("Bit");
        Salary bill = new Employee("Bill", 25000);
        friend.addDependent(bill);

        company.addDependent(accounting);
        company.addDependent(it);

        System.out.println("公司部门：");
        for (int i = 0; i < company.getDependencies().size(); i++) {
            System.out.println(company.getDependencies().get(i).getName());
        }
        System.out.println("公司所发薪资：");
        System.out.println(company.calculateSalary());
    }
}
