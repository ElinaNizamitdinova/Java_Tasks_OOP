package javaTasks.MVS_OOP_S5.Controller;

import javaTasks.MVS_OOP_S5.Model.*;
import javaTasks.MVS_OOP_S5.Service.DataService;
import javaTasks.MVS_OOP_S5.Service.GroupService;
import javaTasks.MVS_OOP_S5.View.GroupView;
import javaTasks.MVS_OOP_S5.View.StudentView;
import javaTasks.MVS_OOP_S5.View.TeacherView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private GroupService groupService = new GroupService();
    private GroupView groupView = new GroupView();
    private TeacherView teacherView = new TeacherView();
    public List<Student> stud;


    public void createStudent(String firstName, String secondName,
                              String lastName) {
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public Teacher createTeacher(String firstName, String secondName,
                              String lastName) {
        User user = service.GetAndCreate(firstName, secondName, lastName, Type.TEACHER);
        return (Teacher) user;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        groupService.createGroup(teacher, students);
        groupView.printOnConsole(groupService.getStudentGroup());
    }

//    public void getStudentInStudentGroup(String firstName, String secondName) {
//        Student student = groupService.getStudentFromStudentGroup(firstName, secondName);
//        studentView.printOnConsole(Collections.singletonList(student));
//    }

    public List<Student> getAllStudent() {
        List<User> userList = service.getAllStudent();
        List<Student> students = new ArrayList<>();
        for (User user : userList) {
            Student stud =(Student)user;
            students.add(stud);
        }
        return students;
    }
    public void getAllStudentConsole() {
        List<User> userList = service.getAllStudent();
        List<Student> students = new ArrayList<>();
        for (User user : userList) {
           Student stud = (Student) user;
           studentView.printOnConsole(stud);
        }
    }

    public void getAllTeacher() {
        List<User> userList = service.getAllTeacher();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
    public void getGroup() {
        Group group = groupService.getAllUser();
        groupView.printOnConsole(group);
    }


}




