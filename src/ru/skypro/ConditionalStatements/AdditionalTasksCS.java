package ru.skypro.ConditionalStatements;

public class AdditionalTasksCS {
    public static void main(String[] args) {

        task6();
        task7();

    }

    private static void task6() {
        System.out.println("Задание 6");

        int ageClient = 19;
        int salaryClient = 58_000;
        int ageLimitCard = 0;
        double salarylimitCard = 0;
        if (ageClient < 23) {
            ageLimitCard = salaryClient * 2;
        } else {
            ageLimitCard = salaryClient * 3;
        }
        if (salaryClient >= 50_000 && salaryClient < 80_000) {
            salarylimitCard = salaryClient * 1.2;
        } else if (salaryClient >= 80_000) {
            salarylimitCard = salaryClient * 1.5;
        }
        double maxLimitCard = ageLimitCard + salarylimitCard;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + maxLimitCard + " рублей");
    }

    private static void task7() {
        System.out.println("Задание 7");

        int age = 25;
        double salary = 60_000;
        double wantedSum = 330_000;
        double loanRatePersent = 10;
        int loanTerm = 12;
        double maxPaymentPersent = 50;
        double maxPayment = (salary / 100) * maxPaymentPersent;
        if (age < 23) {
            loanRatePersent = loanRatePersent + 1;
        } else if (age < 30 && age >= 23) {
            loanRatePersent = loanRatePersent + 0.5;
        }
        if (salary > 80_000) {
            loanRatePersent = loanRatePersent - 0.7;
        }
        double creditSum = wantedSum + ((wantedSum / 100) * loanRatePersent);
        double loanPayment = creditSum / loanTerm;
        if (maxPayment >= loanPayment) {
            System.out.println("Максимальный платеж при зарплате " + salary + " равен " + maxPayment + " рублей.");
            System.out.println("Платеж по кредиту " + loanPayment + " рублей. Кредит одобрен.");
        } else {
            System.out.println("Максимальный платеж при зарплате " + salary + " равен " + maxPayment + " рублей.");
            System.out.println("Платеж по кредиту " + loanPayment + " рублей. В кредите отказано.");
        }
    }
}
