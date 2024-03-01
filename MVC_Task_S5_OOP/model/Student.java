package javaTasks.MVC_Task_S5_OOP.model;

public class Student extends User{
    private Integer studentId;

    public Student(Integer studentId,String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +super.toString()+
                '}';
    }
}
