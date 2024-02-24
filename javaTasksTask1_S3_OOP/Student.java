package javaTasks.javaTasksTask1_S3_OOP;

public class Student implements Comparable<Student> {
    public Long studentID;
    public String firstName;
    public String secondName;
    public String lastName;

    public Student(Long studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
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
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}' + "\r\n";
    }
}
