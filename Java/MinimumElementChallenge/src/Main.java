import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);
        findMin(array);
    }

    public static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void findMin(int[] array){

        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Minimum number in the array is: " + min);

    }
}
