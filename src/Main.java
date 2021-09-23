public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int debitBalance = 1100;
        double bonus = 0.01;

        if (debitBalance < 1000) {
            bonus = 0;
        } else {
            bonus = debitBalance * bonus;

            System.out.println("Бонус: " + bonus);
        }
        System.out.println("Итоговый баланс: " + (currentBalance + debitBalance + bonus));
    }
}
