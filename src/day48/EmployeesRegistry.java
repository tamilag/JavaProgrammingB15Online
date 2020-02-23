package day48;

public class EmployeesRegistry {
    public static void main(String[] args) {
        HourlyEmployee he1 = new HourlyEmployee("Tamila", 07, 68, 2080);
        he1.calculateAnnualSalary();
        System.out.println(he1);

        FullTimeEmployee f1 = new FullTimeEmployee("Tamila", 07, 11000);
        f1.calculateAnnualSalary();
        System.out.println(f1);
    }

}
