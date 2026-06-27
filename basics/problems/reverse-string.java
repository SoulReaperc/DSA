import java.util.Scanner;
public class revstring{

    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        
        /*verification and all
        System.out.println("-----" + str.substring(1));
        System.out.println(str.charAt(0));
        System.out.println("++++++++++++"+(str.substring(1)) + str.charAt(0));
        */

        return reverse(str.substring(1)) + str.charAt(0);
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed String: " + reverse(str));





        /*
        ----------------------------------------
        VERY VERY BASIC with string builder
        ----------------------------------------
        */
        System.out.println("Enter the text");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name).reverse();
        System.out.println("Before : "+name);
        System.out.println("After : "+ sb);

        /* END HERE FOR BASIC */
    }
}