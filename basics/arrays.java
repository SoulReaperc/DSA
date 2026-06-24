public class arrays{
    static void arr(int a[]){

        for(int i : a){
        System.out.println(i);
        }

        // or you can do the normal looping also 

        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

    }
    public static void main(String [] args){

        int numbers[]= {1,2,3,4,5};
        arr(numbers);
        
    }
}