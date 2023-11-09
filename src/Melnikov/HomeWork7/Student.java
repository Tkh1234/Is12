package Melnikov.HomeWork7;

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
    double arithmeticsMeamScore(Student stud) {
        double averageRating = (stud.economicsAverageGrade + stud.mathematicsAverageGrade + stud.foreignLanguageAverageGrade) / 3;
        System.out.println("Средняя арифметическая оценка студента: " + stud.name + " " + stud.surname + " = " + averageRating);
        return averageRating;
    }

    public static void main(String[] args) {
        Melnikov.HomeWork7.Student stud1 = new Melnikov.HomeWork7.Student();
        stud1.numberStudentID = 27;
        stud1.name = "Artem";
        stud1.surname = "Ushakov";
        stud1.yearOfStudy = 1;
        stud1.mathematicsAverageGrade = 4.2;
        stud1.economicsAverageGrade = 3.9;
        stud1.foreignLanguageAverageGrade = 4.3;


        Melnikov.HomeWork7.Student stud2 = new Melnikov.HomeWork7.Student();
        stud2.numberStudentID = 47;
        stud2.name = "Ivan";
        stud2.surname = "Sergeyev";
        stud2.yearOfStudy = 4;
        stud2.mathematicsAverageGrade = 3.7;
        stud2.economicsAverageGrade = 3.5;
        stud2.foreignLanguageAverageGrade = 3.8;

        Melnikov.HomeWork7.Student stud3 = new Melnikov.HomeWork7.Student();
        stud3.numberStudentID = 67;
        stud3.name = "Vlad";
        stud3.surname = "Kulik";
        stud3.yearOfStudy = 2;
        stud3.mathematicsAverageGrade = 4.9;
        stud3.economicsAverageGrade = 4.7;
        stud3.foreignLanguageAverageGrade = 4.2;

        StudentTest averageTest = new StudentTest();
        averageTest.arithmeticsMeamScore(stud1);
        averageTest.arithmeticsMeamScore(stud2);
        averageTest.arithmeticsMeamScore(stud3);

    }
}