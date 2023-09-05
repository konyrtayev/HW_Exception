package HW2;

public class Task_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
     
            printSum(23, 234);
            
            int[] abc = { 1, 2 };
            abc[3] = 9;
     
         
         } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
         } catch (ArithmeticException e) {                                          // не учтена проверка деления на 0
             System.out.println("Попытка деления на 0");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");                        // обработка всех ошибок проверяется последней
        }
     }
     public static void printSum(Integer a, Integer b) {                         // не работаетм с файлами и нам не требуется эта ошибка
        System.out.println(a + b);
     }
}
