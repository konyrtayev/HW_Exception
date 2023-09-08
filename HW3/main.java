package HW3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class main {
    public static void main(String[] args) {
        String text = requestUser.nameData();
        
        while (text.equals("-1")){              // Запрашиваются данные пользователя пока он не заполнит их без ошибок
            text = requestUser.nameData();
        }

        String[] name = text.split(">");            // Вычленение фамилии пользователя из введенной строки для создания файла
        StringBuilder fileName = new StringBuilder();
        for (int i = 1; i < name[0].length(); i++) {
            fileName.append(name[0].toLowerCase().charAt(i));
        }

        try {
            if ( ! Files.isRegularFile(Path.of("C:\\New\\dz\\Java_Exception_sem3\\Base\\"+fileName+".txt"))){   //Создание файла если такого не существует
                Files.createFile(Path.of("C:\\New\\dz\\Java_Exception_sem3\\Base\\"+fileName+".txt"));          
            }                                                                                                     
            Path path = Paths.get("C:\\New\\dz\\Java_Exception_sem3\\Base\\"+fileName+".txt");                  // Добавление введенной записи в файл
            text = text+"\n";                                                                                   // Добавление перехода на новую строку для введенной записи
            Files.write(path, text.getBytes(), StandardOpenOption.APPEND);                                      // Побайтовое добавление записи в файл
            System.out.println("Данные внесены в базу");                                                      // Информирование пользователя о успешности внесения данных
        } catch (Exception e) {
            System.out.println("Произошла ошибка записи данных.  "+e.getMessage());                             // Показ ошибки связанной с внесение данных в файл
        }
    }
}
