public class Main {
    public static void main(String[] args) {

        int deposit = 1100;
        int account = 100;
        int bonus;
        System.out.println("Ваш счет: " + account + " rub");
        System.out.println("Вы пополнили счет на: " + deposit + " rub");

        if (deposit > 999) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = deposit + account + bonus;
        System.out.println("Итоговый счет: " + balance + " rub");
        System.out.println("Ваш бонус: " + bonus + " rub");


    }
}