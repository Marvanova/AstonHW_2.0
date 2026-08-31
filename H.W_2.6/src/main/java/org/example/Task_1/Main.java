package org.example.Task_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void removeStudents(Set<Student> students){
        ArrayList<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverageGrade() < 3) {
                studentsToRemove.add(student);
            }
        }
        studentsToRemove.forEach(students::remove);
    }
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {

            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {

            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ася","БТС-105",1,new ArrayList<>(Arrays.asList(5,4,5))));

        students.add(new Student("Света","ИКТ-206",2,new ArrayList<>(Arrays.asList(3,4,2))));

        students.add(new Student("Катя","БТС-303",3,new ArrayList<>(Arrays.asList(2,2,3))));

        students.add(new Student("Олег","П-107",1,new ArrayList<>(Arrays.asList(5,4,5))));

        removeStudents(students);
        promoteStudents(students);
        printStudents(students, 2);
    }

}
