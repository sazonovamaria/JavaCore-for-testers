package hw6;

import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

public class UserInterfaceView {
    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ведите название города:");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Введите 5 для прогноза на 5 дней; Для выхода введите 0:");

            String command = scanner.nextLine();


            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
