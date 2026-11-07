package ru.antsiperov.minibank;
import java.util.Scanner;

public class Account {
//    static final int MAX_ACCOUNTS = 10; // account limit
    static int countAccounts = 0;
    static final String mask = "40817"; // маска счетов
    String owner; // Имя владельца
    String number; // номер счета
    long balance = 0; // значение баланса по умолчанию

    static final int MAX_OPERATIONS = 10; // история операций с лимитом отображения
    String[] history = new String[MAX_OPERATIONS]; // массив истории операций

        public Account(String owner) {
            this.owner = owner;
            countAccounts++;
            number = mask + String.format("%05d", countAccounts);
        }

        void deposit(long amount) {
            balance += amount;
        }


}
