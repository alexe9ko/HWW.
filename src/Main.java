public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" );
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
        System.out.println(" Разница в ввесе " + d + " кг." );
        var e = b % a;
        System.out.println(e);
        var hours = 640;
        var one = 8;
        var total = hours / one;
        System.out.println(" Всего сотрудниковс в компании - " + total + " человек " );
        var more = total + 94;
        var once = hours / more;
        System.out.println("  Если в компании работает " + more + " человек, то всего " + once + " часов может быть поделено между сотрудниками " );


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
        System.out.println(" На каждого ученика расчитано " + one1 + " листов бумаги" );

        int power = 8;
        int twenty = power * 20;
        System.out.println(" За 20 минут машина произвела " + twenty + " штук бутылок" );
        int day = 60 * 24 * power;
        System.out.println(" За сутки машина произвела " + day + " штук бутылок" );
        int threeDays = day * 3;
        int month = day * 30;
        System.out.println(" За три дня машина произвела " + threeDays + " штук бутылок" );
        System.out.println(" За месяц машина произвела " + month + " штук бутылок" );

        int pots = 120;
        int potsClass = pots / 6;
        int whitePots = potsClass * 2;
        int brownPots = potsClass * 4;
        System.out.println("В школе, где " + potsClass + " классов, нужно " + whitePots + " банок белой краски и " + brownPots + " банок коричневой краски" );


        int banana = 80;
        int milk = 105;
        int iceCream = 50;
        int agg = 70;
        int totalWeight = banana * 5 + milk * 2 + iceCream * 2 + agg * 4;
        float kg = totalWeight / 1000f;
        System.out.println(" Общий вес продуктов " + totalWeight + " грамм или " + kg + " килограмм" );


        int minimal = 250;
        int maximal = 500;
        var result = 7000;
        int low = result / minimal;
        int higth = result / maximal;
        System.out.println(" При потере веса 250 грамм в день потребуется " + low + " дней, а при петере веса по 500 грамм в день, потребуется " + higth + " дней" );


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
        System.out.println(" Маша теперь получает " + upM + " рублей, годовой доход вырос на " + upYearM + " рублей" );
        System.out.println(" Денис теперь получает " + upD + " рублей, годовой доход вырос на " + upYearD + " рублей" );
        System.out.println(" Кристина теперь получает " + upK + " рублей, годовой доход вырос на " + upYearK + " рублей" );


    }
}

