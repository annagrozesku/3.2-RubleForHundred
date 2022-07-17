public class Main {

    public static void main(String[] args) {

        int OnAccount = 300; // количество денег на счету
        int replenishment = 2532; // сумма пополнения

        int AfterRefill = OnAccount + replenishment; //Итоговый счет

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет:" + AfterRefill);
        System.out.println("Бонусные рубли:" + bonus);
    }
}
