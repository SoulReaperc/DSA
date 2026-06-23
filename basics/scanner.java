import java.util.Scanner;

public class scanner{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // defining a variable name "sc" with scanner to take system input

        System.out.println("Enter your physics marks");
        double phy = sc.nextDouble();

        System.out.println("Enter your chemistry marks");
        double chem = sc.nextDouble();

        System.out.println("Enter your maths marks");
        double maths = sc.nextDouble();

        /*
        nextLine(): Reads a whole line of text.
        next(): Reads a single word (stops at the first space).
        nextInt(): Reads an integer value.
        nextDouble(): Reads a decimal number.
        nextBoolean(): Reads a true or false value
        */
       double avg = (phy + chem + maths) / 3;
       if(avg >= 90){

        System.out.println("O grade");
       } else if(avg >= 80){
        System.out.println("A grade");
       } else if(avg >= 70){
            System.out.println("B grade");
       } else if(avg >= 60){
            System.out.println("C grade");
       } else if(avg >= 50){
            System.out.println("D grade");
       } else if(avg >= 0 && avg < 50){
            System.out.println("F grade"+);
       } else {
            System.out.println("Recheck your marks");
       }
    }
}