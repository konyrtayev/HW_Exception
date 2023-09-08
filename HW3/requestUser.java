package HW3;

import java.util.Scanner;

public class requestUser {
    // Метод проверки введенных пользователем данных
    public static String nameData(){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите свои данные через пробел, на латинице, в виде: \n"+
        "         Фамилия Имя Отчество датарождения номер телефона пол(f/m)\n"+
        "Пример: Sergiyenko Vladimir Viktorovich 17.05.1997 87302043817 m\n");
        String text = scan.nextLine();

        // Проверка достаточности введенных данных
        String[] splitText = text.split(" ");                                                   
        if (splitText.length<6){        
            System.out.println("Вы ввели недостаточно данных");
            return "-1";
            }
        if (splitText.length>6){
            System.out.println("Вы ввели лишнии данные или лишнии пробелы");
            return "-1";
        }
        
        //Проверка что в фамилии только латинские буквы
        if (splitText[0].matches("[a-zA-Z]+"));
        else {System.out.println("Фамилия содержит недопустимые символы"); return "-1";}
        
        //Проверка что в имени только латинские буквы
        if (splitText[1].matches("[a-zA-Z]+"));
        else {System.out.println("Имя содержит недопустимые символы"); return "-1";}

        //Проверка что в отчестве только латинские буквы
        if (splitText[2].matches("[a-zA-Z]+"));
        else {System.out.println("Отчество содержит недопустимые символы"); return "-1";}

        //Проверка введение даты с разделителем точка
        text = splitText[3];
        String[] textDate = text.split("\\.");
        if ((textDate.length == 3));
        else {System.out.println("Формат даты не верен"); return "-1"; }

        // Проверка на существавание введенной даты
        if (timeCheck.checkDate(Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])));
        else {System.out.println("Такого дня не сужествует"); return "-1"; }

        //Проверка что дату можно использовать как день рождения
        if (timeCheck.futureDate(Integer.parseInt(textDate[2]),Integer.parseInt(textDate[1]),Integer.parseInt(textDate[0])));
        else {System.out.println("Указана дата будущего дня, что недопустимо"); return "-1"; }

        //Проверка номера телефона на наличии только цифр и 11 значного номера
        if ((splitText[4].matches("[0-9]+")&&(splitText[4].length() == 11)));
        else {System.out.println("Формат телефона не верен"); return "-1"; }

        //Проверка введенного пола человека
        if ( (splitText[5].equals("f")) || (splitText[5].equals("m")));
        else {System.out.println("Пол не верен"); return "-1"; }

        String result = "<"+splitText[0]+"><"+splitText[1]+"><"+splitText[2]+"><"+splitText[3]+"><"+splitText[4]+"><"+splitText[5]+">";
        scan.close(); 
        return result;    
  
    }
}
