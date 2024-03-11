package Help.Lesson_1.;

public class Home_work {
    public static void main(String[] args) {

        //// З А Д А Ч И   И   П Р И М Е Р Ы \\\\

        //Задача//Найдем периметр квадрата
//        int d = 4;
//        System.out.println("Периметр квадрата со стороной d => P = " + 4 * d);

        //Задача//Квадрат и прямоугольник. Найти площадь и периметр.
//        int x = 5; //длина 1 стороны
//        int y = 6; //длина 2 стороны
//        int s = x * y; //площадь
//        int p = (x + y) * 2;
//        System.out.println("Площадь =" +s);
//        System.out.println("Периметр =" +p);
        //Задача//Куб. Найти площадь и периметр.
//        int x = 3; //длина 1 стороны
//        int s = (x * x) * 6; //площадь куба
//        int p = x * 12; //периметр куба
//        System.out.println("Площадь куба =" +s);
//        System.out.println("Периметр куба =" +p);

        //Задача// - найти кол-во зерен на шахматной доске, если на первую клетку положить одно зернышко,
        //на вторую клетку два зернышка, на третью в два раза больше, чем на предыдущей, т.е. 4 и так далее...
        //Шахманая доска 8 * 8 = 64 клетки - 11.03.24 - не решенная

        //Задача//Найти площадь круга
//        final double Pi = 3.14;
//        double r = 4.25;
//        double sCircle = Pi * (r * r);
//        System.out.println(sCircle);

        //Задача//Найти длину окружности
//        final double Pi = 3.14;
//        double r =4;
//        double d = 2 * r;
//        double S = Pi * d;
//        System.out.println("Длина окружности = " +S);

        //Задача//Найти курс Евро к Доллару, коефицент 1.1 формула, Евро дороже доллара
//        double dollar = 2;
//        double euro = dollar * 1.1;
//        System.out.println("Евро стоит = " +euro);

        //Задача//Найти соотношение площади Беларуси (207600 км) к площади Украины (603628 км)
//        double sBelarus = 207600;
//        double sUkraine = 603628;
//        double ratio = sBelarus /  sUkraine;
//        System.out.println("Соотношение площади Белоруссии к Украине равно " +ratio);

        //Задача//Найти, во сколько раз площадь Москвы (2511 км) больше площади Берлина (891,8 км)
//        double sMoscow = 2511;
//        double sBerlin = 891.8;
//        double answer = sMoscow / sBerlin;
//        System.out.println("Площадь Москвы больше площади Берлина в " +answer);

        //Задача//Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
//        double bank = 4;
//        double client = 1000;
//        double finishMoney = (client * bank / 100 * 7) + client;
//        System.out.println(finishMoney);



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







        ///Задачи///

        //Задача: Повара попросили сделать салат.
        //Если у повара есть ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать его
        //Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйцо)
        //Если и для Оливье не нашлось ингредиентов, то сделать овощной салат (нужны только овощи)
        //Если ингредиентов нет, то повар объявляет: У меня ничего нет.
        //Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному)
        //Либо объявить о невозможности сделать салат
        //Вывести на экран значение получившегося результата, проверка по разным переменным

//        boolean chicken = false;
//        boolean vegetables = false;
//        boolean sauce = false;
//        boolean toast = false;
//        boolean sausage = false;
//        boolean egg = false;
//
//        if (chicken && vegetables && sauce && toast) {
//            System.out.println("Цезарь прибудет в ближайшее время");
//        } else if (vegetables && sausage || chicken && egg){
//            System.out.println("Оливье прибудет в ближайшее время");
//        } else if (vegetables) {
//            System.out.println("Овощной салат прибудет в ближайшее время");
//        } else
//            System.out.println("У меня ничего нет");

        //Задача//Пока не изученный для меня материал 11.03.24

//        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
//        String numberText = "234";
//        int number = Integer.parseInt(numberText);
//        String someText = "some_text";
//        System.out.println(number + someText.length());

        //Задача//Посчитать (a + b) ^ 2 = ?, при a = 3; b = 5;

//        int a = 3;
//        int b = 5;
//        int c = a + b;
//        int f = 2;
//        double d = Math.pow(c, f);
//        System.out.println(d); //правильная запись, хоть и более длинная (зависит от конкретного случая)
        //либо
//        int a = 3;
//        int b = 5;
//        int c = (a + b) * (a + b);
//        System.out.println(c); //менее правильно так как при замне степени на 8 все идет по звезде

        //Задача//Пока не моего уровня, но очень интересная, сам 10.03.24 решить не смог (7 дней занятий по Java)

        //В автосервис приехала сломанная машина. Механики находят неисправность следующим образом.
        //Если у маши нет бензина и ничего не сломано, то отдают машину владельцу и берут за диагностику 1000 рублей
        //Если у машины проблема с двигателем, то чинят и берут 10000 рублей
        //Если у машины проблема с электрикой, то чинят и берут 5000 рублей
        //Если у машины проблема с коробкой передач, то чинят и берут 4000 рублей
        //Если у машины проблема с колесами, то чинят и берут 2000 рублей
        //Если две позиции сломаны, то на общий счет идет скидка 10%
        //Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%
        //Если нет бензина и что-то сломано, то за консультацию денег не берут
        //Ситуации, что бензин есть и ничего не сломано - быть не может
        //Ожидаемый результат: выведен на экран счет клиенту

//        boolean hasFuel = true;
//        boolean hasElectricsProblem = true;
//        boolean hasMotorProblem = true;
//        boolean hasTransmissionProblem = true;
//        boolean hasWheelsProblem = true;
//        boolean hasAnyProblem = hasElectricsProblem && hasTransmissionProblem && hasWheelsProblem && hasMotorProblem;
//
//        if (!hasFuel && hasAnyProblem) {
//            System.out.println("Нет бензина, с вас 1000 рублей");
//        }
//        double price = 0;
//        double discount = 1;
//        int countProblems = 0;
//        if (hasMotorProblem) {
//            price += 10_000;
//            countProblems++;
//        }
//        if (hasElectricsProblem) {
//            price += 5_000;
//            countProblems++;
//        }
//        if (hasTransmissionProblem) {
//            price += 4_000;
//            countProblems++;
//        }
//        if (hasWheelsProblem) {
//            price += 2_000;
//            countProblems++;
//        }
//        if (countProblems == 2) {
//            discount -= 0.1;
//        }
//        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
//            discount -= 0.2;
//        }
//        price = price * discount;
//        System.out.println("Итоговая сумма: " + price);







    }
}





