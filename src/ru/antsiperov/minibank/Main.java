package ru.antsiperov.minibank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("===== MINI-BANK =====\n" +
                "1. Открыть счёт\n" +
                "2. Пополнить счёт\n" +
                "3. Снять со счёта\n" +
                "4. Показать баланс\n" +
                "5. Перевести между счетами\n" +
                "6. Выписка по счёту\n" +
                "7. Список всех счетов\n" +
                "0. Выход\n"
        );
        System.out.print("Выберите пункт: ");
        Scanner scan = new Scanner(System.in);
        String variant = scan.nextLine();
        switch(variant) {
            case "1":
                System.out.println("=== Открыть счёт ===");
                break;
            case "2":
                System.out.println("=== Пополнить счёт ===");
                break;
            case "3":
                System.out.println("=== Снять со счёта ===");
                break;
            case "4":
                System.out.println("=== Показать баланс ===");
                break;
            case "5":
                System.out.println("=== Перевести между счетами ===");
                break;
            case "6":
                System.out.println("=== Выписка по счёту ===");
                break;
            case "7":
                System.out.println("=== Список всех счетов ===");
                break;
            case "0":
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Введено некорректное значение");

        }
    }
}
