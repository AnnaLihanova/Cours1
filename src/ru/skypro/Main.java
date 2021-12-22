package ru.skypro;

public class Main {

    public static void main(String[] args) {

        byte a = 1;
        short b = 30_278;
        int c = 687;
        long d = 1_000L;
        float tax = 5.25f;
        double pi = 3.1415926535;

        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float boxersWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + boxersWeight + " кг");
        float differenceBoxersWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров " + differenceBoxersWeight + " кг");

        byte bananas = 5;
        int bananasWeight = bananas * 80;
        byte milk = 2;
        int milkWeight = milk * 105;
        byte iceCream = 2;
        int iceCreamWeight = iceCream * 100;
        byte eggs = 4;
        int eggsWeight = eggs * 70;
        float breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака " + breakfastWeightKg + " кг");

        byte loseWeight = 7;
        int loseWeightGr= loseWeight * 1000;
        short dietOne = 250;
        short dietTwo = 500;
        int daysDietOne = loseWeightGr / dietOne;
        System.out.println("При сбросе 250 гр/день потребуется " + daysDietOne + " дней");
        int daysDietTwo = loseWeightGr / dietTwo;
        System.out.println("При сбросе 500 гр/день потребуется " + daysDietTwo + " дней");
        int averageDays = (daysDietOne + daysDietTwo) / 2;
        System.out.println("Среднее количество дней для сброса веса - " + averageDays);

        int MashaSalary = 67_760;
        double increaseMasha = MashaSalary * 0.1;
        double MashaNewSalary = MashaSalary + increaseMasha;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей в месяц");
        double yearMS = MashaSalary * 12;
        double yearMNS = MashaNewSalary * 12;
        double increaseMashaIncome = yearMNS - yearMS;
        System.out.println("Годовой доход Маши вырос на " + increaseMashaIncome + " рублей");
        int DenisSalary = 83_690;
        double increaseDenis = DenisSalary * 0.1;
        double DenisNewSalary = DenisSalary + increaseDenis;
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей в месяц");
        double yearDS = DenisSalary * 12;
        double yearDNS = DenisNewSalary * 12;
        double increaseDenisIncome = yearDNS - yearDS;
        System.out.println("Годовой доход Дениса вырос на " + increaseDenisIncome + " рублей");
        int KristinaSalary = 76_230;
        double increaseKristina = KristinaSalary * 0.1;
        double KristinaNewSalary = KristinaSalary + increaseKristina;
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей в месяц");
        double yearKS = KristinaSalary * 12;
        double yearKNS = KristinaNewSalary * 12;
        double increaseKristinaIncome = yearKNS - yearKS;
        System.out.println("Годовой доход Кристины вырос на " + increaseKristinaIncome + " рублей");
    }
}
