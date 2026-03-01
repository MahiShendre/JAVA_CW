import java.util.*;
class Program12{
    public static void main(String[] main){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = sc.next().intern();

        System.out.println("Enter string: ");
        String str2 = sc.next().intern();

        if( str1 == str2){
            System.out.println("equals");
        }else{
            System.out.println("false");
        }
    }
}