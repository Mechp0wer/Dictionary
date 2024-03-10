package Help;

public class Enternet {
    public static void main(String[] args) {
//        //создаем переменные и присваиваем им значения
//        int a = 2;
//        int b = 3;
//        int c = a + b;
//        System.out.println("Сумма a и b = " + c);
//        //Найдем периметр квадрата
//        int d = 4;
//        System.out.println("Периметр квадрата со стороной d => P = " + 4 * d);
//        //Переменная определяется и объявляется одновременно:
//        short  b;
//        b = 3;
        // Домашнее задание
        // - найти площадь и периметр квадрата
        // - найти площадь и периметр прямоугольника
        // - найти площадь и периметр куба


        //Квадрат и прямоугольник
//        int x = 5; //длина 1 стороны
//        int y = 6; //длина 2 стороны
//        int s = x * y; //площадь
//        int p = (x + y) * 2;
//        System.out.println("Площадь =" +s);
//        System.out.println("Периметр =" +p);
        //Куб
//        int x = 3; //длина 1 стороны
//        int s = (x * x) * 6; //площадь куба
//        int p = x * 12; //периметр куба
//        System.out.println("Площадь куба =" +s);
//        System.out.println("Периметр куба =" +p);
        // - найти кол-во зерен на шахматной доске, если
        //на первую клетку положить одно зернышко, на
        //вторую клетку два зернышка, на третью в два раза
        //больше, чем на предыдущей, т.е. 4 и так далее...
        // Шахманая доска 8 * 8 = 64 клетки
//        long n = 64;
//        long sum = 1;
//        for (long i = 0; i <= n; i++) {
//            sum += sum + sum + i;
//        } System.out.println(sum);
//         double переменная
//        final double PI = 3.14;
//        // final - используется для "финализации переменной,"
//        // теперь переменной PI нельзя присвоить другой значение
//        double r = 8.2;
//        double k = r * r;
//        double s = PI * r * r;
//        System.out.println("Промежуточный вариант - " +k);
//        System.out.println("Конечный вариант - " +s);
//        //Степень, где 2 число, 4 степень
//        double a = 2;
//        double b = 4;
//        double c = Math.pow(a, b);
//        System.out.println(c);
        // Задача
//        int var1 = 5;
//        int var2 = 2;
//        int var3 = var1 / var2;
//        System.out.println("Int Var3 = " + var3);
//        int min = 30;
//        int max = 100;
//        int result = (int) (Math.random() * (max - min + 1) + min);
//         System.out.println(result);
//Написать программу для вычисления площади круга.!
//Найти длину окружности.!
//Написать формулу вычисления стоимости Евро.!
//если курс Евро к Доллару 1,1.
//Найти соотношение площади Беларуси к площади Украины.
//Найти, во сколько раз площадь Москвы больше площади Берлина.
//Если клиент положил в банк 1000€ под 3,5%,
//какая сумма будет его ждать через семь лет?
        //ПЛОЩАДЬ КРУГА
//       final double Pi = 3.14;
//       double r = 4.25;
//       double sCircle = Pi * (r * r);
//       System.out.println(sCircle);
        //ДЛИНА ОКРУЖНОСТИ
//        final double Pi = 3.14;
//        double r =4;
//        double d = 2 * r;
//        double S = Pi * d;
//        System.out.println("Длина окружности = " +S);
//      //Курс Евро к Доллару, коефицент 1.1 формула, Евро дороже доллара
//        double dollar = 2;
//        double euro = dollar * 1.1;
//        System.out.println("Евро стоит = " +euro);
        //Найти соотношение площади Беларуси (207600 км) к площади Украины (603628 км)
//        double sBelarus = 207600;
//        double sUkraine = 603628;
//        double ratio = sBelarus /  sUkraine;
//        System.out.println("Соотношение площади Белоруссии к Украине равно " +ratio);
        //Найти, во сколько раз площадь Москвы (2511 км) больше площади Берлина (891,8 км)
//        double sMoscow = 2511;
//        double sBerlin = 891.8;
//        double answer = sMoscow / sBerlin;
//        System.out.println("Площадь Москвы больше площади Берлина в " +answer);
        //Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
//        double bank = 4;
//        double client = 1000;
//        double finishMoney = (client * bank / 100 * 7) + client;
//        System.out.println(finishMoney);
//        int result = (int) Math.random();
        //ДЛИНА СИМВОЛОВ В КАВЫЧКАХ, ФОРМУЛА
//        int n = "Mech Power".length();
//        System.out.println(n);
        //КОЛИЧЕСТВО МАССИВА (СКОБОК)
//        String[] array = {"Tic", "Tac", "Toe",
//        "Tyc"};
//        int n = array.length;
//        System.out.println(n);
//         int[] myArray;
//         Object[] arrayOfObjects;
//         int[] myArray; //Объявление массива
//         myArray = new int[10]; //Создание массива, выделение на него памяти на 10 ячеек
//         int[] myArray = new int[10];//Объявление и выделение памяти "в одном флаконе"
        //после создания массива с помощью NEW, в его ячейках
        //записаны значения по умолчанию, пример
        //boolean - false; int - 0; ссылки - null;

// int[] array = {'1', '2', '3', '4', '5', '6', '7'}; //Одинарные Кавычки на символах //Двойные кавычки на буквах
//        System.out.println("\"Khal Drogo's favorite word is \"athjahakar\"\""); - писать в кавычках в выводе информации

// System.out.println("H" + "a"); - собирает Символы
// System.out.println('H' + 'a'); - собирает по символам тип Char, то есть смотрим таблицу символов (включая высокие
//и маленькие буквы)
//     -   char ch = 'a'; //Типу char задаем переменную, потом пишем чтобы к этой переменной он добавил 1, и он показывает следующий символ по таблице
//        ch++;
//        System.out.println(ch);
//     -   System.out.println((int) 'A' + ";" + ((int) 'a')); /// ФОРМУЛА показывания числового значения символов в char
//     -   char ch = 'g'; // Дано, переменная ch = символу 'g', что является значением 103, если ch > 'a', написать "Yes"
//        if (ch > 'a');{
//        System.out.println("Yes");}
//    - char c1 = '3'; // Он же 51; //Пока не в мой уровень
//     //вызываем статическую функцию digit
//     int d = Character.digit(c1, 10);
//     System.out.println("Square of " + c1 + " is " + d * d);
//     char c2 = 'a'; //Она же 97;
//     Character ch = new Character(c2); //дальше работа с объектом ch
//     if (Character.isLetter(c2)) System.out.println(c2 + " is letter");
//     System.out.println("Capitalized " + ch.charValue() + " is " + Character.toUpperCase(c2));
     //Работа со строками, используем класс String и StringBuffer
//      -  String s = "abc";
//        s = s.replace('a', 'b');
//        System.out.println(s);
//        StringBuffer s = new StringBuffer("abc");
//        s.replace(0, 2, "def"); //с какого по какой, на что менять
//        System.out.println(s);
//      -  char[] chs = {'a', 'b', 'c', 'e', 'z', 'k'}; //Пока не в мой уровень
//        String str = new String(chs, 3, 2);
//        System.out.println(str);
      //Длина строки
//      -  System.out.println("abc5 6".length()); // Считает количество символов в кавычках, пробел идет тоже как символ
      //Сравнение строк
        //Используется функция equals
        // if (s1.equals (s2))..// - выдержка из констекста
      //Добавление к строке, числа
//      -  String str = "2*12=";
//        str = str + 24;
//        System.out.println(str);

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
//        //Вывод в консоль// - Look this: MechPower

      //Функция изменения симвлов в верхний (.toUpperCase), либо нижний (.toLowerCase) регистр

//        String s = new String("Добро пожаловать на сайт MechPower!");
//        System.out.print("Верхнее преобразование '.toUpperCase' - ");
//        System.out.println(s.toUpperCase());
//        System.out.print("Нижнее преобразование '.toLowerCase' - ");
//        System.out.println(s.toLowerCase());
          //Вывод в консоль// -
        //Верхнее преобразование '.toUpperCase' - ДОБРО ПОЖАЛОВАТЬ НА САЙТ MECHPOWER!
        //Нижнее преобразование '.toLowerCase' - добро пожаловать на сайт mechpower!

//        String s = "boo:and:foo";
//        s.split(":");
//        System.out.println(s);





























    }
}
