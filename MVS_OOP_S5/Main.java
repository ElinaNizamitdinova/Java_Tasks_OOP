package javaTasks.MVS_OOP_S5;


import javaTasks.MVS_OOP_S5.Controller.Controller;
import javaTasks.MVS_OOP_S5.Model.Teacher;

public class Main {public static void main(String[] args) {
    Controller controller = new Controller();
    controller.createStudent("A", "a", "1");
    controller.createStudent("Aa", "aa", "2");
    controller.createStudent("aaA", "n", "m");
    controller.createStudent("Am", "na", "p");
    controller.getAllStudent();
    controller.createTeacher("Teacher","NN","pp");
    controller.getAllTeacher();

    /**controller.createGroup();
    controller.getAllGroup();**/

}
}
