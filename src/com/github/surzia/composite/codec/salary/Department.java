package com.github.surzia.composite.codec.salary;

import java.util.ArrayList;
import java.util.List;

public class Department extends SalaryComposite {

    public final List<Salary> dependencies;
    public final String name;

    public Department(String name) {
        this.dependencies = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Salary> getDependencies() {
        return dependencies;
    }

    @Override
    public void addDependent(Salary employee) {
        this.dependencies.add(employee);
    }

    @Override
    public int calculateSalary() {
        int total = 0;
        for (Salary dependency : this.dependencies) {
            total += dependency.calculateSalary();
        }
        return total;
    }
}
