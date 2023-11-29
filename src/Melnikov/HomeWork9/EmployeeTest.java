package Melnikov.HomeWork9;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(17);
        Employee emp2 = new Employee("Barsov");
        //Employee emp3 = new Employee(23.2);
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);
        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary);
        emp1.id1();
        emp1.surname1();
        emp1.salary1();
        emp2.id1();
        emp2.surname1();
        emp2.salary1();
    }
}
