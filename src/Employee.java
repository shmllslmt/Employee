public class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private double payRate;
    private int hoursWorked;

    public Employee() {
        this("E001", "John", "Doe");
    }

    public Employee(String employeeID, String firstName, String lastName) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double total;
        double overtime = this.hoursWorked - 40;

        if(this.hoursWorked > 40) {
            total = overtime * 1.5 * payRate + 40 * payRate;
        } else {
            total = hoursWorked * payRate;
        }

        return total;
    }

    public void printEmployee() {
        System.out.println(this.getEmployeeID() + " " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Your total pay for this week is RM" + this.getTotalPay());
    }
}
