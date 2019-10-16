package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;

    public University(String name) {
        this.name = name;
    }

    public List<Student> getStudentsWithGreatThanAverageKnowledge() {
        int summaryKnowledgeLevel = 0;
        for (Student student : students) {
            Knowledge knowledge = student.getKnowledge();
            Integer level = knowledge.getLevel();
            summaryKnowledgeLevel = level + summaryKnowledgeLevel;
        }
        float averageKnowledgeLevel = summaryKnowledgeLevel / (students.size()* 1.0f);
        List<Student> studentsKnowledgeGreatAverage = new ArrayList<>();
        for (Student student : students) {
            Knowledge knowledge = student.getKnowledge();
            Integer level = knowledge.getLevel();
            if (level > averageKnowledgeLevel) {
                studentsKnowledgeGreatAverage.add(student);
            }
        }
        return studentsKnowledgeGreatAverage;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }
}
