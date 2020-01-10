package homeworkforwednesday;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Ray", "Felton", "RayFelton");
        SalariedEmployee salariedEmployee = new SalariedEmployee("Ray", "Felton", "RayFelton");
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Ray", "Felton", "RayFelton", 20.00,100.00);
        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("Ray", "Felton", "RayFelton", 20.00,100.00,50000.00);
       Employee[]  Employee = {salariedEmployee, commissionedEmployee, basePlusEmployee};
        for(Employee e :Employee){
            System.out.println(e);
        }
    }
}
