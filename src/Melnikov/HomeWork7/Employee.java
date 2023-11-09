package Melnikov.HomeWork7;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double salaryIncrease() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee Emp1 = new Employee(71, "Perelygin", 21, 61853.23, "Designer engineer");
        Employee Emp2 = new Employee(192, "Sandalov", 26, 84744.71, "Process engineer");

        Emp1.salaryIncrease();
        System.out.println("Новая заработная плата " + Emp1.surname + ": " + Emp1.salary);

        Emp2.salaryIncrease();
        System.out.println("Новая заработная плата " + Emp2.surname + ": " + Emp2.salary);
    }
}