public class Main {
    public static void main(String[] args) {

        // Задача №1
        byte b = 1;
        System.out.println(b);
        short s = 222;
        System.out.println(s);
        int i = 33333;
        System.out.println(i);
        long l = 4000000000L;
        System.out.println(l);
        float f = 5.1f;
        System.out.println(f);
        double d = 6.1;
        System.out.println(d);

        // Задача №2
        float f1 = 27.12f;
        System.out.println(f1);
        long l1 = 987_678_965_549L;
        System.out.println(l1);
        double d1 = 2.786 ;
        System.out.println(d1);
        short s1 = 569;
        System.out.println(s1);
        short s2 = -159;
        System.out.println(s2);
        int i1 = 27897;
        System.out.println(i1);
        byte b1 = 67;
        System.out.println(b1);

        // Задача №3
        byte ludPav = 23;
        byte annSer = 27;
        byte ektAnd = 30;
        short paper = 480;
        int totalStud = ludPav + annSer + ektAnd;
        // можно было бы и так  int paperForStudent = paper / (ludPav + annSer + ektAnd);
        // но у нас учеба , поэтому делаем последовательно
        int paperForStudent = paper / totalStud ;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги.");

        // Задача №4
        byte twoMin = 2;
        byte twentyMin = 20;
        byte day = 1;
        byte threeDay = 3;
        byte oneMonth = 30 ;
        byte productivityTwoMinutes = 16;
        int productivityOneMinutes = productivityTwoMinutes/ twoMin;
        int productivityTwenty = twentyMin * productivityOneMinutes;
        System.out.println("За " + twentyMin + " минут машина произвела " + productivityTwenty + " штук бутылок");
        int productivityDay = day * 24 * 60 *  productivityOneMinutes;
        System.out.println("За " + day + " сутки машина произвела " + productivityDay + " штук бутылок");
        int productivityThreeDay = threeDay * 24 * 60 * productivityOneMinutes;
        System.out.println("За " + threeDay + " дня машина произвела " + productivityThreeDay + " штук бутылок");
        int productivityOneMonth = 30 * 24 * 60 * productivityOneMinutes;
        System.out.println("За " + oneMonth + " месяц машина произвела " + productivityOneMonth + " штук бутылок");

        // Задача №5
        byte totalPaint = 120;
        byte brownColorClass = 4;
        byte whiteColorClass = 2;
        byte totalClass = (byte) (totalPaint / (brownColorClass + whiteColorClass));
        byte totalBrown = (byte) (totalClass * brownColorClass);
        byte totalWhite = (byte) (totalClass * whiteColorClass);
        System.out.println("В школе где " + totalClass + " классов , нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

        // Задача №6
        byte bananaQuantiy = 5;
        short milkQuantiy = 200;
        byte iceCrimeQuantiy = 2;
        byte eggQuantiy = 4;
        byte bananaGram = 80;
        byte milkGram = 105;
        float transformationRatio =  milkGram / 100f; // 1.05 это коэффициент миллилитров к граммам
        byte iceCrimeGram = 100;
        byte eggGramm = 70;
        short weightBanana = (short) (bananaGram * bananaQuantiy);
        float weightMilk =  milkQuantiy * transformationRatio;
        short weightIceCrime = (short) (iceCrimeQuantiy * iceCrimeGram);
        short weithtEgg = (short) (eggQuantiy * eggGramm);
        short weightGoodLuckCocktailToilet = (short) (weightBanana + weightMilk + weightIceCrime + weithtEgg);
        System.out.println("Вес коктеля равен " + weightGoodLuckCocktailToilet + " граммов");
        float weightCocktailKg = weightGoodLuckCocktailToilet / 1000f;
        System.out.println("Вес коктеля равен " + weightCocktailKg + " кг");

        // Задача №7
        byte needReset = 7;
        float slowWeightLoss = 250 / 1000f;
        float fastWeightLoss = 500 / 1000f;
        byte needDaySlowWeightLoss = (byte) (needReset / slowWeightLoss) ;
        byte needDayFastWeightLoss = (byte) (needReset / fastWeightLoss);
        float averageWeightLoss = (float) ((fastWeightLoss - slowWeightLoss) / 2 + slowWeightLoss);
        byte needDayAverageWeightLoss = (byte) (needReset / averageWeightLoss);
        System.out.println("Если спортсмен будет терять по " + slowWeightLoss + " кг в день, то ему потребуется " + needDaySlowWeightLoss + " дней.");
        System.out.println("Если спортсмен будет терять по " + fastWeightLoss + " кг в день, то ему потребуется " + needDayFastWeightLoss + " дней.");
        System.out.println("Если спортсмен будет терять по " + averageWeightLoss + " кг в день, то ему потребуется " + needDayAverageWeightLoss + " дней.");

        // Задача №8
        int mishaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        byte increaseSalary = 10 ;
        int increaseSalaryMisha = mishaSalary + mishaSalary / increaseSalary;
        int salaryDifferenceMisha = ( increaseSalaryMisha - mishaSalary ) * 12;
        System.out.println("Маша теперь получает " + increaseSalaryMisha + " рублей. Годовой доход вырос на " + salaryDifferenceMisha + " рублей");
        int increaseSalaryDenis = denisSalary + denisSalary / increaseSalary;
        int salaryDifferenceDenis = ( increaseSalaryDenis - denisSalary ) * 12;
        System.out.println("Денис теперь получает " + increaseSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        int increaseSalaryChristina = christinaSalary + christinaSalary / increaseSalary;
        int salaryDifferenceChristina = ( increaseSalaryChristina - christinaSalary ) * 12;
        System.out.println("Кристина теперь получает " + increaseSalaryChristina + " рублей. Годовой доход вырос на " + salaryDifferenceChristina + " рублей");







    }
}