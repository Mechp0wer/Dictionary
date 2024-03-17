package University;

 class Student {

     int number;
     String firsName;
     String lastName;
     int year;
     int gradeMath;
     int gradeEconomics;
     int gradeForeignLanguage;

      int getAverage() {
         int average = (gradeMath + gradeEconomics + gradeForeignLanguage)/3;
         return average;
     }

     void inf (){
         System.out.println("\nНомер билета: "+number+"\nИмя: "+firsName+"\nФамилия: "+lastName+"\nГод обучения: "
                 +year+"\nСредняя оценка: " + getAverage());
     }
     

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
         Ivan.inf();

         Petr.number = 2;
         Petr.firsName = "Петр";
         Petr.lastName = "Петров";
         Petr.year = 2014;
         Petr.gradeMath = 3;
         Petr.gradeEconomics = 4;
         Petr.gradeForeignLanguage = 3;
         Petr.inf();

         Oleg.number = 3;
         Oleg.firsName = "Олег";
         Oleg.lastName = "Лаврив";
         Oleg.year = 2024;
         Oleg.gradeMath = 5;
         Oleg.gradeEconomics = 5;
         Oleg.gradeForeignLanguage = 5;
         Oleg.inf();



     }




}