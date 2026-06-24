public class functions{

    static void hello(){ // without parameter
        System.out.println("hello, this is a function");
    }

    static void greet(String name){ // parameterized constructor  
        System.out.println("hello " + name);
    }

    static int add(int a , int b){ //return constructor
        return a + b ;
    }

    static int factorial(int n){ // recursive function
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main (String [] args){

        hello();

        greet("Soulreaper");

        int result = add(10, 15);
        System.out.println(result);

        System.out.println(factorial(5));
    }
}