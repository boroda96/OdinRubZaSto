public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int deposit = 1100;
        int account = 100;
        int bonus;
        System.out.println("Ваш счет: " + account + " rub");
        System.out.println("Вы пополнили счет на: " + deposit + " rub");

        if (deposit > 999) {
            bonus = deposit / 100;
        }
        else { bonus = 0;
        }
        int balance = deposit + account + bonus;
        System.out.println("Итоговый счет: " + balance + " rub");
        System.out.println("Ваш бонус: " + bonus + " rub");


    }
}