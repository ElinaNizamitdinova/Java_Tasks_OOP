package javaTasks.MVC_Task_S5_OOP.model;

import javaTasks.javaTasksTask1_S3_OOP.Student;

import java.util.List;

public class StudentGroup{
    public Teacher groupTeacher;
    public List<Student> studentList;


    public StudentGroup(Teacher groupTeacher, List<Student> studentList) {
        this.groupTeacher = groupTeacher;
        this.studentList = studentList;
    }

    public Teacher getGroupTeacher() {
        return groupTeacher;
    }

    public void setGroupTeacher(Teacher groupTeacher) {
        this.groupTeacher = groupTeacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupTeacher=" + groupTeacher +
                ", studentList=" + studentList +
                '}';
    }
}
