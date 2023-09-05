package HW2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        System.out.println(noEmty());
    }

    public static String noEmty(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String text = scan.nextLine();
        if (text.isEmpty()) {
            return "Пустые строки вводить нельзя";
        }
        return text;
    }
}
