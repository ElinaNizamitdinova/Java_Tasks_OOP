package javaTasks.MVC_Task_S5_OOP.model;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(Integer teacherId,String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId= teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +super.toString()+
                '}';
    }
}
