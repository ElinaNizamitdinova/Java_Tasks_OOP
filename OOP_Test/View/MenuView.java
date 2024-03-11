package javaTasks.OOP_Test.View;

import javaTasks.OOP_Test.Model.Menu;

public class MenuView {
    public void showMenu() {
        Menu menu = new Menu();
        String menuString = menu.toString();
        System.out.println("-------------------------------");
        System.out.println(menuString);
        System.out.println("-------------------------------");
    }
}
