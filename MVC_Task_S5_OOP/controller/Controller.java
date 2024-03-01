package javaTasks.MVC_Task_S5_OOP.controller;

import javaTasks.MVC_Task_S5_OOP.model.Student;
import javaTasks.MVC_Task_S5_OOP.model.Teacher;
import javaTasks.MVC_Task_S5_OOP.model.Type;
import javaTasks.MVC_Task_S5_OOP.model.User;
import javaTasks.MVC_Task_S5_OOP.service.DataService;
import javaTasks.MVC_Task_S5_OOP.service.StudentGroupService;
import javaTasks.MVC_Task_S5_OOP.view.StudentGroupView;
import javaTasks.MVC_Task_S5_OOP.view.StudentView;
import javaTasks.MVC_Task_S5_OOP.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private DataService dataService = new DataService();
    private StudentGroupService studentGroupService = new StudentGroupService();
    private StudentView studentView= new StudentView();
    private StudentGroupView studentGroupView = new StudentGroupView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName,secondName,lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName,secondName,lastName,Type.TEACHER);
    }
    public void getAllStudent(){
        for (Student student :dataService.getAllStudent())
            studentView.printOnConsole(student);
    }
    public void  createGroup(Teacher teacher, List<Student> students){
        studentGroupService.createGroup(teacher,students);

    }
    public void getAllGroup(){
        for (User user : studentGroupService.getAllStudentGroup())
            studentGroupView.printOnConsole(user);
    }
    public List<Student> getAllGroupList(){
        List<Student> group= new ArrayList<>();
         group = studentGroupService.getAllStudentGroup();
         return group;

    }
    public Teacher getTeacher(){
        return studentGroupService.getTeacher();
    }
}
