import java.util.*;

class Program3{
    public static void main(String[] main){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.next();

        System.out.println("Enter index number: ");
        int index = sc.nextInt();

        System.out.println(str.charAt(index));

    }
}