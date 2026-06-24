public class sting{
    public static void main (String [] args){
        
        String name = "SoulReaper";

        //        STRING
        System.out.println("String :" + name);
        System.out.println("String Length :" + name.length());
        System.out.println("First character :" + name.charAt(0));
        System.out.println("Substring :" + name.substring(1,5));

        //        StringBuilder
        // S O U L R E A P E R
        // 0 1 2 3 4 5 6 7 8 9

        StringBuilder sb = new StringBuilder(name);
        System.out.println("StringBuilder String : " + sb);


        sb.append(" Java");
        System.out.println("After append : " + sb);

        sb.insert(10, " learning");
        System.out.println("After insert : " + sb);

        sb.delete(10,18);
        System.out.println("After delete : " + sb);

        sb.reverse();
        System.out.println("After reverse : " + sb);


    }
}