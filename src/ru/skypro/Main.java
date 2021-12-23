package ru.skypro;

public class Main {

    public static void main(String[] args) {

        byte a = 1;
        short b = 30_278;
        int c = 687;
        long d = 1_000L;
        float tax = 5.25f;
        double pi = 3.1415926535;
        char r = 5;
        boolean g = true;


        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float boxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + boxersWeight + " кг");
        float differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров " + differenceBoxersWeight + " кг");

        byte bananasNumber = 5;
        int bananasWeight = bananasNumber * 80;
        int milkVolumeMl = 200;
        int oneHundredMilkMlToGr = 105;
        int milkWeight = (milkVolumeMl / 100) * oneHundredMilkMlToGr;
        byte iceCreamNumber = 2;
        int iceCreamWeight = iceCreamNumber * 100;
        byte eggsNumber = 4;
        int eggsWeight = eggsNumber * 70;
        float breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака " + breakfastWeightKg + " кг");

        byte loseWeight = 7;
        int loseWeightGr= loseWeight * 1000;
        short firstDietGrPerDay = 250;
        short secondDietGrPerDay = 500;
        int daysFirstDiet = loseWeightGr / firstDietGrPerDay;
        System.out.println("При сбросе 250 гр/день потребуется " + daysFirstDiet + " дней");
        int dayssecondDiet = loseWeightGr / secondDietGrPerDay;
        System.out.println("При сбросе 500 гр/день потребуется " + dayssecondDiet + " дней");
        int averageDays = (daysFirstDiet + dayssecondDiet) / 2;
        System.out.println("Среднее количество дней для сброса веса - " + averageDays);

        double salaryIncreaseCoefficient = 0.1;
        int mashaSalary = 67_760;
        double increaseMasha = mashaSalary * salaryIncreaseCoefficient;
        double mashaNewSalary = mashaSalary + increaseMasha;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей в месяц");
        double basicYearSalaryMasha = mashaSalary * 12;
        double increasedYearSalaryMasha = mashaNewSalary * 12;
        double increaseMashaIncome = increasedYearSalaryMasha - basicYearSalaryMasha;
        System.out.println("Годовой доход Маши вырос на " + increaseMashaIncome + " рублей");
        int denisSalary = 83_690;
        double increaseDenis = denisSalary * salaryIncreaseCoefficient;
        double denisNewSalary = denisSalary + increaseDenis;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей в месяц");
        double basicYearSalaryDenis = denisSalary * 12;
        double increasedYearSalaryDenis = denisNewSalary * 12;
        double increaseDenisIncome = increasedYearSalaryDenis - basicYearSalaryDenis;
        System.out.println("Годовой доход Дениса вырос на " + increaseDenisIncome + " рублей");
        int kristinaSalary = 76_230;
        double increaseKristina = kristinaSalary * salaryIncreaseCoefficient;
        double kristinaNewSalary = kristinaSalary + increaseKristina;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей в месяц");
        double basicYearSalaryKristina = kristinaSalary * 12;
        double increasedYearSalaryKristina = kristinaNewSalary * 12;
        double increaseKristinaIncome = increasedYearSalaryKristina - basicYearSalaryKristina;
        System.out.println("Годовой доход Кристины вырос на " + increaseKristinaIncome + " рублей");
    }
}
