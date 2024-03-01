package javaTasks.MVC_Task_S5_OOP;

import javaTasks.MVC_Task_S5_OOP.controller.Controller;
import javaTasks.MVC_Task_S5_OOP.model.Student;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("A", "a", "1");
        controller.createStudent("Aa", "aa", "2");
        controller.createStudent("aaA", "n", "m");
        controller.createStudent("Am", "na", "p");
        controller.getAllStudent();
        controller.createTeacher("Teacher","NN","pp");

        controller.createGroup(controller.getTeacher(),controller.getAllGroupList());
        controller.getAllGroup();

    }
}
