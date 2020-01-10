package homeworkforwednesday;

public class SalariedEmployee extends Employee {
    private double weeklySalary;


    public SalariedEmployee(String firstName, String lastName, String employeeId) {
        super(firstName, lastName, employeeId);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double payCheck() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
