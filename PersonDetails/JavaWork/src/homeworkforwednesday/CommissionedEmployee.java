package homeworkforwednesday;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double grossRate;

    public CommissionedEmployee(String firstName, String lastName, String employeeId, double commissionedRate, double grossRate) {
        super(firstName, lastName, employeeId);
        this.commissionRate = commissionedRate;
        this.grossRate = grossRate;
    }

    public double getCommissionedRate() {
        return commissionRate;
    }

    public void setCommissionedRate(double commissionedRate) {
        this.commissionRate = commissionedRate;
    }

    public double getGrossRate() {
        return grossRate;
    }

    public void setGrossRate(double grossRate) {
        this.grossRate = grossRate;
    }

    @Override
    public double payCheck() {
        return grossRate * commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "commissionRate=" + commissionRate +
                ", grossRate=" + grossRate +
                '}';
    }
}
