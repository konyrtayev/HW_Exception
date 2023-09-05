package HW2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        
        System.out.println(numberСheck());
    }

    public static double numberСheck(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите дроброе число: ");
            String text = scan.nextLine();
            try {
                return Double.parseDouble(text);
            } catch (Exception e) {
                System.out.println("Введено неверное число"); 
                return numberСheck();
            }
        }
    }

}