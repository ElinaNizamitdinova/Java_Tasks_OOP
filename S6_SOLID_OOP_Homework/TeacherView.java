package javaTasks.S6_SOLID_OOP_Homework;

/** Single Responsibility (Принцип единственной ответственности)
 * класс отвечает только за вывод элементов типа Teacher
 */

import java.util.List;

public class TeacherView implements UserView<Teacher>{


    @Override
    public void sendToConsole(List<Teacher> users) {
        int count = 0;

        for ( User user : users) {
            System.out.printf("Teacher %d: %s", count++, user);

        }
    }
}
