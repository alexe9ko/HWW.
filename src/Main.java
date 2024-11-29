public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int ages = 19;
        if (ages >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("нужно подождать");
        }
        int temp = 7;
        if (temp >= 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        } else {
            System.out.println("Надень шапку, холодно");
        }
        int speed = 59;
        if (speed < 60) {
            System.out.println("Можно ездить спокойно");
        } else {
            System.out.println(" Придется заплатить штраф");
        }
        int peopleEge = 6;
        boolean garden = peopleEge >= 2 && peopleEge <= 6;
        if (garden) {
            System.out.println(" Если возраст человеека равен " + peopleEge + " , то ему нужно ходить в детский сад ");
        }
        boolean skcool = peopleEge > 7 && peopleEge < 18;
        if (skcool) {
            System.out.println(" Если возраст человека равен " + peopleEge + " ,то ему нужно идти в школу");
        }
        boolean college = peopleEge >= 18 && peopleEge <= 24;
        if (college) {
            System.out.println("Если возраст человека равен " + peopleEge + " , то его место в университете");
        }
        boolean work = peopleEge >= 25;
        if (work) {
            System.out.println("Если возраст человека равен " + peopleEge + " то ему нужно ходить на работу");
        }

        int child = 14;
        boolean not = child < 5;
        if (not) {
            System.out.println(" Нельзя кататься на атракционе");
        }
        boolean yesBut = child > 5 && child < 14;
        if (yesBut) {
            System.out.println("Можно кататься на атракционе в сопровождении взрослого");
        }
        boolean yes = child >= 14;
        if (yes) {
            System.out.println(" Можно кататься на атракционе без сопровождения взрослого");
        }


        int trainPalace = 102;
        int passager = 40;
        int seat = 60;
        int freePalace = trainPalace - passager;
        int stay = trainPalace - seat;

        if (freePalace == 0) {
            System.out.println("Вагон полон");
        } else if (freePalace > 0 && freePalace <= 40) {
            System.out.println(" В вагоне осталось " + freePalace + " стоячих мест ");
        } else if (freePalace > 40 && freePalace < 102) {
            System.out.println("В вагоне осталось " + (freePalace - seat) + " сидячих и " + stay + " стоячих мест");
        }


        int one11 = 7;
        int two22 = 4;
        int three33 = 2;
        if (one11 > two22 && one11 > three33) {
            System.out.println("Больше " + one11);
        } else if (two22 > three33 && two22 > one11) {
            System.out.println("Больше  " + two22);
        } else if (three33 > one11 && three33 > two22) {
            System.out.println(" Больше " + three33);
        }

        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите  облегченную версию приложения для IOS про ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите  версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид по ссылке");
        }

        int year = 1584;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days != -1) {
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не верный номер месяца!");


        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(+i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(+i);
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(+i);
        }

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(+i);
        }

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(+i + " год является високосным");
        }

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(+i);
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(+i);
        }

        int salary = 29000;
        int tatal = 0;
        for (int i = 1; i <= 12; i++) {
            tatal = tatal + tatal / 100;
            tatal = tatal + salary;
            System.out.println("месяц " + i + ", сумма накоплений " + tatal);

        }
        int tab = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            tab = tab + 2;
            System.out.println("2*" + i + "=" + tab);
        }

    }


}
