package com.zayzou.extra.divers.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CustomComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int flag = o1.getName().compareTo(o2.getName());
        if (flag == 0) {
            flag = o1.getId() - o2.getId();
        }
        return flag;
    }
}

public class ComparableNdComparator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "zayzou"));
        employees.add(new Employee(21, "qaci"));
        employees.add(new Employee(13, "mohand"));
        employees.add(new Employee(12, "sabrina"));
        employees.add(new Employee(3, "zayzou"));
        employees.add(new Employee(2, "qaci"));
        employees.add(new Employee(14, "mohand"));
        employees.add(new Employee(16, "sabrina"));
        Collections.sort(employees);
        System.out.println(employees);
        Collections.sort(employees, new NameComparator());
        System.out.println(employees);
        Collections.sort(employees, new CustomComparator());
        System.out.println(employees);

    }
}
