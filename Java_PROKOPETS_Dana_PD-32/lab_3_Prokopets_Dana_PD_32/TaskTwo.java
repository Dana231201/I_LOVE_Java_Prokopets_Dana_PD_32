package lab_4;

import java.util.*;                              //Імпорт бібліотек 
 
public class TaskTwo {

    public static void main(String[] args) {    //Створення громадського методу 
        System.out.print("Enter size of Array: ");
        int size = (new Scanner(System.in)).nextInt(); // size бере дані які виходять із сканування того, що написав користувач
       
        int[] arr = new int[size]; //Створення масиву 
      
        fillArrayRandomValues(arr, 0, 9); //Заповнюємо масив рандом числами
        printArray(arr); 

        OptionalDouble result = Arrays.stream(arr) //OptionalDouble - активація тру фолс через дабл стрім переозброєння в потік
              
        .filter(item -> item % 2 == 0) //Фільтрування даних
             
        .average(); // Повертає OptionalDouble, що описує середнє арифметичне елементів цього потоку

        System.out.println(result.getAsDouble()); //Чи є  значення є в  OptionalDouble
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");    //Виводить масив через кому в консоль
        }
        System.out.println();
    }

    private static void fillArrayRandomValues(int[] arr, int begin, int end) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(end - begin + 1) + begin;           //Рандомні числа
        }
    }
}