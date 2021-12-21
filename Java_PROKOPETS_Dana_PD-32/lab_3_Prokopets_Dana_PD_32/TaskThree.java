package lab_4;

import java.util.stream.Collectors; //Імпорт бібліотек
import java.util.stream.Stream;

public class TaskThree {

    private static final char START_RANGE = 'h'; //constant
   
    private static final char END_RANGE = 't';   //constant

   
    public static void main(String[] args) { //Створюємо публічний метод
      
        String str = "sjdhgfsjkavchjwagehf"; // Ініціалізуємо змінну


        String resultStr  = Stream.of(str.split("")).map(item -> { //За допомогою map вказуємо ключ значення "item", 
           
        if (item.charAt(0) >= START_RANGE && item.charAt(0) <= END_RANGE) {   //Пробігаємося по буквах 
             
            return item.toUpperCase();  //Повертаємо деякі у верхньому регістрі
            }
            return item;
        }).collect(Collectors.joining()); //Створення колекції

        System.out.println(str);
        System.out.println(resultStr);
    }

}
