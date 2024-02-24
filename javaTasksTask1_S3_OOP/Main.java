package javaTasks.javaTasksTask1_S3_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4L, "aab", "aab", "aab");
        Student student2 = new Student(2L, "aaa", "aaa", "aaa");
        Student student3 = new Student(3L, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1L, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.studentList.add(student1);
        studentGroup.studentList.add(student2);
        studentGroup.studentList.add(student3);
        studentGroup.studentList.add(student4);


        Teacher teacher1 = new Teacher(56,"Aa","Bb","Dd");
        Teacher teacher2 = new Teacher(56,"AA","BB","DD");
        Teacher teacher3 = new Teacher(56,"Aaa","Bbb","Ddd");
        Teacher teacher4 = new Teacher(56,"aa","bb","dd");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        TeacherService teacherService = new TeacherService(teacherList);
        System.out.println("**---------------------------**");
        TeacherView teacherView = new TeacherView();
        teacherView.sendToConsole(teacherList);
        System.out.println("**---------------------------**");



        System.out.println("*---------------------------*");
        StudentView studentView = new StudentView();
        studentView.sendToConsole(studentGroup.studentList);
        System.out.println("*---------------------------*");

        StudentGroupServise service = new StudentGroupServise(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println("---------------------------");
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println("---------------------------");
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }


        StudentGroup studentGroup1 = new StudentGroup(studentList);
        studentGroup1.studentList.add(student1);
        studentGroup1.studentList.add(student2);
        studentGroup1.studentList.add(student3);
        studentGroup1.studentList.add(student4);


        StudentGroup studentGroup2 = new StudentGroup(studentList);
        studentGroup2.studentList.add(student1);
        studentGroup2.studentList.add(student2);
        studentGroup2.studentList.add(student3);
        studentGroup2.studentList.add(student4);

        List<StudentGroup> educationStream = new ArrayList<>();
        Stream stream = new Stream(educationStream);
        stream.educationStream.add(studentGroup1);
        stream.educationStream.add(studentGroup);
        stream.educationStream.add(studentGroup2);
        StreamServise servise = new StreamServise(stream);
        System.out.println("----------------------------");
        for(Stream stream1: servise.getSortedStream()){
            System.out.println(stream1.toString());
        }


    }
}
