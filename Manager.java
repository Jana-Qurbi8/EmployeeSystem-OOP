/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

/**
 *
 * @author JanaQ
 */
public class Manager extends Employee {
     private double weeklySalary;

    public Manager(double weeklySalary, String name, int employeeId) {
        super(name, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateWeeklyPay() {
        return weeklySalary;
    }
     
}
