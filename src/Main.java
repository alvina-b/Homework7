public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("  Задача 1");
        int savings = 15000;
        int deposit = 0;
        int month = 0;
        while (deposit <= 2459000) {
            deposit = deposit + deposit / 100;
            deposit = deposit + savings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей.");
        }
        System.out.println("Для накопления суммы с учетом процентов " + deposit + " потребуется " + month + " месяцев.");

        //Задача 2
        System.out.println("  Задача 2");
        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(i1 + " ");
            i1++;
        }
        System.out.println();
        int i2 = 10;
        for (; i2 > 0; i2--) {
            System.out.print(i2 + " ");
        }
        System.out.println();
        //Задача 3.
        System.out.println("  Задача 3");
        double population = 12_000_000;
        double birthRate = 17;
        double mortality = 8;
        for (int i = 1; i <= 10; i++) {
            double growth = (birthRate - mortality) / 1000;
            population = population + population * growth;
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек.");
        }
        //Часть 2. Задача 1,2.
        System.out.println("  Часть 2. Задача 1.");
        int savingsV = 15000;
        int depositV = 0;
        int i3 = 0;
        for (; depositV <= 12_000_000; i3++) {
            depositV = depositV + depositV * 7 / 100;
            depositV = depositV + savingsV;
            if (i3 % 6 == 0) {
                System.out.println("Месяц " + i3 + ", сумма накоплений равна " + depositV + " рублей.");
            }
        }
        System.out.println("Для накопления суммы с учетом процентов " + depositV + " потребуется " + i3 + " месяцев.");
        //Часть 2. Задача 3.
        System.out.println("  Часть 2. Задача 3.");
        int savingsVas = 15000;
        int depositVas = 0;
        int i4 = 0;
        for (; i4 < 108; i4++) {
            depositVas = depositVas + depositVas * 7 / 100;
            depositVas = depositVas + savingsVas;
            if (i4 % 6 == 0) {
                System.out.println("Месяц " + i4 + ", сумма накоплений равна " + depositVas + " рублей.");
            }
        }
        System.out.println("Итого за  " + i4 + " месяцев сумма накоплений равна " + depositVas + " рублей ");

        //Часть 2. Задача 4.
        System.out.println("  Часть 2. Задача 4.");
        int date = 2;
        while (date <= 31) {
            System.out.println("Сегодня пятница, " + date + " число. Необходимо подготовить отчет.");
            date += 7;
        }
        //Часть 3. Задача 1.
        System.out.println("Часть 3. Задача 1.");
        int yearNow = 2022;
        int yearLast = yearNow - 200;
        int yearFuture = yearNow + 100;
        for ( yearNow = yearLast; yearNow <= yearFuture; yearNow ++ ){
            if (yearNow % 79 == 0){
                System.out.println(yearNow);
            }
        }
        //Часть 3. Задача 2.
        System.out.println("Часть 3. Задача 2.");
          for ( int i = 2; i <= 2; i++) {
            for (int z = 1; z <= 10; z++)
                       System.out.println(i + " * " + z + " = " + i * z);
        }
    }
}