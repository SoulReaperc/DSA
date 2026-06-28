import java.util.Scanner;
public class factorial{
    static int factor(int num){
        if(num == 0){
            return 1;
        }
        return num * factor(num-1);
    } 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(factor(num));
        sc.close();
    }
}