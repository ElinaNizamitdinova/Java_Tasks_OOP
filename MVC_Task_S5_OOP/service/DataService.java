package javaTasks.MVC_Task_S5_OOP.service;

import javaTasks.MVC_Task_S5_OOP.model.Student;
import javaTasks.MVC_Task_S5_OOP.model.Teacher;
import javaTasks.MVC_Task_S5_OOP.model.Type;
import javaTasks.MVC_Task_S5_OOP.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, Type type){
        Integer id = getFreeId(type);
        if (type==Type.STUDENT){
            users.add(new Student(id,firstName,secondName,lastName));
        }else if (type==Type.TEACHER){
            users.add(new Teacher(id,firstName,secondName,lastName));
        }
    }
    private Integer getFreeId(Type type){
        boolean isStudent = type==Type.STUDENT;
        Integer lastId = 1;
        for (User user:users){
            if (user instanceof Student && isStudent){
                lastId = ((Student)user).getStudentId()+1;
            }
            else if (user instanceof Teacher && !isStudent){
                lastId = ((Teacher)user).getTeacherId()+1;

            }
        }
        return lastId;
    }
    public List<User> getUsers(){
        return users;
    }
    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();
        for (User user:users){
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }
}
