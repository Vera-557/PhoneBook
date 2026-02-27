import buttons.FirstMenu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static User user = new User();
    //}
    static Scanner scanner = new Scanner(System.in);
    FileManager fileManager = new FileManager();
    static boolean isRunning = true;

    static void firstMenu() {
        while (isRunning) {
            System.out.println("Добро пожаловать в телефонную книгу!");
            System.out.println("1 - Вход" +
                    "2 - Регистрация" +
                    "3 - Выход");
            int choice1 = scanner.nextInt();
            if (choice1 == 1) {
                System.out.println(FirstMenu.SIGNIN);
            }

        }
    }

    static void addContact() {
        File file = new File(user.getUserName() + ".contacts" + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            System.out.println("Введите имя");
            String name = scanner.nextLine().trim();
            System.out.println("Введите фамилию");
            String lastName = scanner.nextLine().trim();
            System.out.println("Введите номер телефона");
            Integer phone = scanner.nextInt();
            System.out.println("Введите возраст");
            Integer age = scanner.nextInt();
            System.out.println("Введите пол");
            Character gender = scanner.next().charAt(0);
            if (name.isEmpty() || phone == 0) {
                System.out.println("Заполните обязательные поля, контакт не был сохранен");
                return;
            }
            Contact newContact = new Contact(name, lastName, phone, age, gender);
            if (!file.exists()) {
                file.createNewFile();
            }
            bw.write(newContact.toString());
            bw.newLine();
        } catch (IOException e) {

        }
    }
    static void searchContact(){
        System.out.println("Введите имя или его часть для поиска");
        String searchName = scanner.nextLine().trim();
        if (searchName.isEmpty()){
            System.out.println("Пустой запрос");
            return;
        }
        List<Contact> foundContact = new ArrayList<>();
        if (foundContact.isEmpty()){
            System.out.println("Ваш запрос не найден");
            return;
        }
        System.out.println("Результат поиска " + searchName);
    }
}
