package Help;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

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
//        ch++;          //Добавляем к этой переменной 1 и получаем следующий символ
//        System.out.println(ch);
//        //Вывод консоль//
//        //b
//        // ФОРМУЛА числового значения символов в char
//        System.out.println((int) 'A' + ";" + ((int) 'a')); //Значения вводятся в одиарные кавычки ' ';
//        //Вывод консоль//
//        //65;97

        //Значения int в "2"; "8"; "16"; системах исчесления, для примера взято число 43

//        int a1 = 0b00101011;    //двоичная система счисления (значения "0" и "1";)
//        System.out.println(a1);
//        //Вывод консоль//
//        //43
//
//        int a2 = 053;           //восьмиричная система счисления (значения от "0" до "8";)
//        System.out.println(a2);
//        //Вывод консоль//
//        //43
//
//        int a3 = 0x2b;          //шестнадцатиричная система счисления (значения от "0" до "9" и от "A" до "F";)
//        System.out.println(a3);
//        //Вывод консоль//
//        //43

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

        //Остаток от деления "%", при делении на переменных целых чисел "int"

//        int a = 11;
//        int b = 3;
//        int c = a/b;
//        int d = a%b;
//        System.out.println(c); //результат деления a/b
//        System.out.println(d); //результат остатка от деления a/b
//        //Вывод консоль//
//        //3
//        //2

        //Операторы сравнения "<", ">", "<=", ">=", "==", "!=";

//        int a = 3;
//        int b = 5;
//        System.out.println(a<b); //в данном типе либо "false", либо "true"
//        //Вывод консоль//
//        //true
//        int c = 5;
//        int d = 5;
//        System.out.println(c>=d); //в данном типе либо "false", либо "true"
//        //Вывод консоль//
//        //true
//        int e = 4;
//        int f = 6;
//        System.out.println(e==f); //в данном типе либо "false", либо "true"
//        //Вывод консоль//
//        //false
//        int h = 3;
//        int j = 7;
//        System.out.println(j!=h); //в данном типе либо "false", либо "true"
//        //Вывод консоль//
//        //true

        //Условный оператор "&&" = "and" = "и", является boolean значением

//        //  b1  //  b2  //  b3  //
//        // true // true // true // = true  //если все операторы равны "true", тогда "true"
//        // false// true // true // = false //если один из операторов равен "false", тогда всё выражение равно "false"
//        int a = 10;
//        int b = 50;
//        int c = 99;
//        int d = 100;
//        boolean e = a<b && ++c==d; //true&&true если начальное выражение равно true, java дальше не считает, поэтому "c" не меняется
//        System.out.println(e);     //при операторе &&
//        System.out.println(c);
//        //Вывод консоль//
//        //true
//        //100
//        int a1 = 10;
//        int b1 = 50;
//        int c1 = 99;
//        int d1 = 100;
//        boolean e1 = a1>b1 && ++c1==d1; //false&&true если начальное выражение равно false, java дальше считает, поэтому "c1" меняется
//        System.out.println(e1);         //при операторе &&
//        System.out.println(c1);
//        //Вывод консоль//
//        //false
//        //99
//
        // Логический оператор "&" = "and" = "и", является boolean значением

//        //  b1  //  b2  //  b3  //
//        // true // true // true // = true  //если все операторы равны "true", тогда "true"
//        // false// true // true // = false //если один из операторов равен "false", тогда всё выражение равно "false"
//        int a = 10;
//        int b = 50;
//        int c = 99;
//        int d = 100;
//        boolean e = a>b & ++c==d; //false&&true если начальное выражение равно false, java дальше считает, поэтому "c" меняется
//        System.out.println(e);    //при операторе &
//        System.out.println(c);
//        //Вывод консоль//
//        //false
//        //100

        //Условный оператор "||" = "or" = "или", является boolean значением

//        //  b1  //  b2  //  b3  //
//        // true // true // true // = true  //если все операторы равны "true", тогда "true"
//        // false// false// true // = false //если 1 или 2 из операторов равен "false", тогда всё выражение равно "true"
//        // false// false// false// = false //если все операторы равны "false", тогда "false"
//        int a = 10;
//        int b = 50;
//        int c = 99;
//        int d = 100;
//        boolean e = a<b || ++c==d; //true&&false если начальное выражение равно true, java дальше не считает, поэтому "c" не меняется
//        System.out.println(e);     //при операторе ||
//        System.out.println(c);
//        //Вывод консоль//
//        //true
//        //99
//        int a1 = 10;
//        int b1 = 50;
//        int c1 = 99;
//        int d1 = 100;
//        boolean e1 = a1>b1 || ++c1==d1; //false&&true если начальное выражение равно false, java дальше считает, поэтому "c1" меняется
//        System.out.println(e1);         //при операторе ||
//        System.out.println(c1);
//        //Вывод консоль//
//        //true
//        //100

        //Логический оператор "|" = "or" = "или", является boolean значением

//        //  b1  //  b2  //  b3  //
//        // false// false// true // = false //если 1 или 2 из операторов равен "false", тогда всё выражение равно "true"
//        // false// false// false// = false //если все операторы равны "false", тогда "false"
//        int a = 10;
//        int b = 50;
//        int c = 99;
//        int d = 101;
//        boolean e = a<b | ++c==d; //true&&false если начальное выражение равно true, java дальше считает, поэтому "c" меняется
//        System.out.println(e);    //при операторе |
//        System.out.println(c);
//        //Вывод консоль//
//        //true
//        //100

        // ??? //  Логический оператор "^" = "исключительный или" является boolean значением

