/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

/**
 *
 * @author JanaQ
 */
public class Developer extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public Developer(String name, int employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateWeeklyPay() {
        return hourlyRate * hoursWorked;
    
}
}