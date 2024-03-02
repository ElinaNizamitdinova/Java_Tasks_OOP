package javaTasks.MVS_OOP_S5.Controller;

import javaTasks.MVS_OOP_S5.Model.Student;
import javaTasks.MVS_OOP_S5.Model.Teacher;
import javaTasks.MVS_OOP_S5.Model.Type;
import javaTasks.MVS_OOP_S5.Model.User;
import javaTasks.MVS_OOP_S5.Service.DataService;
import javaTasks.MVS_OOP_S5.Service.GroupService;
import javaTasks.MVS_OOP_S5.View.GroupView;
import javaTasks.MVS_OOP_S5.View.StudentView;
import javaTasks.MVS_OOP_S5.View.TeacherView;

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

    public void createTeacher(String firstName, String secondName,
                              String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void createGroup(Teacher teacher, List<Student> students) {
        groupService.createGroup(teacher, students);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }
    public void getAllTeacher() {
        List<User> userList = service.getAllTeacher();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }



}
