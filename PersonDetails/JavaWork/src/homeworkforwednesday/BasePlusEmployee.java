package homeworkforwednesday;

public class BasePlusEmployee extends CommissionedEmployee {
    private double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, String employeeId, double commissionedRate, double grossRate, double baseSalary) {
        super(firstName, lastName, employeeId, commissionedRate, grossRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double payCheck() {
        return getBaseSalary() * getCommissionedRate() + getGrossRate();
    }

    @Override
    public String toString() {
        return "BasePlusEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
