package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from the runnable");
            System.out.println("Printing from the runnable 1");
            System.out.println("Printing from the runnable 2");
        }).start();

        Employee john = new Employee("John Doe", 26);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareToIgnoreCase(employee2.getName());
            }
        });

        for(Employee employee: employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}