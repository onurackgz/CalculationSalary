package com.rd;

public class Employee {
    String name;
    double dailysalary;
    int numofworkday;

    public Employee(String name, double dailysalary) {
        this.name = name;
        this.dailysalary = dailysalary;
        this.numofworkday = 0;
    }

    public void addDay(int numberofday) {

        this.numofworkday += numberofday;
    }

    public double calSalary() {
        double salary = this.dailysalary * this.numofworkday;

        int extDay = this.numofworkday - 25;
        double prim = (extDay > 0) ? 1000 * extDay : 0;


        double totalSalary = salary + prim;

        return totalSalary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Onur", 225);
        employee.addDay(29);

        System.out.println("Name:"+employee.name+" "+"Daily Salary:"+ employee.dailysalary+" "+"Number of Work Day:"+employee.numofworkday+" "+"Calculation of Salary:"+ employee.calSalary());
    }
}

