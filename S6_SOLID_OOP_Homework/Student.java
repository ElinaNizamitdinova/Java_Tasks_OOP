package javaTasks.S6_SOLID_OOP_Homework;
/** Open closed Principle - принцип открытости-закрытости
 * / Класс User открыт для расширения и зактыр для изменения.
 * Класс Student и класс Teacher  расширяют класс User
 */
public class Student extends User{
    public Long studentID;

    public Student(String firstName, String secondName, String lastName, Long studentID) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
