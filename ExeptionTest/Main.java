package javaTasks.ExeptionTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные пользователя:<Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>");
        String user = scanner.nextLine();
        UserController.createUser(user);
        scanner.close();
    }
}
