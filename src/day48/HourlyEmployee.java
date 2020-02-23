package day48;

public class HourlyEmployee extends Employee{
    int hourlyWage;
    int numberOfHours;

    public HourlyEmployee(String name, int id, int hourlyWage, int numberOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Annual salary = " + hourlyWage*numberOfHours);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numberOfHours=" + numberOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
