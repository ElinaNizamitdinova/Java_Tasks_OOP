package javaTasks.javaTasksTask1_S3_OOP;

public class Student extends User implements Comparable<Student> {
    public Long studentID;

    public Student(Long studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;

    }


    @Override
    public int compareTo(Student o) {
        if (this.studentID > o.studentID)
            return 1;
        else if (this.studentID<o.studentID)
            return -1;
        else return 0;

        //return this.studentID == o.studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                super.toString()+
                '}' + "\r\n";
    }
}
