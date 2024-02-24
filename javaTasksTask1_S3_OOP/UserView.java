package javaTasks.javaTasksTask1_S3_OOP;

import java.util.List;

public interface UserView <T extends User>{
    void sendToConsole(List<T> users);


}