//        //  b1  //  b2  //  b3  //
//        // true // true // true // = false //если все операторы равны "true", тогда всё выражение равно "false"
//        // false// false// false// = false //если все операторы равны "false", тогда всё выражение равно "false"
//        // false// false// true // = true  //если большее кол-во из операторов равено "false", тогда всё выражение равно "true"
//        // false// true // true // = false //если большее кол-во из операторов равено "false", тогда всё выражение равно "true"
//        boolean b1 = true;
//        boolean b2 = true;
//        boolean b3 = true;
//        boolean b4 = true;
//        System.out.println(b1^b2^b3^b4);
//        //Вывод консоль//
//        //false

        //Логический оператор "!", принимает противоположенное значение

//        boolean a1 = false;
//        boolean b1 = !a1;
//        System.out.println(b1);
//        //Вывод консоль//
//        //true

        //Возведение в степень

//        double a = 2; //число
//        double b = 4; //степень
//        double c = Math.pow(a, b);
//        System.out.println(c);
//        //Вывод консоль//
//        //16

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

        //Убрать лишние пробелы. (.trim())

//        String word1 = "              HELLO ";
//        String trimmed = word1.trim();
//        System.out.println(trimmed);
//        //Вывод консоль//
//        //HELLO

        //Обрезание. Вывод на панель части текста. (.substring ();)

//        String text = "Hello world!"; //12 символов
//        System.out.println(text.substring(0,7)); //где 0 первый символ, 7 последний символ(который не выводится)
//        //Вывод консоль//
//        //Hello w

        //Повторить строку n раз и добавить в нижний регистр (ДВА ДЕЙСТВИЯ)

//        String word1 = "HELLO ";
//        String repeated = word1.repeat(10).toLowerCase(); //(10) - означает кол-во повторений
//        System.out.println(repeated);
//        //Вывод консоль//
//        //hello hello hello hello hello hello hello hello hello hello

        //Функция замены .replace //s.replace//s.replaceAll//s.replaceFirst

        //s.replace - замена указаных в первом апострофе символов на второй, причем символы меняются все которые указаны
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
//        //выражению, с данной заменой другими словами – метод в Java позволяет заменить первое
//        //вхождение слова или словосочетания в строке
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

        //Массивы

//        String[] myArray; //Объявление массива
//        myArray = new String[4]; //Создание массива, выделение на него памяти на 4 ячеек
//        myArray[0] = "c";
//        myArray[1] = "a";
//        myArray[2] = "r";
//        myArray[3] = "s";
//        System.out.println(Arrays.toString(myArray));
//        //Вывод консоль//
//        //[c, a, r, s]
//        String[] myArray2 = new String[4];//Объявление и создание массива
//        myArray2[0] = "c";
//        myArray2[1] = "a";
//        myArray2[2] = "r";
//        myArray2[3] = "s";
//        System.out.println(Arrays.toString(myArray2));
//        //Вывод консоль//
//        //[c, a, r, s]
//        String[] myArrays3 = {"c", "a", "r", "s"};//Объявление и создание массива, а так же запись значений
//        System.out.println(Arrays.toString(myArrays3));
//        //Вывод консоль//
//        //[c, a, r, s]
//        //после создания массива с помощью NEW, в его ячейках записаны значения по умолчанию, пример
//        //boolean - false; int - 0; ссылки - null;

        //Количество ячеек массива

//        String[] array = {"Tic", "Tac", "Toe", "Tyc"};
//        int n = array.length;
//        System.out.println(n);
//        //Вывод консоль//
//        //4

        //Умножение в массиве

//        int[] array = {2, 3, 4};  //создаем, объявляем, записываем первый целочисленный массив
//        int[] array2 = {2, 3, 4}; //создаем, объявляем, записываем второй целочисленный массив
//        String[] array3 = new String[3]; //создаем, объявляем, записываем третий строчный массив
//        array3[0] = String.valueOf(Integer.parseInt(String.valueOf(array[0] * array2[0])));  //magic
//        array3[1] = String.valueOf(Integer.parseInt(String.valueOf(array[1] * array2[1])));  //magic
//        array3[2] = String.valueOf(Integer.parseInt(String.valueOf(array[2] * array2[2])));  //magic
//        System.out.println(Arrays.toString(array3));
//        //Вывод консоль//
//        //[4, 9, 16]

        //Вывод информации. System.out.println()

//        System.out.println("\"Khal Drogo's favorite word is \"athjahakar\"\"");//добавляет кавычки в классе String
//        //Вывод консоль//
//        //"Khal Drogo's favorite word is "athjahakar""
//        System.out.println("H" + "a");//собирает Символы
//        //Вывод консоль//
//        //На
//        System.out.println('H' + 'a');//Собирает по значению символов тип char, вкл высокий и низкий регистр
//        //Вывод на консоль//
//        //169
//        System.out.println("abc5 6".length());//Считает кол-во символов в двойных кавычках, вкл пробел
//        //Вывод консоль//
//        //6







        //В А Ж Н О Е\\
//        //При красном значении неправильно подобранного типа или класса, нужно нажать "Alt + Enter" и программа сама
          //подскажет какой тип данных можно испольховать! О Ч Е Н Ь   П О Л Е З Н Ы Й   Л А Й Ф Х А К   ! ! !


    }
}
