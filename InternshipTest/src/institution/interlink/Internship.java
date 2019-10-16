package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> interns = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void recruitStudents(List<Student> students) {
        interns.addAll(students);
    }

    public String getStudents() {
        String internsNames = "";
        for (Student intern : interns) {
            internsNames += intern.getName() + "\n";
        }
       return internsNames;
    }
}
