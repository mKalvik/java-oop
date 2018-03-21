package prax9;


import prax9.Student.Student;

import java.util.*;

public class main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Üks", 1);
        Student s2 = new Student("Kaks", 2);
        Student s3 = new Student("Kolm", 3);
        Student s4 = new Student("Neli", 4);
        Student s5 = new Student("Viis", 5);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        students.stream()
                .filter(s -> s.getName().contains("i") || s.getName().contains("e"))
//                .peek(System.out::println)
                .filter(s -> s.getGrade() >= 3)
                .forEach(System.out::println);

    }
}
