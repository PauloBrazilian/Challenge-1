//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Employee;

import java.util.ArrayList;
import java.util.List;

public class Employ {
    private String Employee;
    private double Salary;
    private double Bonus;
    private double LiquidSalary;

    public Employ(String Employee, double Salary, double Bonus, double LiquidSalary) {
        this.Employee = Employee;
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.LiquidSalary = LiquidSalary;
    }

    public String getEmployee() {
        return this.Employee;
    }

    public double getSalary() {
        return this.Salary;
    }

    public double getBonus() {
        return this.Bonus;
    }

    public double getLiquidSalary() {
        return this.LiquidSalary;
    }

    public void setEmployee(String employee) {
        this.Employee = employee;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public void setBonus(double bonus) {
        this.Bonus = bonus;
    }

    public void setLiquidSalary(double liquidsalary) {
        this.LiquidSalary = liquidsalary;
    }

    public static List<Employ> getemployees() {
        List<Employ> employees = new ArrayList();

        return employees;
    }
}
