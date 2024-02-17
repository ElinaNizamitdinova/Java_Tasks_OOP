package javaTasks.Task_16_S2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Петрова", 101, 5000, Arrays.asList(5, 4, 3));
        Student student2 = new Student("Пузиков", 102, 5000, Arrays.asList(5, 4, 3));
        Student student3 = new Student("Иванова", 103, 5000, Arrays.asList(5, 4, 3));
        Student student4 = new Student("Толканюк", 101, 5000, Arrays.asList(5, 4, 3));
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Петрова", 101, 5000, Arrays.asList(5, 4, 3)),
                new Student("Пузиков", 102, 5000, Arrays.asList(5, 4, 3)),
                new Student("Иванова", 103, 5000, Arrays.asList(5, 4, 3)),
                new Student("Толканюк", 101, 5000, Arrays.asList(5, 4, 3))));

        for (Student student : studentList) {
            if (student.getSurnme().endsWith("ова") && student.evenGrades()) {
                System.out.println("student.getSurname() = " + student.getSurnme());
                System.out.println("Stipa = " + student.getGrants());
            }

        }
    }
}