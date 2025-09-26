
package payroll;

/**
 *
 * @author JanaQ
 */
public class Payroll {

   
    public static void main(String[] args) {
        
      Employee[] employees = new Employee[3];
      employees[0] = new Manager( 1500.0,"Alice",101);
      employees[1] = new Developer("Bob", 202, 40, 45);
      employees[2] = new Intern("Charlie", 303, 500.0);
      
      for (int i = 0; i < employees.length; i++) {
    System.out.println(employees[i] + " | Weekly Pay: $" + employees[i].calculateWeeklyPay());
}


      
    }
    
}
