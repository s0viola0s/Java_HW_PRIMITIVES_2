public class Main {
    public static void main(String[] args) {

        int balance = 100; //баланс телефона до пополнения
        int amount = 1100; //сумма пополнения
        int bonus = 0; //переменная для подсчета бонусов

        if (amount < 1000) {
            balance = balance + amount;
        } else {
            bonus = amount / 100;
            balance = balance + amount + bonus;
        }

        System.out.println("Итоговый счёт: " + balance + " руб.");
        System.out.println("Количество бонусных рублей: " + bonus + " руб.");
    }
}