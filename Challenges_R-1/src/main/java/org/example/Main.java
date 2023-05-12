//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import Employee.Employ;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("0 - Register new Employee\n");
        System.out.print("1 - See Employees\n");
        int choice = scan.nextInt();

        List<Employ> employees = new ArrayList();

            while(true) {
//                scan.nextLine();
                switch (choice) {
                    case 0:
                        System.out.println("Enter the employee's name:");
                        String Employee = scan.next();
                        System.out.println("Enter the employee's salary:");
                        double Salary = scan.nextDouble();
                        double Bonus;
                        double LiquidSalary;
                        if (Salary < 1000.0) {
                            Bonus = 0.0;
                            LiquidSalary = 0.0;
                        } else if (Salary == 1000.0) {
                            Bonus = 20.0 * Salary / 100.0;
                            LiquidSalary = 0.0;
                        } else if (Salary > 1000.0 && Salary <= 2000.0) {
                            Bonus = 10.0 * Salary / 100.0;
                            LiquidSalary = 0.0;
                        } else {
                            Bonus = 0.0;
                            LiquidSalary = 10.0 * Salary / 100.0;
                        }

                        Employ emp = new Employ(Employee, Salary, Bonus, LiquidSalary);
                        employees.add(emp);

                        System.out.print("New Employee Registered Successfully\n");

                        System.out.print("0 - Register new Employee\n");
                        System.out.print("1 - See Employees\n");
                        choice = scan.nextInt();
                        break;
                    case 1:

                        for (Employ e : employees){
                            System.out.println("Employee: " + e.getEmployee());
                            System.out.println("Salary R$ " + e.getSalary());
                            System.out.println("Bonus: R$ " + e.getBonus());
                            System.out.println("Liquid Salary: R$ " + e.getLiquidSalary());
                            System.out.println("-----------------------------");
                        }

                        System.out.print("0 - Register new Employee\n");
                        System.out.print("1 - See Employees\n");
                        choice = scan.nextInt();
                        break;
                    default:
                        System.out.print("Please enter a valid value\n");
                        scan.close();

            }
        }
    }
}
