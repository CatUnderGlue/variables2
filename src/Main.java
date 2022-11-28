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

    }
}