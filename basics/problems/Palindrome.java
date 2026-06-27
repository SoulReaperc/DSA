import java.util.Scanner;
public class palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        if (number < 0){
            System.out.println("Palindrome Number");
            return;
        }
        int orignal = number;
        int reversed=0;
        while(number != 0){
            int digit = number % 10; // get the last digit
            reversed = reversed * 10 + digit; //reverse it
            number /= 10; // change the number value to get rid of the left number element
        }
        if (orignal == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        sc.close();
    }
}