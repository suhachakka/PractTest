package StaticMethods;

import java.util.Scanner;

public class Factorial {
    public static void checkFactorialNumber() {
        int number;int factorialNumber = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        for (int i = 1;i <=number; i++) {
           factorialNumber=factorialNumber* i;
        }

        System.out.println(factorialNumber);

    }
}
