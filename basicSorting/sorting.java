import java.util.Arrays;
import java.util.Collections;

public class sorting {
    
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i!=array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public static void printArray(Integer array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i!=array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public static int[] bubbleSort(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }    
            }    
        }    
        return array;
    }    

    public static int[] selectionSort(int array[]){
        for (int i = 0; i < array.length-2; i++) {
            int minPos = i;
            for (int j = i+1; j < array.length-1; j++) {
                if (array[minPos]>array[j]) {
                    minPos = j;
                }    
                int temp = array[minPos];
                array[minPos] = array[i];
                array[i] = temp;
            }    
        }    
        return array;
    }    

    public static int[] insertionSort(int array[]){

        for (int i = 1; i < array.length; i++) {
            int curr = i;
            int prev = i-1;
            while (prev>=0 && array[prev]>array[curr]) {
                array[prev+1] = array[prev];
                prev--;
            }    
            array[prev+1] = array[curr];
        }    
        return array;
    }    

    public static int[] countingSort(int array[]){

        // finding largest number
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        // count frequency of numbers
        int count[] = new int[largest+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++; 
        }

        // sorting
        int j= 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }

        return array;
    }    


    public static void main(String[] args) {
        int array[] = {5, 2, 8, 1, 7, 3, 10, 4, 9, 6};
        printArray(bubbleSort(array));
        printArray(selectionSort(array));
        printArray(insertionSort(array));
        printArray(countingSort(array));
        Arrays.sort(array);
        printArray(array);
        
        Integer arr[] = {5, 2, 8, 1, 7, 3, 10, 4, 9, 6};
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
