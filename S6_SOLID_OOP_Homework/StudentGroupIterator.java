package javaTasks.S6_SOLID_OOP_Homework;

import java.util.List;
import java.util.Iterator;
/** Single Responsibility Principle - принцип единственной ответственности.
 * Класс отвечает только за одну задачу
 */
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
