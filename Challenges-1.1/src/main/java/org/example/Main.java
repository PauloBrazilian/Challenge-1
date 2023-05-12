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
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        while(true) {
            while(true) {
                System.out.print("0 - Register new Employee");
                System.out.print("1 - See Employees");
                scan.nextLine();
                switch (choice) {
                    case 0:
                        System.out.println("Enter the employee's name:");
                        String Employee = scan.nextLine();
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

                        List<Employ> employees = new ArrayList();

                        for(int i = 0; i < 10; ++i) {
                            Employ emp = new Employ(Employee, Salary, Bonus, LiquidSalary);
                            employees.add(emp);
                        }

                        System.out.print("New Employee Registered Successfully");
                        break;
                    case 1:
                        List<Employ> empp = Employ.getemployees();

                        for(int j = 0; j < empp.toArray().length; ++j) {
                            System.out.println("Employee " + empp);
                            System.out.println("Salary R$" + empp);
                            System.out.println("Bonus: R$" + empp);
                            System.out.println("Liquid Salary: R$" + empp);
                            System.out.println("-----------------------------");
                        }
                        break;
                    default:
                        System.out.print("Please enter a valid value");
                        scan.close();
                }
            }
        }
    }
}
