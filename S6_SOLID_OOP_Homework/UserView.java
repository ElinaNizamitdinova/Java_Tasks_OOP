package javaTasks.S6_SOLID_OOP_Homework;

import java.util.List;

/**  Interface Segregation Principle - принцип разделения интерфейсов.
 *    StudentView и TeacherView реализуют нужный в данных классах интерфейс
 */
public interface UserView <T extends User>{
    void sendToConsole(List<T> users);


}