package HW2;

public class Task_2 {
    public static void main(String[] args) {
        double[] intArray = {4,5,0,8,7,3,0,12,9,5};
        int d = 20 ;
        
        if (intArray.length<9){                                                                         // проверяется на допустивую длинну
            System.out.println("Массив длинной " + intArray.length + " и это мень чем требуется");
            //  return  ;
        }
        else if (d ==0 ){                                                                               // Проверяем деление на 0
            System.out.println("Проводи деление на 0");
            // return   ;
        }
        else {                                                                                          // Выполнение рабочего кода
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            // return   ;
        }

    }
}
