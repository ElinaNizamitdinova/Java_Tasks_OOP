package javaTasks.S6_SOLID_OOP_Homework;

/** Open closed Principle - принцип открытости-закрытости
 * / Класс User открыт для расширения и зактыр для изменения.
 * Класс Student и класс Teacher  расширяют класс User
 */

public class Teacher extends User implements Comparable<Teacher> {
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastName, int teacherID) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.teacherID > o.teacherID)
            return 1;
        else if (this.teacherID < o.teacherID)
            return -1;
        else return 0;
    }
}

