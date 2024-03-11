package javaTasks.OOP_Test.Model;

import java.util.Arrays;

public class Menu {

    public String[] main_menu = {"Сложить числа",
            "Перемножить числа", "Разделить числа",
            "Выход"};


    public String[] getMain_menu() {
        return main_menu;
    }

    public void setMain_menu(String[] main_menu) {
        this.main_menu = main_menu;
    }

    @Override
    public String toString() {
        return "Главное меню:" + "\n" + "1." + main_menu[0] + "\n"  + "2." + main_menu[1] + "\n"  + "3." + main_menu[2] + "\n"  + "4." + main_menu[3] + '.';
    }
}