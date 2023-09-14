import java.util.Scanner;

public class DepositCalculate {
    public static void main(String[] args) {

        new DepositCalculate().makeСalculation();
    }


    double calculateComplexPercent(double a, double y, int d) {

        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return calculation(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
        return calculation(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    double calculation(double value, int places) {
        double scaLe = Math.pow(10, places);

        return Math.round(value * scaLe) / scaLe;
    }

    void makeСalculation() {
        int period, action;

        Scanner abcdef = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");


        int amount = abcdef.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = abcdef.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = abcdef.nextInt();

        double var = 0;

        if (action == 1) var = calculateSimplePercent(amount, 0.06, period);

        else if (action == 2) {
            var = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + var);
    }
}
