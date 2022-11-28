public class Main {
    public static void main(String[] args) {
        // Домашнее задание
        // Задание 1
        System.out.println("Задание 1");
        int firstIntVar = 2147483647;
        byte firstByteVar = 127;
        short firstShortVar = 32767;
        long firstLongVar = 9223372036854775807L;
        float firstFloatVar = 22.2f;
        double firstDoubleVar = 22.2;
        System.out.println("Значение переменной int: " + firstIntVar);
        System.out.println("Значение переменной byte: " + firstByteVar);
        System.out.println("Значение переменной short: " + firstShortVar);
        System.out.println("Значение переменной long: " + firstLongVar);
        System.out.println("Значение переменной float: " + firstFloatVar);
        System.out.println("Значение переменной double: " + firstDoubleVar);

        // Задание 2
        System.out.println("Задание 2");
        float floatVar = 27.12f;
        int intVar1 = 987;
        int intVar2 = 678;
        int intVar3 = 965;
        short shortVar = 549;
        byte byteVar = 2;
        short shortVar2 = 786;
        boolean flag = false;
        int intVar4 = 569;
        short shortVar3 = -159;
        short shortVar4 = 27897;
        byte byteVar3 = 67;

        // Задание 3
        System.out.println("Задание 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int allKids = firstClass + secondClass + thirdClass;
        short amountPaper = 480;
        int paperPerKid = amountPaper / allKids;
        System.out.println("На каждого ученика рассчитано " + paperPerKid + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");
        int machineEfficiency = 16; // Производительность за 2 минуты
        int machineEfficiency2 = machineEfficiency * 10; // Производительность за 20 минут
        int minuteInDay = 60 * 24;
        int machineEfficiency3 = minuteInDay * 8; // Производительность за сутки
        int machineEfficiency4 = minuteInDay * 3 * 8; // Производительность за 3 дня
        int machineEfficiency5 = minuteInDay * 30 * 8; // Производительность за месяц
        System.out.println("За 2 минуты машина произвела бутылок " + machineEfficiency + " штук");
        System.out.println("За 20 минут машина произвела бутылок " + machineEfficiency2 + " штук");
        System.out.println("За сутки машина произвела бутылок " + machineEfficiency3 + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + machineEfficiency4 + " штук");
        System.out.println("За месяц машины произвела бутылок " + machineEfficiency5 + " штук");

        // Задание 5
        System.out.println("Задание 5");
        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int perClass = white + brown;
        int classAmount = totalCans / perClass; // Всего классов - 20
        int totalWhite = white * classAmount; // Всего белой
        int totalBrown = brown * classAmount; // Всего коричневой
        System.out.println("В школе, где " + classAmount + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // Задание 6
        System.out.println("Задание 6");
        int bananaAmount = 5;
        int banana = 80;
        int milkAmount = 200;
        int milkPer100Ml = 105;
        int icecreamAmount = 2;
        int icecream = 100;
        int eggAmount = 4;
        int egg = 70;

        int totalBanana = bananaAmount * banana;
        int totalMilk = milkAmount / 100 * milkPer100Ml;
        int totalIcecream = icecreamAmount * icecream;
        int totalEgg = eggAmount * egg;
        int totalWeightGr = totalBanana + totalMilk + totalIcecream + totalEgg;
        int grPerKg = 1000;
        float totalWeightKg = totalWeightGr / (float)grPerKg;
        System.out.println("Итоговый вес: " + totalWeightKg + " кг");

        // Задание 7
        System.out.println("Задание 7");
        int weightInKg = 7;
        int weightInGr = 7 * 1000;
        int gr1 = 250;
        int gr2 = 500;
        int daysPerGr1 = weightInGr / gr1;
        int daysPerGr2 = weightInGr / gr2;
        System.out.println("Чтобы сбросить " + weightInKg + " кг, потребуется " + daysPerGr1 + " дней, если сбрасывать по " + gr1 + " грамм в день");
        System.out.println("Чтобы сбросить " + weightInKg + " кг, потребуется " + daysPerGr2 + " дней, если сбрасывать по " + gr2 + " грамм в день");

        // Задание 8
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int mashaIncreased = masha + (masha / 100 * 10);
        int mashaDifference = mashaIncreased % masha;

        int denisIncreased = denis + (denis / 100 * 10);
        int denisDifference = denisIncreased % denis;

        int kristinaIncreased = kristina + (kristina / 100 * 10);
        int kristinaDifference = kristinaIncreased % kristina;

        System.out.println("Маша теперь получает " + mashaIncreased + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisIncreased + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaIncreased + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");

    }
}