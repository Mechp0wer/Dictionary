package University;

 class Student {

     int number;
     String firsName;
     String lastName;
     int year;
     int gradeMath;
     int gradeEconomics;
     int gradeForeignLanguage;




     public static void main(String[] args) {

         Student Ivan = new Student();
         Student Petr = new Student();
         Student Oleg = new Student();

         Ivan.number = 1;
         Ivan.firsName = "Иван";
         Ivan.lastName = "Иванов";
         Ivan.year = 2016;
         Ivan.gradeMath = 4;
         Ivan.gradeEconomics = 4;
         Ivan.gradeForeignLanguage = 5;
         int average = (Ivan.gradeMath+Ivan.gradeEconomics+ Ivan.gradeForeignLanguage)/3;
         System.out.println("\nНомер билета: "+Ivan.number+"\nИмя: "+Ivan.firsName+"\nФамилия: "+Ivan.lastName+"\nГод обучения: "
         +Ivan.year+"\nСредняя оценка: "+average);

         Petr.number = 2;
         Petr.firsName = "Петр";
         Petr.lastName = "Петров";
         Petr.year = 2014;
         Petr.gradeMath = 3;
         Petr.gradeEconomics = 4;
         Petr.gradeForeignLanguage = 3;
         int average1 = (Petr.gradeMath+Petr.gradeEconomics+Petr.gradeForeignLanguage)/3;
         System.out.println("\nНомер билета: "+Petr.number+"\nИмя: "+Petr.firsName+"\nФамилия: "+Petr.lastName+"\nГод обучения: "
         +Petr.year+"\nСредняя оценка: "+average1);

         Oleg.number = 3;
         Oleg.firsName = "Олег";
         Oleg.lastName = "Лаврив";
         Oleg.year = 2024;
         Oleg.gradeMath = 5;
         Oleg.gradeEconomics = 5;
         Oleg.gradeForeignLanguage = 5;
         int average2 = (Oleg.gradeMath+Oleg.gradeEconomics+Oleg.gradeForeignLanguage)/3;
         System.out.println("\nНомер билета: "+Oleg.number+"\nИмя: "+Oleg.firsName+"\nФамилия: "+Oleg.lastName+"\nГод обучения: "
         +Oleg.year+"\nСредняя оценка: "+average2);



     }



}
