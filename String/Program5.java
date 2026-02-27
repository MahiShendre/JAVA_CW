import java.util.*;
class Program5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str = sc.next();

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));

    }
}