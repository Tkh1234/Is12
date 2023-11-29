package Melnikov.HomeWork8;

public class Student {
    Student(int numberStudentID1, String name1, String surname1, int yearOfStudy1, double mathematicsAverageGrade1, double economicsAverageGrade1, double foreignLanguageAverageGrade1) {
        numberStudentID = numberStudentID1;
        name = name1;
        surname = surname1;
        yearOfStudy = yearOfStudy1;
        mathematicsAverageGrade = mathematicsAverageGrade1;
        economicsAverageGrade = economicsAverageGrade1;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade1;
    }

    Student(int numberStudentID2, String name2, String surname2, int yearOfStudy2) {
        this(numberStudentID2, name2, surname2, yearOfStudy2, 0, 0, 0);
    }

    Student() {

    }

    int numberStudentID;
    String name;
    String surname;
    int yearOfStudy;
    double mathematicsAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
}

class StudentTest {
    double arithmeticsMeamScore(Student stud) {
        double averageRating = (stud.economicsAverageGrade + stud.mathematicsAverageGrade + stud.foreignLanguageAverageGrade) / 3;
        System.out.println("Средняя арифметическая оценка студента: " + stud.name + " " + stud.surname + " = " + averageRating);
        return averageRating;
    }

    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.numberStudentID = 27;
        stud1.name = "Artem";
        stud1.surname = "Ushakov";
        stud1.yearOfStudy = 1;
        stud1.mathematicsAverageGrade = 4.2;
        stud1.economicsAverageGrade = 3.9;
        stud1.foreignLanguageAverageGrade = 4.3;


        Student stud2 = new Student(47, "Ivan", "Sergeyev", 4);
        stud2.mathematicsAverageGrade = 3.7;
        stud2.economicsAverageGrade = 3.5;
        stud2.foreignLanguageAverageGrade = 3.8;

        Student stud3 = new Student(67, "Vlad", "Kulik", 2, 4.9, 4.7, 4.2);

        StudentTest averageTest = new StudentTest();
        averageTest.arithmeticsMeamScore(stud1);
        averageTest.arithmeticsMeamScore(stud2);
        averageTest.arithmeticsMeamScore(stud3);

    }
}