import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var a = 78.2;
        var b = 82.7;
        var c = a + b;
        System.out.println(" Общая масса двух бойцов " + c);
        var d = b - a;
        System.out.println(" Разница в ввесе " + d + " кг.");
        var e = b % a;
        System.out.println(e);
        var hours = 640;
        var one = 8;
        var total = hours / one;
        System.out.println(" Всего сотрудниковс в компании - " + total + " человек ");
        var more = total + 94;
        var once = hours / more;
        System.out.println("  Если в компании работает " + more + " человек, то всего " + once + " часов может быть поделено между сотрудниками ");


        byte g = 1;
        int h = 2;
        short j = 3;
        System.out.println("Значение переменной g с типом byte равно " + g);
        long k = 4;
        float l = 5.1f;
        double z = 6.1f;
        System.out.println(" Значение переменной h с типом int равно " + h);
        System.out.println("Значение переменной j с типом short равно " + j);
        System.out.println(" Значение переменной k с типом long равно " + k);
        System.out.println(" Значение переменной l с типом float равно " + l);
        System.out.println(" Значение переменной z с типом double равно " + z);
        float fl = 27.12f;
        long lo = 987678965549L;
        float fl1 = 2.786f;
        short sh = 569;
        short sh1 = -159;
        short sh2 = 27897;
        byte by = 67;
        int lp = 23;
        int ac = 27;
        int ea = 30;
        int tot = 480;
        int one1 = tot / (ea + lp + ac);
        System.out.println(" На каждого ученика расчитано " + one1 + " листов бумаги");

        int power = 8;
        int twenty = power * 20;
        System.out.println(" За 20 минут машина произвела " + twenty + " штук бутылок");
        int day = 60 * 24 * power;
        System.out.println(" За сутки машина произвела " + day + " штук бутылок");
        int threeDays = day * 3;
        int month = day * 30;
        System.out.println(" За три дня машина произвела " + threeDays + " штук бутылок");
        System.out.println(" За месяц машина произвела " + month + " штук бутылок");

        int pots = 120;
        int potsClass = pots / 6;
        int whitePots = potsClass * 2;
        int brownPots = potsClass * 4;
        System.out.println("В школе, где " + potsClass + " классов, нужно " + whitePots + " банок белой краски и " + brownPots + " банок коричневой краски");


        int banana = 80;
        int milk = 105;
        int iceCream = 50;
        int agg = 70;
        int totalWeight = banana * 5 + milk * 2 + iceCream * 2 + agg * 4;
        float kg = totalWeight / 1000f;
        System.out.println(" Общий вес продуктов " + totalWeight + " грамм или " + kg + " килограмм");


        int minimal = 250;
        int maximal = 500;
        var result = 7000;
        int low = result / minimal;
        int higth = result / maximal;
        System.out.println(" При потере веса 250 грамм в день потребуется " + low + " дней, а при петере веса по 500 грамм в день, потребуется " + higth + " дней");


        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        int procentM = salaryM / 10;
        int procentD = salaryD / 10;
        int procentK = salaryK / 10;
        int incomeM = salaryM * 12;
        int incomeD = salaryD * 12;
        int incomeK = salaryK * 12;
        int upM = salaryM + procentM;
        int upD = salaryD + procentD;
        int upK = salaryK + procentK;
        int incomeUpM = upM * 12;
        int incomeUpD = upD * 12;
        int incomeUpK = upK * 12;
        int upYearM = incomeUpM - incomeM;
        int upYearD = incomeUpD - incomeD;
        int upYearK = incomeUpK - incomeK;
        System.out.println(" Маша теперь получает " + upM + " рублей, годовой доход вырос на " + upYearM + " рублей");
        System.out.println(" Денис теперь получает " + upD + " рублей, годовой доход вырос на " + upYearD + " рублей");
        System.out.println(" Кристина теперь получает " + upK + " рублей, годовой доход вырос на " + upYearK + " рублей");


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

        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println(" Установите  облегченную версию приложения для IOS про ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println(" Установите  версию приложения для IOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид по ссылке");}

        int year=1584;
        if(year>1584&&((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)){
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");}

        int deliveryDistance=95;
        int days;
        if(deliveryDistance<=20){
            days=1;
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            days = 2;
        } else if (deliveryDistance>60&& deliveryDistance<=100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days!=-1) {
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println("Доставки нет");
        }

        int monthNumber=1;
        switch (monthNumber){
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

    }


}

