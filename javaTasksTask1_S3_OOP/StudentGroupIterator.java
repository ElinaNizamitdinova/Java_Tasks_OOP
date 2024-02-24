
package javaTasks.javaTasksTask1_S3_OOP;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    int counter = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        if (hasNext())
            studentList.remove(counter);
    }
}


