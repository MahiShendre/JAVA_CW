import java.util.*;
class Program16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1 = sc.nextLine();
        String str2 = str1;

        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        str1 = sb.toString();
        System.out.println(str1);

        if(str1.equals(str2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}