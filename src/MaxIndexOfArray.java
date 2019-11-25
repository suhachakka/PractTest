import java.util.Scanner;

public class MaxIndexOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give an array");
        int[] array1 = new int[]{110, 45, 700, 8, 109};
        int max = findMaxIndexValue(array1);
        System.out.println("Max_index of an array is:"+max);
    }


    public static int findMaxIndexValue(int[] array) {
        int maxValue = array[0];
     int max_index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue ) {
                maxValue = array[i];

                max_index=i;
            }
        }
        return max_index ;
    }

}
