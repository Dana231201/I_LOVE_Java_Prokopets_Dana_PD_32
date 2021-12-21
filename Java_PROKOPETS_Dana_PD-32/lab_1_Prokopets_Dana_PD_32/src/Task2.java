import java.util.Scanner;

public class Task2 { //класс

    public static void main(String[] args) {  //створення публічного метода
        Scanner scanner = new Scanner(System.in);//Створюємо сканер
        int begin, end, step;//Ініціалізуємо змінні
       
        System.out.print("Array begin --> ");
        begin = scanner.nextInt();//Сканер зчитує введене число та присваює його до begin
        
        System.out.print("Array end --> ");
        end = scanner.nextInt();//Сканер зчитує введене число та присваює його до end
       
        System.out.print("Step --> ");
        step = scanner.nextInt();//Сканер введене число та присваює його до step

        for (int i : fillArray(begin, end, step)) {
            System.out.print(i + " "); // Ініціалізатор. заповнення масиву
        }
    }

    
    private static int[] fillArray(int begin, int end, int step){
       
        int size = Math.abs((end - begin) / step + 1);//Рівняння. підготовка до нас. кроків
        int[] array = new int[size];

        int currentNum = begin;
        for (int i = 0; i < size; i++) {
            array[i] = currentNum; //Прораховуємо кроки
            currentNum += step;
        }
        return array;//Повернення масиву
    }
}

