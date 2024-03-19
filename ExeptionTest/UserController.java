package javaTasks.ExeptionTest;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.zip.DataFormatException;

public class UserController {

    public static void createUser(String userData) {

            String[] data = userData.split(" ");
            checkUserData(userData);
    }

    public static void checkUserData(String userData) {
        String[] data = userData.split(" ");
        if (data.length < 6) {
            throw new IllegalArgumentException("Недостаточно данных");

        } else if (data.length > 6) {
            throw new IllegalArgumentException("Введены лишние данные");
        }
        try {
            dataFormatCheck(data[0], data[1], data[2], data[3], data[4], data[5]);
            User user = new User(data[0], data[1], data[2], data[3], data[4], data[5]);
            fileCreation(user);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void dataFormatCheck(String lastName, String firstName, String secondName, String dateOfBirth, String phoneNumber, String gender) {

        if (!dateFormatCheck(dateOfBirth)) {
            throw new IllegalArgumentException("Неверный формат даты рождения");
        }

        if (!phoneFormatCheck(phoneNumber)) {
            throw new IllegalArgumentException("Неверный формат номера телефона");
        }
        if (!genderFormatCheck(gender)) {
            throw new IllegalArgumentException("Неверный формат, пол может иметь только два значения 'f' или 'm'");

        }
    }

    private static boolean dateFormatCheck(String dateOfBirth) {
        return dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}");


//        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yy");
//        myFormat.setLenient(false);
//        try {
//            myFormat.parse(dateOfBirth);
//            System.out.println(dateOfBirth);
//            return true;
//        } catch (Exception e) {
//            System.out.println("2");
//            return false;
//        }

    }



    private static boolean phoneFormatCheck(String phoneNumber) {
        boolean isInteger = phoneNumber.matches("-?\\d+");
        return isInteger;

//        try {
//            int phone = Integer.parseInt(phoneNumber);
//            return true;
//        }catch (Exception e){
//            return false;
//        }
    }

    private static boolean genderFormatCheck(String gender) {
        return (gender.equals("f") || gender.equals("m"));
    }

    public static void fileCreation(User user) {
        try {
            String filename = user.getLastName() + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            String userData = user.getLastName() + " " + user.getFirstName() + " " + user.getSecondName()
                    + " " + user.getDateOfBirth() + " " + user.getPhoneNumber() + " " + user.getGender();
            writer.write(userData);
            writer.newLine();
            writer.close();
            System.out.println("Запись успешно создана "+filename);
        } catch (IOException e) {
            System.out.println("Ошибка при создании записи");
        }


    }
}

