/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

/**
 *
 * @author JanaQ
 */
public class Intern extends Employee {
     private double weeklyStipend;

    public Intern(String name, int employeeId, double weeklyStipend) {
        super(name, employeeId);
        this.weeklyStipend = weeklyStipend;
    }
     
    @Override
    public double calculateWeeklyPay() {
        return weeklyStipend;
    }
}
