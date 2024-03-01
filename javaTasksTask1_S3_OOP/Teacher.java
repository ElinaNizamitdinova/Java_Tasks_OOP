package javaTasks.javaTasksTask1_S3_OOP;

public class Teacher extends User implements Comparable<Teacher> {
    private int teacherID;

    public Teacher(int teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID + super.toString() +
                '}' + "\r\n";
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
