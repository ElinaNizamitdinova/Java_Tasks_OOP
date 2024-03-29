package javaTasks.javaTasksTask1_S3_OOP;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    public List<Student> studentList;
    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentList=" + studentList +
                '}' + "\r\n";
    }
}
