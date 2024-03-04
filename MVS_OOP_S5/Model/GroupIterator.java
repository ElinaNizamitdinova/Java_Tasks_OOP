package javaTasks.MVS_OOP_S5.Model;

import java.util.Iterator;
import java.util.List;

public class GroupIterator  implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public GroupIterator(Group studentGroup) {
        this.students = studentGroup.getStudentList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
