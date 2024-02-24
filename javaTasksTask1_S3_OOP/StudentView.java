package javaTasks.javaTasksTask1_S3_OOP;

import java.util.List;

public class StudentView implements UserView<Student> {


    @Override
    public void sendToConsole(List<Student> users) {
        int count = 0;

        for (Student user:users){
            System.out.printf("Student %d: %s",count++,user);

        }

    }
}
