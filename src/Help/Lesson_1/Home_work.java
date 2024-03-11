package Help.Lesson_1;

import java.util.Arrays;

public class Home_work {
    public static void main(String[] args) {

        //// З А Д А Ч И   И   П Р И М Е Р Ы \\\\

        //Задача//Найдем периметр квадрата

//        int d = 4;
//        System.out.println("Периметр квадрата со стороной d => P = " + 4 * d);

        //Задача//Квадрат и прямоугольник. Найти площадь и периметр

//        int x = 5; //длина 1 стороны
//        int y = 6; //длина 2 стороны
//        int s = x * y; //площадь
//        int p = (x + y) * 2;
//        System.out.println("Площадь =" +s);
//        System.out.println("Периметр =" +p);

        //Задача//Куб. Найти площадь и периметр

//        int x = 3; //длина 1 стороны
//        int s = (x * x) * 6; //площадь куба
//        int p = x * 12; //периметр куба
//        System.out.println("Площадь куба =" +s);
//        System.out.println("Периметр куба =" +p);

        //Задача//Найти кол-во зерен на шахматной доске, если на первую клетку положить одно зернышко,
//        //на вторую клетку два зернышка, на третью в два раза больше, чем на предыдущей, т.е. 4 и так далее...
//        //Шахманая доска 8 * 8 = 64 клетки - 11.03.24 - не решенная

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

//      //Задача//Повара попросили сделать салат
//        Если у повара есть ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать его
//        Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйцо)
//        Если и для Оливье не нашлось ингредиентов, то сделать овощной салат (нужны только овощи)
//        Если ингредиентов нет, то повар объявляет: У меня ничего нет.
//        Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному)
//        Либо объявить о невозможности сделать салат
//        Вывести на экран значение получившегося результата, проверка по разным переменным
//        boolean chicken = false;
//        boolean vegetables = false;
//        boolean sauce = false;
//        boolean toast = false;
//        boolean sausage = false;
//        boolean egg = false;
//        if (chicken && vegetables && sauce && toast) {
//            System.out.println("Цезарь прибудет в ближайшее время");
//        } else if (vegetables && sausage || chicken && egg){
//            System.out.println("Оливье прибудет в ближайшее время");
//        } else if (vegetables) {
//            System.out.println("Овощной салат прибудет в ближайшее время");
//        } else
//            System.out.println("У меня ничего нет");

        //Задача//Пока не моего уровня, но очень интересная, сам 10.03.24 решить не смог (7 дней занятий по Java)

//        В автосервис приехала сломанная машина. Механики находят неисправность следующим образом.
//        Если у маши нет бензина и ничего не сломано, то отдают машину владельцу и берут за диагностику 1000 рублей
//        Если у машины проблема с двигателем, то чинят и берут 10000 рублей
//        Если у машины проблема с электрикой, то чинят и берут 5000 рублей
//        Если у машины проблема с коробкой передач, то чинят и берут 4000 рублей
//        Если у машины проблема с колесами, то чинят и берут 2000 рублей
//        Если две позиции сломаны, то на общий счет идет скидка 10%
//        Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%
//        Если нет бензина и что-то сломано, то за консультацию денег не берут
//        Ситуации, что бензин есть и ничего не сломано - быть не может
//        Ожидаемый результат: выведен на экран счет клиенту
//        boolean hasFuel = true;
//        boolean hasElectricsProblem = true;
//        boolean hasMotorProblem = true;
//        boolean hasTransmissionProblem = true;
//        boolean hasWheelsProblem = true;
//        boolean hasAnyProblem = hasElectricsProblem && hasTransmissionProblem && hasWheelsProblem && hasMotorProblem;
//
//        if (!hasFuel && hasAnyProblem) {
//        System.out.println("Нет бензина, с вас 1000 рублей");
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

        //Задача//Создать единую строку, привести к виду который ниже
//        //затроить (можно вызвать только одну команду System.out.println())
//        //Результат вывода на экран
//        //Hello world!
//        //Hello world!
//        //Hello world!
//        //Дано (менять нельзя)

//        String hi = "              Hello ";
//        String world = " WoRld!";
//        char newLine = '\n';
//        System.out.println((((hi.trim()) + (world.toLowerCase())) + newLine).repeat(3));

        //Задача//Создать переменные с ростом, весом. Произвести расчет индекса массы тела (вес) / (рост * рост)
//        //используя переменные, вывести на экран. Пример вывода результата на экран: 21.0

//        float weight = 74.0F;
//        float height = 1.73F;
//        float index = weight / (height * height);
//        System.out.println(index);

        //Задача//Создать из массива букв a,b,c,d,e, строку, вывести на экран, поменять в массиве 4 букву по счету
//        //на h, и снова создать строку, вывести на экран

//        String[] array = {"a", "b", "c", "d", "e"};
//        System.out.println(Arrays.toString(array));
//        array[4] = "h";
//        System.out.println(Arrays.toString(array));

        //Задача//Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

//        String text = "234";
//        int transformation = Integer.parseInt(text);
//        int text2 = "some_text".length();
//        System.out.println(transformation + text2);

        //Задача//Посчитать (a + b) ^ 2 = ?, при a = 3; b = 5;

//        int a = 3;
//        int b = 5;
//        int c = a + b;
//        int f = 2;
//        double d = Math.pow(c, f);
//        System.out.println(d); //правильная запись, хоть и более длинная (зависит от конкретного случая)
//        //либо
//        int a = 3;
//        int b = 5;
//        int c = (a + b) * (a + b);
//        System.out.println(c); //менее правильно так как при замне степени на 8 все идет по звезде

        //Задача//Создать два массива чисел:
//        //1,2,5,7,10
//        //2,3,2,17,15
//        //Создать третий массив чисел, в котором будут все числа из этих двух массивов,
//        //и результат умножения чисел с одинаковым порядковым номером
//        //
//        //Ожидаемый результат: 1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
//        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
//        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15))

        //Задача//В слове "Hello world!", заменить все l на r, сделать все буквы заглавными, вывести первые 8 символов

//        //Задача//Создать метод маскирования персональных данных, который:
//        //Телефон (до/после маскирования): 79991113344 / 7999***3344
//        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
//        //ФИО (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
//        //
//        //Входящие параметры: String text
//        //Возвращаемый результат: String
//        //
//        //Примеры возможного текста:
//        //<client>(Какие-то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - <client>(Какие-то данные)<data>7999***3344;tes*@******.ru;И*****в Иван И.</data></client>
//        //<client>(Какие-то данные)<data></data></client> - вернет тоже (никаких ошибок)
//        //<client>(Какие-то данные)<data>Иванов Иван Иванович;79997773344</data></client> - <client>(Какие-то данные)<data>И*****в Иван И.;7999***3344</data></client>
//        //
//        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
//        //Регулярные выражения, класс StringBuilder

        //Задача//
























    }
}





