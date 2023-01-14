public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна рублей» " + total);

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        {
            System.out.println();
        }
        for (int n = 10; n >= 1; n--)
            System.out.print(n + " ");
        {
            System.out.println();
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        // сократил формулу из рождаемости вычел смертность
        for (int i = 0; i < 10; ++i) {
            population +=population/1000*9;
            {
                System.out.println(i+1 + " год ,численность населения составляет " + population + " человек");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int year = 0;
        for (total = 15000; total <= 12_000_000; total++) {
            total = total + (total / 100) * 7;
            salary = total + salary;
            year++;
            System.out.println(year + " год и сумма накоплений " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int money = 15000;
        int total = 0;
        int year = 0;
        for (total = 15000; total <= 12_000_000; total++) {
            total = total + (total / 100) * 7;
            money = total + money;
            year++;
            if (year % 6 == 0) {
                System.out.println(year + " год и сумма накоплений " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int money = 15000;
        int month = 0;
        for (month = 1; month <= 108; month++) {
            money = money + (money / 100) * 7;
            if (month % 6 == 0) {
                System.out.println(month + " месяц и сумма накоплений " + money);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        {
            for (; friday < 31; friday = friday + 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 1823;
        for (;year<2123;year++){
            if( year % 79 ==0){
                System.out.println(year);
            }
        }
    }
}