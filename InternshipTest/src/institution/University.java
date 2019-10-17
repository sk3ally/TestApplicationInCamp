package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList; //Подключаем метод List, для работы со массивами списков
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>(); //Создаем массив для пременной
    private String name; //Оглашаем переменную

    public University(String name) {
        this.name = name; //Ключевое слово, что бы использовать переменную с одним и тем же именем, указывает на переменную из класса, а не из метода.
    }

    public List<Student> getStudentsWithGreatThanAverageKnowledge() {
        int summaryKnowledgeLevel = 0; //Оглашаем переменную
        for (Student student : students) { //Цикл для того, что бы взять значение уровня knowledge у студентов
            Knowledge knowledge = student.getKnowledge(); //Записываем в переменную значение knowledge
            Integer level = knowledge.getLevel(); //Записываем в переменную значение level
            summaryKnowledgeLevel = level + summaryKnowledgeLevel; //Записываем в переменную общий уровень знаний всех студентов
        }
        float averageKnowledgeLevel = summaryKnowledgeLevel / (students.size()* 1.0f); //Считаем средний уровень
        List<Student> studentsKnowledgeGreatAverage = new ArrayList<>();
        for (Student student : students) { //Цикл для того, что бы выбрать студентов с уровнем знаний больше среднего
            Knowledge knowledge = student.getKnowledge();
            Integer level = knowledge.getLevel();
            if (level > averageKnowledgeLevel) { //Условие для отбора
                studentsKnowledgeGreatAverage.add(student); //Записываем студента с уровнем больше среднего в список
            }
        }
        return studentsKnowledgeGreatAverage; //Возвращаем значение
    }


    public void addStudent(Student student) { //Добавляем студентов в переменную
        students.add(student);
    }

    public String getName() { 
        return name;
    }
}
