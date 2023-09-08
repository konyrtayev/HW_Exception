package HW3;

import java.time.LocalDateTime;

public class timeCheck {
   //Метод для проверви существования введенной даты
    public static boolean checkDate(int year, int month, int day){       
        if((year>1000)&&(year<9999)){
            if (month == 1) {       // Январь
                if ((day > 0)&&(day < 32)) return true;
            }
            if (month == 2) {       //Февраль
                if ((day > 0)&&(day < 29)) return true;
                if ((day == 29)&&(year%4 == 0)&&(year%16 !=0)) return true;
            }
            if (month == 3) {       //Март
                if ((day > 0)&&(day < 32)) return true;
            }
            if (month == 4) {       //Апрель
                if ((day > 0)&&(day < 31)) return true;
            }
            if (month == 5) {       //Май
                if ((day > 0)&&(day < 32)) return true;
            }
            if (month == 6) {       //Июнь
                if ((day > 0)&&(day < 31)) return true;
            }
            if (month == 7) {       //июль
                if ((day > 0)&&(day < 32)) return true;
            }
            if (month == 8) {       //Август
                if ((day > 0)&&(day < 32)) return true;
            }
            if (month == 9) {       //Сентябрь
                if ((day > 0)&&(day < 31)) return true;
            }
            if (month == 10) {      //Октябрь
                if ((day > 0)&&(day < 32)) return true;
            }
            if (month == 11) {      //ноябрь
                if ((day > 0)&&(day < 31)) return true;
            }
            if (month == 12) {      //Декабрь
                if ((day > 0)&&(day < 32)) return true;
            }
        }     
        return false;
    }

    // Метод для проверки введенного для рождения с текущей датой
    public static boolean futureDate(int year, int month, int day){                     
        if (LocalDateTime.now().getYear() > year) return true;
        else if (LocalDateTime.now().getYear() == year){
            if (LocalDateTime.now().getMonthValue() > month) return true;
            else if (LocalDateTime.now().getMonthValue() == month){
                if (LocalDateTime.now().getDayOfMonth() > day) return true;
                else return false;
            }
            else return false;
        }
        else return false;
    } 
}
