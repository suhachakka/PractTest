import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int input =scan.nextInt();
        int sum=0; int temp=input;
        while(input >0){
            int rem=input%10;
            sum=sum+rem;
            input=input/10;
            System.out.println(sum);

        }

        if(temp%sum ==0) {
            System.out.println("Harshad number");
        }else{
                System.out.println("not a Harshad number");

            }
        }
    }

