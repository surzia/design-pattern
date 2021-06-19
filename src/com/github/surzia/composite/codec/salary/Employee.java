package com.github.surzia.composite.codec.salary;

public class Employee implements Salary {

    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return this.salary;
    }

    public String getName() {
        return name;
    }
}
