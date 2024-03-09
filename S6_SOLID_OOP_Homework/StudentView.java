package javaTasks.S6_SOLID_OOP_Homework;
import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    /** Single Responsibility (Принцип единственной ответственности)
     * класс отвечает только за вывод элементов типа Student
     */
    public void sendToConsole(List<Student> users) {
        int count = 0;

        for (Student user:users){
            System.out.printf("Student %d: %s",count++,user);

        }

    }
}

