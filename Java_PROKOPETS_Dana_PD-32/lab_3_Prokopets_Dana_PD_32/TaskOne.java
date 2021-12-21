package lab_4;

import java.util.Arrays;
import java.util.List;   // Імпорт бібліотеки
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class TaskOne {

    public static void main(String[] args) {  //Створення публічного метода
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); // Створюємо список указаних елементів

       
        Stream<String> myStream = myList.stream() //Перетворюємо список в потік
              
        .map((item) -> { // За допомогою map вказуємо ключ значення "item"
                
        return item.toUpperCase(); // Перетворюємо всі данні в item в верхній регістр
                })
               
                .sorted((a, b) -> { // Сортування потоку
                    return a.charAt(0) == b.charAt(0) && a.charAt(1) > b.charAt(1) ? 1 : -1;
                });

        myList = myStream.collect(Collectors.toList());// Перетворюємо на колекцію
        printListStrings(myList);
    }

   
    private static void printListStrings(List<String> list) {//Створення приватного методу
        for (String item : list) {
        
            System.out.print(item + ", ");// Виводимо 
        }
      
        System.out.println();
    }

}
