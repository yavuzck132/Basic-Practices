import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        int length = scanner.nextInt();
        scanner.nextLine();
        int[] array1 = getIntegers(length);
        printArray(array1);
        int[] array2 = sortIntegers(array1, length);
        printArray(array2);

    }

    public static int[] getIntegers(int length){

        int[] array = new int[length];

        for(int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){

        System.out.println();
        System.out.println(Arrays.toString(array));

    }

   public static int[] sortIntegers(int[] array, int length){

        int x;
        int[] sortedArray = new int[length];

        for(int i = 0; i < length; i++){

            sortedArray[i] = array[i];


            for(int j = 0; j < i; j++) {

                if (sortedArray[i] > sortedArray[j]){
                    x = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = x;
                }
            }
        }
        return sortedArray;
    }
}
