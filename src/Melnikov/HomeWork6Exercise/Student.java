package Melnikov.HomeWork6Exercise;

public class Student {
    int numberStudentID;
    String name;
    String surname;
    int yearOfStudy;
    double mathematicsAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
}

class StudentTest {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.numberStudentID = 27;
        stud1.name = "Artem";
        stud1.surname = "Ushakov";
        stud1.yearOfStudy = 1;
        stud1.mathematicsAverageGrade = 4.2;
        stud1.economicsAverageGrade = 3.9;
        stud1.foreignLanguageAverageGrade = 4.3;


        Student stud2 = new Student();
        stud2.numberStudentID = 47;
        stud2.name = "Ivan";
        stud2.surname = "Sergeyev";
        stud2.yearOfStudy = 4;
        stud2.mathematicsAverageGrade = 3.7;
        stud2.economicsAverageGrade = 3.5;
        stud2.foreignLanguageAverageGrade = 3.8;

        Student stud3 = new Student();
        stud3.numberStudentID = 67;
        stud3.name = "Vlad";
        stud3.surname = "Kulik";
        stud3.yearOfStudy = 2;
        stud3.mathematicsAverageGrade = 4.9;
        stud3.economicsAverageGrade = 4.7;
        stud3.foreignLanguageAverageGrade = 4.2;

        System.out.println("Средняя арифметическая оценка студента: " + stud1.name + " " + stud1.surname + " = " + (stud1.mathematicsAverageGrade + stud1.economicsAverageGrade + stud1.foreignLanguageAverageGrade) / 3);
        System.out.println("Средняя арифметическая оценка студента: " + stud2.name + " " + stud2.surname + " = " + (stud2.mathematicsAverageGrade + stud2.economicsAverageGrade + stud2.foreignLanguageAverageGrade) / 3);
        System.out.println("Средняя арифметическая оценка студента: " + stud3.name + " " + stud3.surname + " = " + (stud3.mathematicsAverageGrade + stud3.economicsAverageGrade + stud3.foreignLanguageAverageGrade) / 3);

    }
}