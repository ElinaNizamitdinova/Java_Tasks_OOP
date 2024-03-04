package javaTasks.MVS_OOP_S5.Model;

import javaTasks.MVS_OOP_S5.Model.Student;
import javaTasks.MVS_OOP_S5.Model.Teacher;

import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student> {
    Teacher teacher;
    List<Student> StudentList;


    public Group(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        StudentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "teacher=" + teacher +
                ", StudentList=" + StudentList +
                '}';
    }
    @Override
    public GroupIterator iterator() {
        return new  GroupIterator(this);
    }
}
