public class Main {
    private static final int MINIMAL_ARRAY_SIZE = 3;//constant 

    public static void main(String[] args) { // Створення паб мас 
        System.out.println(findUniq(new double[] { 1, 1, 1, 2, 1, 1 }));      //Масив дан.
        
        int sortedArr[] = selectionSortOdd(new int[] { 5, 3, 2, 8, 1, 4 });   //Масив дан.
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }

    }
    //Завдання  1)
   
    private static double findUniq(double arr[]){
        double uniqItem = 0;

        if(arr[0] != arr[1] && arr[0] != arr[2]) {
            uniqItem = arr[0];
        } else if (arr[1] != arr[0] && arr[1] != arr[2]){
            uniqItem = arr[1];
        } else {                                                //Проходимо по масиву та перераховуємо осередки у пошуку унікальної двійки
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] != arr[0]){
                    uniqItem = arr[i];
                    break;
                }
            }
        }
        return uniqItem;
    }

    //Завдання  2)
   
    private static int[] selectionSortOdd(int arr[]){
        if(arr.length == 0) { return arr; }

        for (int i = 0; i < arr.length; i++) {   //Сортування непарних чисел у порядку зростання
            if(arr[i] % 2 == 0) { continue; }

            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] % 2 == 0) { continue; }

                if(arr[j] < min){
                    min = arr[j];
                    minId = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        return arr;
    }

}