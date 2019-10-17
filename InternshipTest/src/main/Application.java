package main; //Пакет, обычно в названии соответствует физической структуре проекта.

import institution.University; //Подключаем(импортируем) внешние ресурсы
import institution.interlink.Internship; //Подключаем(импортируем) внешние ресурсы
import person.Student; //Подключаем(импортируем) внешние ресурсы
import person.consciousness.Knowledge; //Подключаем(импортируем) внешние ресурсы

import java.util.List; //Подключаем метод List, для работы со списками

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I."); //Создаем новый класс
        Student andrewKostenko = new Student("Andrew Kostenko"); //Создаем новый класс
        andrewKostenko.setKnowledge(new Knowledge(1)); //Задаем уровень знаний
        university.addStudent(andrewKostenko); //Добавляем студента (andrewKostenko) в университет
        Student juliaVeselkina = new Student("Julia Veselkina"); //Создаем новый класс
        juliaVeselkina.setKnowledge(new Knowledge(4)); //Задаем уровень знаний
        university.addStudent(juliaVeselkina); //Добавляем студента (juliaVeselkina) в университет
        Student mariaPerechrest = new Student("Maria Perechrest"); //Создаем новый класс
        mariaPerechrest.setKnowledge(new Knowledge(2)); //Задаем уровень знаний
        university.addStudent(mariaPerechrest); //Добавляем студента (mariaPerechrest) в университет

        List<Student> students = university.getStudentsWithGreatThanAverageKnowledge(); //Присваевываем списку студентов метод для определения студентов, средний бал которых выше среднего.

        Internship internship = new Internship("Interlink"); //Создаем новый класс
        internship.recruitStudents(students); //Проводим зачисление студентов в интенатуру.
        System.out.println("List of internship's students:"); //Выводим текст
        System.out.println(internship.getStudents()); //Выводим имена студентов, которые прошли в интернатуру
    }
}
