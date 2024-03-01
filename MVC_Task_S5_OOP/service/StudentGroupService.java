package javaTasks.MVC_Task_S5_OOP.service;

import javaTasks.MVC_Task_S5_OOP.model.Student;
import javaTasks.MVC_Task_S5_OOP.model.Teacher;
import javaTasks.MVC_Task_S5_OOP.model.Type;
import javaTasks.MVC_Task_S5_OOP.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<User> group = new ArrayList<>();

    public void createGroup(Teacher teacher, List<Student> strudents) {
        group.add(teacher);
        Integer lastId = getFreeId(Type.STUDENT);
        for (Student student : strudents) {
            group.add(student);
        }
    }

    private Integer getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        Integer lastId = 1;
        for (User user : group) {
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;

    }
    public List<Student> getAllStudentGroup(){
        DataService dataService = new DataService();
       return dataService.getAllStudent();
    }
    public Teacher getTeacher(){
        return  (Teacher)group.getFirst();

    }

}
