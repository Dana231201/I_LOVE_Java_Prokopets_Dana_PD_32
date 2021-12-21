import java.util.Random;

public class Task1 {
   
    private static final int size = 5;  //constant

  
    public static void main(String[] args) { // створення публічного метода
        int[][] matrix = new int[size][size]; // створення двухвимірного масиву

        for (int i = 0; i < size; i++) {            // перебираємо 
           
            for (int j = 0; j < size; j++) {        //   масив
                matrix[i][j] = new Random().nextInt(10);// робимо масив рандомним 
            }
        }

        printArray(matrix);//выводим матрицу
        System.out.println("\n");//делаем отступ
        printSideDiagonal(matrix);
    }

   
    private static void printArray(int[][] arr){
        for (int i = 0; i < size; i++) {              //виводимо масив чисел
          
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

   
    public static void printSideDiagonal(int[][] arr){
        for (int i = 0; i < size; i++) {
           
            for (int j = 0; j < size; j++) {            //виводимо п діагоналі 
                if(size == (i + j + 1))
                    System.out.print(arr[i][j] + " ");
            }
        }
    }

}
