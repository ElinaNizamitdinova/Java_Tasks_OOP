package javaTasks.javaTasksTask1_S3_OOP;

import java.util.List;

public class TeacherView extends UserComparator<Teacher> {
    public void sendToConsole(List<Teacher> users) {
        int count = 0;

        for (Teacher user : users) {
            System.out.printf("Teacher %d: %s", count++, user);

        }


    }
}