package javaTasks.ExeptionTest;

public class UserView {
    public void printUserInformation(User user){
        String information = user.toString();
        System.out.printf("Информация сохранённая в фаил содержит следующие данные: %s",user);
    }
}
