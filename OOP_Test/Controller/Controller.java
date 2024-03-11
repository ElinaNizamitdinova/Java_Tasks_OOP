package javaTasks.OOP_Test.Controller;

import javaTasks.OOP_Test.Model.Calculator;
import javaTasks.OOP_Test.Model.Menu;
import javaTasks.OOP_Test.Model.Type;
import javaTasks.OOP_Test.View.MenuView;
import javaTasks.OOP_Test.View.OperationView;

import java.util.Scanner;

public class Controller {
    public void starApp() {
        boolean i = true;
        while (i) {
            MenuView menuView = new MenuView();
            menuView.showMenu();
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            OperationView view = new OperationView();
            System.out.println("Введите номер выбронного пункта");
            int operation = scanner.nextInt();
            if (operation < 4) {
                System.out.print("Введите первое число: ");
                double numberA = scanner.nextDouble();

                System.out.print("Введите второе число: ");
                double numberB = scanner.nextDouble();
                double result;
                switch (operation) {
                    case 1:
                        result = calculator.addition(numberA, numberB);
                        view.showResult(numberA, numberB, result, Type.ADDITION);
                        break;
                    case 2:
                        result = calculator.multiplication(numberA, numberB);
                        view.showResult(numberA, numberB, result, Type.MULTIPLICATION);
                        break;
                    case 3:
                        result = calculator.division(numberA, numberB);
                        view.showResult(numberA, numberB, result, Type.DIVISION);
                        break;
                }
            } else {
                switch (operation) {
                    case 4:
                        System.out.println("*----------------*");
                        System.out.println("Завершение работы.");
                        System.out.println("*----------------*");
                        i = false;
                        break;
                    default:
                        System.out.println("!-------------------------!");
                        System.out.println("Пункт не соответсвует меню.");
                        System.out.println("!-------------------------!");
                }
            }

        }

    }

}
