package Help;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

public class Dictionary {
    public static void main(String[] args) {

        //// Ш П А Р Г А Л К А    З Н А Н И Й \\\\

  //Зарезервированные слова в Idea(Java)\\ Список

        /*
        abstract
        assert
        boolean - тип данных, 2 параметра true и false
        break - оператор перехода, досрочный выход из цикла
        byte - тип коротких данных, от -128 до 127
        case
        catch
        const
        continue
        default - стандартное значение, значение по умолчанию
        do
        double - тип дробных данных, после запятой 8 знаков
        else - statement "иначе", работает только с statement "if"
        enum
        extends
        false - тип данных boolean
        final - конечный тип, не зменяемое значение
        finally
        float - тип дробных данных, после запятой 5 знаков
        for
        goto
        if - statement "если"
        implements
        import
        instanceof
        int - частоиспользуемый целочисленный тип данных
        interface
        long - длинный целочисленный тип данных, продолжение int
        native
        new - создание нового, например объекта класса
        null - default значение типа данных String
        package - папка, лежит над class
        private - access modifier, тип доступа, в данном случае работает только в class
        protected - access modifier, тип доступа, в данном случае работает как default, работает в пределах папки и в классах наследниках
        public - access modifier, тип доступа, в данном случае работает везде и всюду при правильном адресе на него
        return - оператор перехода, вывод значения в методе, только если он не void
        short - символьный тип данных, где каждому символу присвоен свой порядковый номер
        static - статическое состоянии переменной/конструктора/метода, доступен для всех
        strictfp
        super
        switch - означает, что вы будете, что-то с чем-то сравнивать
        synchronized
        this - дословно "этот", ссылка на предидущие параметры/конструкторы/методы
        throw
        trows
        transient
        true - значение boolean переменной
        try
        void - пустота, при использовании в методе, не возвращает значение для дальнейшей работы
        volatile
        while
        */

        //Примитивный тип данных (primitive data types)

        /*
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;
        //Short - короткое число, состоит из 2 байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;
        //Integer - целое число, которое состоит из 4 байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;
        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        //Double - число с плавающей точкой, 64 byte
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32 byte
        float cola = 0.33F;
        // Логические значения (булевы значения)
        //ИСТИНА -> true -> да -> 1
        boolean answerOleg = true;
        //Ложь -> false -> нет -> 0
        boolean answerTamara = false;
        */

        //Default values (Дефолтные значения или значения по умолчанию)

        /*
        Для - (byte, short, int, long) == 0; для (float, double) == 0.0;
        для (boolean) == false; для (char) == '\u0000' или '0';
        для Reference типов данных (String, BankAccount, Car, House) == null (ничто);
        */

        //Символьный тип данных

        /*
        //Char - character (символ), 16 bit, таблица символов по CHAR, особое внимание на регистр букв H и h разные значения
        char letter = 70;
        char letter2 = 71;
        System.out.println(letter);
        System.out.println(letter2);
        //Вывод консоль//
        //F
        //G
        char ch = 'a'; //Типу char задаем переменную
        ch++;          //Добавляем к этой переменной 1 и получаем следующий символ
        System.out.println(ch);
        //Вывод консоль//
        //b
        // ФОРМУЛА числового значения символов в char
        System.out.println((int) 'A' + ";" + ((int) 'a')); //Значения вводятся в одиарные кавычки ' ';
        //Вывод консоль//
        //65;97
        */

        //Значения int в "2"; "8"; "16"; системах исчесления, для примера взято число 43

        /*
        int a1 = 0b00101011;    //двоичная система счисления (значения "0" и "1";)
        System.out.println(a1);
        //Вывод консоль//
        //43

        int a2 = 053;           //восьмиричная система счисления (значения от "0" до "8";)
        System.out.println(a2);
        //Вывод консоль//
        //43

        int a3 = 0x2b;          //шестнадцатиричная система счисления (значения от "0" до "9" и от "A" до "F";)
        System.out.println(a3);
        //Вывод консоль//
        //43
        */

        //Переменные

        /*
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println("Сумма a и b = " + c);
        //Вывод консоль//
        //Сумма a и b = 5
        */

        //Конкатонация

        /*
        String word1 = "HELLO ";
        String word2 = "WORLD!";
        String result = word1 + word2;
        System.out.println(result);
        //Вывод консоль//
        //HELLO WORLD!
        */

        //Инкремент

        /*
        int x = 8;
        x++;     //(прибавление на 1)
        x += 10; //(прибавление на 10)
        System.out.println(x);
        //Вывод консоль//
        //19
        */

        //Декремент

        /*
        int x = 8;
        x--;    //(вичитание 1)
        x -= 5; //(вычитание 5)
        System.out.println(x);
        //Вывод консоль//
        //2
        */

        //Prefix && Postfix

        /*
        Prefix - это когда инкремент/декремент описывается перед переменной, ++x; --x;
        Postfix - это когда инкремент/декремент описывается после переменной, x++; x--;
        Пример//
        int a = 5;
        ++a---a-a--+a++
        6-5-5+4=0 и "а" в конце становится 5
        */

        //Сокращенная форма записи умножения и деления

        /*
        int x = 5;
        x *= 10; //(умножение)
        x /= 2;  //(деление)
        System.out.println(x);
        //Вывод консоль//
        //25
        */

        //Остаток от деления "%", при делении на переменных целых чисел "int"

        /*
        int a = 11;
        int b = 3;
        int c = a/b;
        int d = a%b;
        System.out.println(c); //результат деления a/b
        System.out.println(d); //результат остатка от деления a/b
        //Вывод консоль//
        //3
        //2
        */

        //Операторы сравнения "<", ">", "<=", ">=", "==", "!=";

        /*
        int a = 3;
        int b = 5;
        System.out.println(a<b); //в данном типе либо "false", либо "true"
        //Вывод консоль//
        //true
        int c = 5;
        int d = 5;
        System.out.println(c>=d); //в данном типе либо "false", либо "true"
        //Вывод консоль//
        //true
        int e = 4;
        int f = 6;
        System.out.println(e==f); //в данном типе либо "false", либо "true"
        //Вывод консоль//
        //false
        int h = 3;
        int j = 7;
        System.out.println(j!=h); //в данном типе либо "false", либо "true"
        //Вывод консоль//
        //true
        */

        //Условный оператор "&&" = "and" = "и", является boolean значением

        /*
        //  b1  //  b2  //  b3  //
        // true // true // true // = true  //если все операторы равны "true", тогда "true"
        // false// true // true // = false //если один из операторов равен "false", тогда всё выражение равно "false"
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;
        boolean e = a<b && ++c==d; //true&&true если начальное выражение равно true, java дальше не считает, поэтому "c" не меняется
        System.out.println(e);     //при операторе &&
        System.out.println(c);
        //Вывод консоль//
        //true
        //100
        int a1 = 10;
        int b1 = 50;
        int c1 = 99;
        int d1 = 100;
        boolean e1 = a1>b1 && ++c1==d1; //false&&true если начальное выражение равно false, java дальше считает, поэтому "c1" меняется
        System.out.println(e1);         //при операторе &&
        System.out.println(c1);
        //Вывод консоль//
        //false
        //99
        */

        // Логический оператор "&" = "and" = "и", является boolean значением

        /*
        //  b1  //  b2  //  b3  //
        // true // true // true // = true  //если все операторы равны "true", тогда "true"
        // false// true // true // = false //если один из операторов равен "false", тогда всё выражение равно "false"
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;
        boolean e = a>b & ++c==d; //false&&true если начальное выражение равно false, java дальше считает, поэтому "c" меняется
        System.out.println(e);    //при операторе &
        System.out.println(c);
        //Вывод консоль//
        //false
        //100
        */

        //Условный оператор "||" = "or" = "или", является boolean значением

        /*
        //  b1  //  b2  //  b3  //
        // true // true // true // = true  //если все операторы равны "true", тогда "true"
        // false// false// true // = false //если 1 или 2 из операторов равен "false", тогда всё выражение равно "true"
        // false// false// false// = false //если все операторы равны "false", тогда "false"
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;
        boolean e = a<b || ++c==d; //true&&false если начальное выражение равно true, java дальше не считает, поэтому "c" не меняется
        System.out.println(e);     //при операторе ||
        System.out.println(c);
        //Вывод консоль//
        //true
        //99
        int a1 = 10;
        int b1 = 50;
        int c1 = 99;
        int d1 = 100;
        boolean e1 = a1>b1 || ++c1==d1; //false&&true если начальное выражение равно false, java дальше считает, поэтому "c1" меняется
        System.out.println(e1);         //при операторе ||
        System.out.println(c1);
        //Вывод консоль//
        //true
        //100
        */

        //Логический оператор "|" = "or" = "или", является boolean значением

        /*
        //  b1  //  b2  //  b3  //
        // false// false// true // = false //если 1 или 2 из операторов равен "false", тогда всё выражение равно "true"
        // false// false// false// = false //если все операторы равны "false", тогда "false"
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 101;
        boolean e = a<b | ++c==d; //true&&false если начальное выражение равно true, java дальше считает, поэтому "c" меняется
        System.out.println(e);    //при операторе |
        System.out.println(c);
        //Вывод консоль//
        //true
        //100
        */

        // ??? //  Логический оператор "^" = "исключительный или" является boolean значением

        /*
        //  b1  //  b2  //  b3  //
        // true // true // true // = false //если все операторы равны "true", тогда всё выражение равно "false"
        // false// false// false// = false //если все операторы равны "false", тогда всё выражение равно "false"
        // false// false// true // = true  //если большее кол-во из операторов равено "false", тогда всё выражение равно "true"
        // false// true // true // = false //если большее кол-во из операторов равено "false", тогда всё выражение равно "true"
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        System.out.println(b1^b2^b3^b4);
        //Вывод консоль//
        //false
        */

        //Логический оператор "!", принимает противоположенное значение

        /*
        boolean a1 = false;
        boolean b1 = !a1;
        System.out.println(b1);
        //Вывод консоль//
        //true
        */

        //Возведение в степень

        /*
        double a = 2; //число
        double b = 4; //степень
        double c = Math.pow(a, b);
        System.out.println(c);
        //Вывод консоль//
        //16
        */

        //Перенос строки (без этого идет последовательно)

        /*
        System.out.print("a");
        char newLine = '\n';
        System.out.print(newLine);
        System.out.print("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);
        //Вывод консоль//
        //a
        //b
        //\
        String hello = "hello\n";
        String world = "world";
        System.out.println(hello + world);
        //Вывод панели//
        //hello
        //world
        */

        //Убрать лишние пробелы. (.trim())

        /*
        String word1 = "              HELLO ";
        String trimmed = word1.trim();
        System.out.println(trimmed);
        //Вывод консоль//
        //HELLO
        */

        //Обрезание. Вывод на панель части текста. (.substring ();)

        /*
        String text = "Hello world!"; //12 символов
        System.out.println(text.substring(0,7)); //где 0 первый символ, 7 последний символ(который не выводится)
        //Вывод консоль//
        //Hello w
        */

        //Повторить строку n раз и добавить в нижний регистр (ДВА ДЕЙСТВИЯ)

        /*
        String word1 = "HELLO ";
        String repeated = word1.repeat(10).toLowerCase(); //(10) - означает кол-во повторений
        System.out.println(repeated);
        //Вывод консоль//
        //hello hello hello hello hello hello hello hello hello hello
        */

        //Функция замены .replace //s.replace//s.replaceAll//s.replaceFirst

        /*
        s.replace - замена указаных в первом апострофе символов на второй, причем символы меняются все которые указаны
        String s = "autoservice";
        s = s.replace('e','j');
        System.out.println(s);
        //Вывод консоль// - autosjrvicj
        s.replaceAll - замена в первой части двойных ковычек на вторую часть двойных ковычек, только то что указано
        String s = "autoservice";
        s = s.replaceAll("auto","brake");
        System.out.println(s);
        //Вывод консоль// - brakeservice
        s.replaceFirst - заменяет первую подстроку данной строки, которая соответствует заданому регулярному
        //выражению, с данной заменой другими словами – метод в Java позволяет заменить первое
        //вхождение слова или словосочетания в строке
        String s = new String("Добро пожаловать на OTNULYA.ru");
        System.out.print("Look this: ");
        System.out.println(s.replaceFirst("(.*)OTNULYA(.*)", "MechPower"));
        //Вывод в консоль//
        //Look this: MechPower
        */

        //Функция изменения симвлов в верхний (.toUpperCase), либо нижний (.toLowerCase) регистр

        /*
        String s = new String("Добро пожаловать на сайт MechPower!");
        System.out.print("Верхнее преобразование '.toUpperCase' - ");
        System.out.println(s.toUpperCase());
        System.out.print("Нижнее преобразование '.toLowerCase' - ");
        System.out.println(s.toLowerCase());
        //Вывод в консоль//
        //Верхнее преобразование '.toUpperCase' - ДОБРО ПОЖАЛОВАТЬ НА САЙТ MECHPOWER!
        //Нижнее преобразование '.toLowerCase' - добро пожаловать на сайт mechpower!
        */

        //Длина символов в кавычках, int выбрано, т.к. полученный результат является целочисленным, пробел идет в счет

        /*
        int n = "Mech Power".length();
        System.out.println(n);
        //Вывод консоль//
        //10
        */

        //Массивы

        /*
        String[] myArray; //Объявление массива
        myArray = new String[4]; //Создание массива, выделение на него памяти на 4 ячеек
        myArray[0] = "c";
        myArray[1] = "a";
        myArray[2] = "r";
        myArray[3] = "s";
        System.out.println(Arrays.toString(myArray));
        //Вывод консоль//
        //[c, a, r, s]
        String[] myArray2 = new String[4];//Объявление и создание массива
        myArray2[0] = "c";
        myArray2[1] = "a";
        myArray2[2] = "r";
        myArray2[3] = "s";
        System.out.println(Arrays.toString(myArray2));
        //Вывод консоль//
        //[c, a, r, s]
        String[] myArrays3 = {"c", "a", "r", "s"};//Объявление и создание массива, а так же запись значений
        System.out.println(Arrays.toString(myArrays3));
        //Вывод консоль//
        //[c, a, r, s]
        //после создания массива с помощью NEW, в его ячейках записаны значения по умолчанию, пример
        //boolean - false; int - 0; ссылки - null;
        */

        //Количество ячеек массива

        /*
        String[] array = {"Tic", "Tac", "Toe", "Tyc"};
        int n = array.length;
        System.out.println(n);
        //Вывод консоль//
        //4
        */

        //Умножение в массиве

        /*
        int[] array = {2, 3, 4};  //создаем, объявляем, записываем первый целочисленный массив
        int[] array2 = {2, 3, 4}; //создаем, объявляем, записываем второй целочисленный массив
        String[] array3 = new String[3]; //создаем, объявляем, записываем третий строчный массив
        array3[0] = String.valueOf(Integer.parseInt(String.valueOf(array[0] * array2[0])));  //magic
        array3[1] = String.valueOf(Integer.parseInt(String.valueOf(array[1] * array2[1])));  //magic
        array3[2] = String.valueOf(Integer.parseInt(String.valueOf(array[2] * array2[2])));  //magic
        System.out.println(Arrays.toString(array3));
        //Вывод консоль//
        //[4, 9, 16]
        */

        //Создание объекта//Object creation

        /*
        BankAccount bA = new BankAccount; где
        BankAccount - тип данных переменной
        bA - имя переменной
        = - присвоение
        new BankAccount - вызов конструктора - создание объекта
        */

        //Вывод информации. System.out.println()

        /*
        System.out.println("\"Khal Drogo's favorite word is \"athjahakar\"\"");//добавляет кавычки в классе String
        //Вывод консоль//
        //"Khal Drogo's favorite word is "athjahakar""
        System.out.println("H" + "a");//собирает Символы
        //Вывод консоль//
        //На
        System.out.println('H' + 'a');//Собирает по значению символов тип char, вкл высокий и низкий регистр
        //Вывод на консоль//
        //169
        System.out.println("abc5 6".length());//Считает кол-во символов в двойных кавычках, вкл пробел
        //Вывод консоль//
        //6
        */

        //М Е Т О Д . Создание и использование

        /*
        public class Test20 {
        //создание метода
        int summa (int a, int b, int c) {   //summa - название метода; int a, int b, int c - input параметры, пишутся в скобках, тип данных может быть разным int, double, или даже class String
        int result = a + b + c;             //далее в фигурных скобках идет тело метода, в данном случае идет сумма 3 параметров (кто и что делает)
        return result;                      //которые раньше были input; return означает конец метода "result"
          }
        }
        //создаем новый класс
        class Test21 {
        //внутри этого класса, создаем метод main (psvm)
        public static void main(String[] args) {
        //т.к. метод summa относится к классу Test20, нужно создать объект класса Test20
        Test20 t = new Test20();                //создаем объект класса Test20 в классе Test21
        //создаем новую переменную summaTrexChisel и присваиваем ей значение метода t.summa
        int summaTrexChisel = t.summa(1,2,3);   //метод вызывается через точку ("."), в скобках указываются значения параметров
        //потом вызываем sout для визуализации значения переменной summaTrexChisel
        System.out.println(summaTrexChisel);
          }
        }
        */

        //Структура метода

        /*
        public static void main (String [] args){our code}
        "public" - access modifier
        "static" - non-access modifier(s)
        "void" - return type (то, что возвращает наш метод, что является его output)
        "main" - name (имя метода)
        "(String [] args)" - parameter(s) (обязательно наличие круглых скобок, но не обязательно его наполнение, без наполнения default)
        "{our code}" - body (тело метода, вся его функциональность)
        */

        //Конструктор //Основная цель - создание объекта //Конструктор всегда называется так же, как и класс из которого он исходит

        /*
        Car car1 = new Car(); //Первый "Car" обозначает тип данных, "car1" - имя переменной, "new" - вызов/создание нового, второй "Car()" это конструктор
        BankAccount bA = new BankAccount(); //Первый "BankAccount" - тип данных, второй "BankAccount()" это конструктор
        String name = new String("Petr"); //Первый "String" - тип данных, второй "String("Petr")" это конструктор с параметром ("Petr")
        */

        //Создание конструктора

        /*
        Название как и название класса в котором он создается
        В круглых скобках, параметры
        В фигурных скобках, тело конструктора
        */

        //Типы конструктора.

        /*
        1 тип - Default        //создается компилятором, всегда без параметров, тело конструктора всегда пустое, его не видно, Для любого class в java есть default конструктор
        Car car1 = new Car(){} //В пустых фигурных скобках находятся значения Default. Тело конструктора является пустым. И внутри круглых скобок нет параметров.
        2 тип - User defined   //создается человеком (разработчиком), может быть с параметрами или без, тело конструктора может быть пустым или нет. Его видно, так как написали его мы сами. При его наличии компилятор уже не будет создавать default конструктор
        Car car1 = new Car(){a+b+c} //В фигурных скобках написано тело конструктора который мы сами вручную определяем.
        */

        //Параметры конструктора "()";

        /*
        Пример 1
        public class Car {
        Car(){
               }
          String color;
          String engine;
        }

        class CarTest {
         public static void main (String []   args){
          Car car1 = new Car();
           System.out.println(car1.color);
          }
        }
        //Вывод консоль//
        //null             //Default значение (потому что у color нет никакого значения)

        Пример 2
        public class Car {
        Car(String cvet, String motor){
          color=cvet;
          engine=motor;
        }

         String color;
         String engine;
         }

        class CarTest {
         public static void main (String []   args){
          Car car1 = new Car("yellow", "V4");
           System.out.println(car1.color);
           System.out.println(car1.engine);
          }
        }
        //Вывод консоль//
        //yellow
        //V4
        */

        //Различие метода и конструктора

        /*
        Метод всегда имеет return type, можно назвать бесчисленное название имен (назвать по любому, как захочется)
        Конструктор никогда не имеет return type, имя должно совпадать с именем класса
        */

        // Метод "void" - означает, что метод не возвращает никаких данных.

        //Метод OverLoading

        /*
        Главное правило// Перезагруженные методы имеют одинаковые имена и разный список параметров
        Разный по типам данных\\
        void method (int a, String b)     {}    //типы данных разные, кол-во может быть одинаковым
        void method (double a, boolean b) {}
        Разный по количеству данных\\
        void method (int a, int b)        {}    //тип данных одинаковый, кол-во разное
        void method (int a, int b, int c) {}
        Разный по порядку\\
        void method (int a, String b)           //последовательность типов данных разный, сами данные и кол-во одинаковое
        void method (String a, int b)
        */

        //Метод OverLoading Rules

        /*
        RULE FIRST
        Return type может быть разным либо быть одинаковым:
        void method (int a, String b)      {}
        void method (double a, boolean b)  {}
        int method (long a)                {}

        Пример
        public class methodOverLoading2 {
        int sum (int i1, int i2) {
        return i1 + i2;
         }

        String sum (String s1,String s2){
        return s1 + s2;
           }
        }
        class methodOverLoading2Test {
        public static void main(String[] args) {
        methodOverLoading2 mO2 = new methodOverLoading2();
        int a = mO2.sum(5,7);
        System.out.println(a);
        //Вывод консоль//
        //12
        String s = mO2.sum("привет,", " мой друг");
        System.out.println(s);
        //Вывод консоль//
        //привет, мой друг
          }
        }

        RULE SECOND
        Access modifier может быть одинаковый и различный:
        public void method (int a, int b)         {}
        private void method (int a, int b, int c) {}
        public int method (long a)                {}

        RULE THIRD
        Методы, отличающиеся только return type или access modifier не являются overloaded (Compile ERROR):
        public void method (int a, String b)      {}
        private void method (int a, String b)     {}
        public String method (int a, String b)    {}
        */

        //Конструктор OverLoading //Constructor Overloading

        /*
        MAIN RULE\\ГЛАВНОЕ ПРАВИЛО//
        Перезагруженные конструкторы имеют  разный список параметров
        Разный по типам данных
        Constructor (int a, String b)     {}    //типы данных разные, кол-во может быть одинаковым
        Constructor (double a, boolean b) {}
        Разный по количеству данных
        Constructor (int a, int b)        {}    //тип данных одинаковый, кол-во разное
        Constructor (int a, int b, int c) {}
        Разный по порядку
        Constructor (int a, String b)           //последовательность типов данных разный, сами данные и кол-во одинаковое
        Constructor (String a, int b)
        */

        //Конструктор OverLoading Rules

        /*
        RULE FIRST

        Access modifier может быть одинаковый и различный:
        public Constructor (int a, int b)          {}
        private Constructor (int a, int b, int c)  {}
        public Constructor (long a)                {}

        RULE SECOND

        Конструкторы, отличающиеся только access modifier не являются overloaded (Compile ERROR):
        public Constructor (int a, String b)       {}
        private Constructor (int a, String b)      {}
        */

        //T H I S//this in constructor

        /*
        RULE FIRST

        Конструктор не может вызвать внутри себя OverLoaded конструктор по имени класса (Compile ERROR):
        Constructor (int a)                        {}
        Constructor (int a, int b)                 {}

        RULE SECOND

        Используйте "this" на первой строке в теле для вызова overloaded конструктора внутри конструктора:
        public Constructor (int a)                 {}
        private Constructor (int a, String b)      {
                                  System.out.println("Its correct!")}
        */

        //T H I S//this in variable, this is method, this is constructor

        /*
        this когда используется с переменными или методами, означает
        принадлежность этой переменной к текущему объекту, когда вы
        будете создавать объект с помощью конструктора, вы будете
        присваивать переменным этого объекта this определенные значения
        this keyword при использовании с переменными и методами указывает
        на текущий экземпляр (объект) класса
        this keyword нельзя использовать для обращения к переменным и
        методам внутри static метода или при присваивании значения
        static переменной
        не является ошибочным обращение с помощью this к static элементам
        так же особо и не рекомендуется
        */

        //Package// Основные цели

        /*
        Защита доступа (Access protection)\\ Защита от постороннего воздействия снаружи класса пакета
        Управление набором возможных имен (Namespace management)\\ Позволяет называть классы одинаково в разных пакетах
        Хранение связаных классов в одном месте (Keeping related classes in one place)\\ Хранение однотипных классов в одном месте (пакете)
        */

        //Контроллер доступа (Access modifier)\\ Указывается перед началом класса/типа данных

        /*
        public - элемент класса (переменная, например double salary) виден во всех классах всех  //в файле может быть только один public class
        private - имеет доступ только класс в котором создается. Соседний класс даже в одном файле, доступ не имеют
        (default) - существует тогда, когда access modifier не пишется, имеет доступ только внутри пакета
        protected - имеет доступ внутри пакета, и доступ во всех классах его потомков
        */

        //Описание ACCESS MODIFIER-ов

        /*
        CLASS        -  public, (default);
        CONSTRUCTOR  -  public, private, (default), protected;
        VARIABLE     -  public, private, (default), protected;
        METHOD       -  public, private, (default), protected;
        */

        //Non-access Modifiers\\Бывают 3 типов

        /*
        final - может относиться к variable (переменная), method (методу), class (классу)
        не имеет default значения, в виду того,
        что дальнейшее ее использование не целеснообразно
        final variable - должны быть инициализированны до их использования:
         - при определении переменной
         - в каждом конструкторе (если переменная не static)

        static - может относиться к variable (переменная) и method (методу)
        static - принадлежат всему классу в целом
        Если перед переменной стоит static, это означает, что данная
        переменная принадлежит всему классу, она является общей для всех
        созданных объектов, она не является собственностью какого либо объекта
        или всех объектов. Она является собственностью класса и к ней могут
        обращатся и изменять ее любой объект этого класса, но внутри себя они
        не хранят эту переменную
        У static переменных есть default значения
        static элементы: переменные и методы не могут вызывать, обращатся
        к instance переменным и методам, т.е. напрямую, потому что статичные
        переменные и методы могут быть использованны без создания объекта,
        а не статичные, нет
        К static элементам приянято обращаться используя имя класса,
        а не ссылку на созданный объект.

        abstract -
        */

        //В зависимости от пределов видимости переменные делятся на 4 группы

        /*
        1 - LOCAL VARIABLE - локальные переменные, это переменные
        которые созданы внутри метода. Областью их видимости является
        интервал кода, начало которого - это создание этого метода и
        конец - это окончание блока в которой создалась эта переменная
        даже если мы захотим ей пользоваться до начала ее создания в
        этом же методе, у нас этого не получиться, так как она еще не
        была создана. Не может иметь default значения
        2 - PARAMETER - переменную параметра можем видеть на протяжении
        всего метода, в остальном видемость схожа с локальной переменной
        Видимость внутри этого блока/тела метода
        3 - INSTANCE VARIABLE - это тоже самое что и object переменная
        Эти переменные (instance и object) принадлежат объекту
        каждый объект класса будет иметь эти переменные
        4 - STATIC VARIABLE - принадлежит всему классу. Она общая для всех
        объектов. Ведет себя так же, как и переменная объектов. Мы можем
        ее использовать, где угодно.
        */

        //Идентификаторы в Java, name of variables, constructor, method;

        /*
        Rule first - длина не ограничена
        Rule second - должен начинаться с прописной или заглавной буквы, с
        символов валют или _ (underscore/нижнее подчеркивание)
        Rule third - символы валют и _ (underscore/нижнее подчеркивание)
        могут быть в любой части идентификатора, а цифры везде, кроме начала
        Rule fourth - нельзя называть идентификаторы зарезервированными
        словами "class", "public", "double" и т.д. Idea зарезервированные
        слова отмечает оранжевым цветом при написании
        */

        //Garbage collector//Чистка памяти

        /*
        Мы можем определить какие объекты будут пригодны для того,
        чтобы garbage collector собрал их (удалил из памяти)
        Мы не можем конкретно быть уверенны в том, что в определенное
        время garbage collector удалит объект из памяти
        Мы не можем контролировать garbage collector и управлять им
        Управление garbage collector лежит на JVM (Java Virtual Machine)
        */

        //Import\\ Импорт класса из другого пакета

        /*
        вызывается в начале метода, потом можно работать не обращаясь
        к папке, а обращаться сразу же к пакету
        Есть 2 пакета package p1 (class A)
        и package p2 (class B и class C и подпакет p3 class D)
        Обычное обращение выглядит так
        package p1;

        class A {
        p2.B b1 = new p2.B();
        p2.C c1 = new p2.C();
        }
        Import обращение выглядит так
        package p1;
        import p2.B;
        import p2.C;

        class A{
        B b1 = new B();
        C c1 = new C();
        }
        Если в папке находится множество классов,
        то можно сделать import всей папки
        package p1;
        import p2.*;

        class A {
        B b1 = new B();
        C c1 = new C();
        }
        Если класс лежит в подпакете (package 3 class D) пакета package 2,
        то import классов этого пакета можно сделать только имея обращение
        к этому подпакету
        package p1;
        import p2.p3*;

        class A {
        D d1 = new D();
        }
        */

        //Static import\\ Импорт статичной переменной из другого класса другого пакета

        /*
        Есть два пакета package p1 class A, package p2 public class B, в
        классе B есть статичные переменные
        public static int a и public static int count;
        Импорт одной переменной осуществляется следующим образом
        package p1;
        import static p2.B.a;

        class A{
        System.out.println(a);
        }
        Если в классе нужно обращаться к нескольким статичным переменным
        то используется так же *
        package p1;
        import static p2.B.*;

        class A{
        System.out.println(a);
        System.out.println(count);
        }
        */

        //Comments\\ Коментарии, существует 3 типа

        //FIRST\\
        //end of line - создание комментариев 1 типа
        //комментарии "//" - означают действие комментария до конца строки
        //SECOND\\
        //multiline - создание комментариев 2 типа
        //комментарии "/*" - означают начало комментариев,
        //и "*/" - конец;
        //THIRD\\
        //javaDoc - специальный тул, составная часть JDK, помогает описывать
        //класс, т.е. если вы захотите сохранить и расспечатать ваш класс
        //в каком то понятном виде, вы можете писать JDK комментарии, и затем
        //с помощью JDK Tool вы можете сохранить документ об этом классе,
        //документ который описывает ваш класс, формат этого документа будет HTML
        //пишуться "/**" - означает начало комментариев,
        //и "*/" - конец

        //Аргументы методов\\

        /*
        Могут быть Primitive data types (примитивный тип данных)
        Могут быть Reference data types (ссылочный тип данных), если
        подставляются в параметры, то это копии данных
         */

        //Flow control\\Контроль хода программы

        /*
        Можно разделить на две категории selection / looping
        Selection - это когда нам предстоит выбрать
        Looping - это когда нам предстоит повторять что то
         */

        //Синтаксис if statement

        /*
        Пример
        if (boolean expression) { //if означает "если" в скобках условие (boolean expression) которое вы проверяете,
              our code            //в фигурных скобках тело кода, если вы соглашаетесь на условие в скобках
                                }
        else {                    //else означает "иначе" в противном случае
                 our code         //в фигурных скобках тело кода, если вы не соглашаетесь на условия в скобках
             }
         */

        //Варианты использования if
        /*
        Первый вариант:

        if (boolean expression)
             {  our code  }

        Второй вариант:

        if (boolean expression)
             {  our code  }
        else
             {  our code  }

        Третий вариант:

        if (boolean expression)
             {  our code  }
        else if (boolean expression)
             {  our code  }
        else
             {  our code  }

        Четвертый вариант:

        if (boolean expression)
        if (boolean expression)
             {  our code  }
        else
             {  our code  }
        else
             {  our code  }
         */

        //Метод E Q U A L S(); //в default существует у всех создаваемых классов

        /*
        Отношение к классу String;
        Если у нас есть 3 String "abc", "bcd", "abc"
        Равными считаются, те объекты String, у которых кол-во букв одинаковое
        и совпадает по порядку между собой
        Пример
        String s1 = new String ("Hello")
        String s2 = new String ("Hello")
        if (st1.equals(st2))
             {  our code  }
        при boolean сравнении s1 == s2; выдаст false, так как адресы у них разные
        при boolean сравнении s1.equals(s2) выдаст true, так как будет уже сравнение самих параметров String
         */

        //Ternary operator\\Тернарный оператор

        /*
        состоит из 3 операнд
        (boolean expression) ? (if true) : (if false)  -  где
        (boolean expression) - условие которое отвечает на вопрос "правда" ли "ложь"
        ?
        (if true) - значение при true
        :
        (if false) - значение при false
         */

        //Синтаксис switch statement

        /*
        "switch" означает что вы будете что-то с чем-то сравнивать
        (expression) - условие сравнения
        "case value" - один из возможных вариантов ответа условия
        "our code" - действие согласно выбранному условию
        "break" - оператор перехода, выход из цикла
        "default" - значение согласно отсутствующему варианту из представленных
        switch (expression) {
        case value1: our code; break;
        case value1: our code; break;
        case value1: our code; break;
        default:     our code; break;
        }
        ПРИМЕР
         Student st1 = new Student(1);
        switch (st1.grade){
            case 2 :
                System.out.println("Студент двоечник"); break;
            case 3 :
                System.out.println("Студент троечник"); break;
            case 4 :
                System.out.println("Студент хорошист"); break;
            case 5 :
                System.out.println("Студент отличник"); break;
            default:
                System.out.println("Оценка не верна");
        }
         */

        //Тип данных switch expression
        /*
        switch (expression){
        ................
        }
        (expression) у "switch" может быть НЕ любым типом данных
        возможные типы данных перечислены ниже
        - byte
        - short
        - int
        - char
        - String
        В (expression) так же может происходить действие, например сложение,
        вычитание, умножение или деление и тд, главное в конечном итоге
        получить один из представленных выше тип данных
         */

        //Compile time constants. Что можно использовать после слова case

        /*
        - 1, -3.14, "privet", 5*10; - так делать можно, конечный результат значение
        - a = 5; b = 10; a*b; - так делать нельзя, заранее созданные константы a и b могут меняться
        - final a = 5; final b = 10; a*b; - так делать можно, final переменную менять нельзя
        - final a; final b; a = 5; b = 10; a*b; - так делать нельзя, нельзя сперва объявить переменную final, а потом присвоить ей значение
         */


        //В А Ж Н О Е\\

        //При красном значении неправильно подобранного типа или класса, нужно нажать "Alt + Enter" и программа сама
        //подскажет какой тип данных можно испольховать! О Ч Е Н Ь   П О Л Е З Н Ы Й   Л А Й Ф Х А К   ! ! !


    }
}
