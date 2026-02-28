import java.util.*;
class Program10{
    public static void main(String[] main){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = sc.next();

        System.out.println("Enter string: ");
        String str2 = sc.next();

        String str3 = str1.concat(str2);
        System.out.println("String is: " + str3);
        System.out.println("Length : " + str3.length());

    }
}