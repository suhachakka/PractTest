import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please give number:");

        int number = input.nextInt();
        int sum=0,temp = number;
        while(number>0){
            int rem=number%10;            System.out.println(rem);

            sum = (sum*10)+rem;             System.out.println(sum);

            number =number/10;             System.out.println(number);


        }
        if(temp==sum){
            System.out.println("palindrome");
        }else{
            System.out.println(" not palindrome");


        }
    }
}
