import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String employeeID, firstName, lastName;

        System.out.print("What's your Employee ID? ");
        employeeID = keyboard.next();

        System.out.print("What's your First Name? ");
        firstName = keyboard.next();

        System.out.print("What's your Last Name? ");
        lastName = keyboard.next();

        Employee newEmp = new Employee(employeeID, firstName, lastName);

        System.out.print("What's your pay rate? RM");
        newEmp.setPayRate(keyboard.nextDouble());

        System.out.print("How many hours have you worked this week? ");
        newEmp.setHoursWorked(keyboard.nextInt());

        newEmp.printEmployee();
    }
}