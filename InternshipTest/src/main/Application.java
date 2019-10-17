package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        Student andrewKostenko = new Student("Andrew Kostenko");
        andrewKostenko.setKnowledge(new Knowledge(1));
        university.addStudent(andrewKostenko);
        Student juliaVeselkina = new Student("Julia Veselkina");
        juliaVeselkina.setKnowledge(new Knowledge(4));
        university.addStudent(juliaVeselkina);
        Student mariaPerechrest = new Student("Maria Perechrest");
        mariaPerechrest.setKnowledge(new Knowledge(2));
        university.addStudent(mariaPerechrest);

        List<Student> students = university.getStudentsWithGreatThanAverageKnowledge();

        Internship internship = new Internship("Interlink");
        internship.recruitStudents(students);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
