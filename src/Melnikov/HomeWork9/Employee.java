package Melnikov.HomeWork9;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary2) {
        salary = salary2;
    }


    double salaryIncrease() {
        salary *= 2;
        return salary;
    }

    public void id1() {
        System.out.println("ID = " + id);
    }

    public void surname1() {
        System.out.println("SurName = " + surname);
    }

    public void salary1() {
        System.out.println("Salary = " + salary);
    }
}
