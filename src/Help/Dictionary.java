package Help;

public class Dictionary {
    public static void main(String[] args) {

        //// Ш П А Р Г А Л К А    З Н А Н И Й \\\\

        //Целочисленный тип данных

//        //Byte - байт
//        byte maxByte = 127;
//        byte minByte = -128;
//        //Short - короткое число, состоит из 2 байт или из 16 битов
//        short maxShort = 32_767;
//        short minShort = -32_768;
//        //Integer - целое число, которое состоит из 4 байт или из 32 битов
//        int maxInteger = 2_147_483_647;
//        int minInteger = -2_147_483_648;
//        //Long - целое число, которое состоит из 8 байт или из 64 битов
//        long maxLong = 9_223_372_036_854_775_807L;
//        long minLong = -9_223_372_036_854_775_808L;
//        //Double - число с плавающей точкой, 64 byte
//        double myBottle = 1.5;
//        //Float - число с плавающей точкой, 32 byte
//        float cola = 0.33F;
//        // Логические значения (булевы значения)
//        //ИСТИНА -> true -> да -> 1
//        boolean answerOleg = true;
//        //Ложь -> false -> нет -> 0
//        boolean answerTamara = false;

        //Символьный тип данных

//        //Char - character (символ), 16 bit, таблица символов по CHAR, особое внимание на регистр букв H и h разные значения
//        char letter = 70;
//        char letter2 = 71;
//        System.out.println(letter);
//        System.out.println(letter2);
//        //Вывод консоль//
//        //F
//        //G
//        char ch = 'a'; //Типу char задаем переменную
//        ch++;          //Добавляем к этой переменной 1
//        System.out.println(ch);
//        //Вывод консоль//
//        //b
//        // ФОРМУЛА числового значения символов в char
//        System.out.println((int) 'A' + ";" + ((int) 'a')); //Значения вводятся в одиарные кавычки ' ';
//        //Вывод консоль//
//        //65;97

        //Переменные

//        int a = 2;
//        int b = 3;
//        int c = a + b;
//        System.out.println("Сумма a и b = " + c);
//        //Вывод консоль//
//        //Сумма a и b = 5

        //Конкатонация

//        String word1 = "HELLO ";
//        String word2 = "WORLD!";
//        String result = word1 + word2;
//        System.out.println(result);
//        //Вывод консоль//
//        //HELLO WORLD!

        //Инкремент

//        int x = 8;
//        x++;     //(прибавление на 1)
//        x += 10; //(прибавление на 10)
//        System.out.println(x);
//        //Вывод консоль//
//        //19

        //Декремент

//        int x = 8;
//        x--;    //(вичитание 1)
//        x -= 5; //(вычитание 5)
//        System.out.println(x);
//        //Вывод консоль//
//        //2

        //Сокращенная форма записи умножения и деления

//        int x = 5;
//        x *= 10; //(умножение)
//        x /= 2;  //(деление)
//        System.out.println(x);
//        //Вывод консоль//
//        //25

        //Возведение в степень

//        double a = 2; //число
//        double b = 4; //степень
//        double c = Math.pow(a, b);
//        System.out.println(c);
          //Вывод консоль//
          //16

        //Перенос строки (без этого идет последовательно)

//        System.out.print("a");
//        char newLine = '\n';
//        System.out.print(newLine);
//        System.out.print("b\n");
//        char tab = '\t';
//        char escape = '\\';
//        System.out.println(escape);
//        //Вывод консоль//
//        //a
//        //b
//        //\
//        String hello = "hello\n";
//        String world = "world";
//        System.out.println(hello + world);
//        //Вывод панели//
//        //hello
//        //world

        //Убрать лишние пробелы
//
//        String word1 = "              HELLO ";
//        String trimmed = word1.trim();
//        System.out.println(trimmed);
//        //Вывод консоль//
//        //HELLO

        //Повторить строку n раз и добавить в нижний регистр (ДВА ДЕЙСТВИЯ)

//        String word1 = "HELLO ";
//        String repeated = word1.repeat(10).toLowerCase(); //(10) - означает кол-во повторений
//        System.out.println(repeated);
//        //Вывод консоль//
//        //hello hello hello hello hello hello hello hello hello hello

        //Функция замены .replace //s.replace//s.replaceAll//s.replaceFirst//

        //s.replace - замена указаных в первом апострофе символов на второй апостроф, причем символы меняются
          //все которые указаны
//        String s = "autoservice";
//        s = s.replace('e','j');
//        System.out.println(s);
//        //Вывод консоль// - autosjrvicj
        //s.replaceAll - замена в первой части двойных ковычек на вторую часть двойных ковычек, только то что указано
//        String s = "autoservice";
//        s = s.replaceAll("auto","brake");
//        System.out.println(s);
//        //Вывод консоль// - brakeservice
        //s.replaceFirst - заменяет первую подстроку данной строки, которая соответствует заданому регулярному
          //выражению, с данной заменой другими словами – метод в Java позволяет заменить первое
          //вхождение слова или словосочетания в строке
//        String s = new String("Добро пожаловать на OTNULYA.ru");
//        System.out.print("Look this: ");
//        System.out.println(s.replaceFirst("(.*)OTNULYA(.*)", "MechPower"));
//        //Вывод в консоль//
//        //Look this: MechPower

        //Функция изменения симвлов в верхний (.toUpperCase), либо нижний (.toLowerCase) регистр

//        String s = new String("Добро пожаловать на сайт MechPower!");
//        System.out.print("Верхнее преобразование '.toUpperCase' - ");
//        System.out.println(s.toUpperCase());
//        System.out.print("Нижнее преобразование '.toLowerCase' - ");
//        System.out.println(s.toLowerCase());
//        //Вывод в консоль//
//        //Верхнее преобразование '.toUpperCase' - ДОБРО ПОЖАЛОВАТЬ НА САЙТ MECHPOWER!
//        //Нижнее преобразование '.toLowerCase' - добро пожаловать на сайт mechpower!

        //Длина символов в кавычках, int выбрано, т.к. полученный результат является целочисленным, пробел идет в счет

//        int n = "Mech Power".length();
//        System.out.println(n);
//        //Вывод консоль//
//        //10

        //Количество ячеек массива

//        String[] array = {"Tic", "Tac", "Toe", "Tyc"};
//        int n = array.length;
//        System.out.println(n);
//        //Вывод консоль//
//        //4











    }
}
