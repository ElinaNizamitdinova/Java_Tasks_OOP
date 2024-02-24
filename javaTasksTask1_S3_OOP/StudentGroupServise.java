package javaTasks.javaTasksTask1_S3_OOP;

import java.util.*;

public class StudentGroupServise {
    StudentGroup studentGroup;
    public StudentGroupServise(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> result = new ArrayList<>(studentGroup.studentList);
        Collections.sort(result);
        return result;


    }
    public void soutList(List<Student> studentList){
        for (Student s:studentList){
            System.out.println(s);
        }
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> result = new ArrayList<>(studentGroup.studentList);
        result.sort(new StudentComparator());
        return result;
    }
}
