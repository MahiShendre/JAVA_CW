import java.util.*;
class Program6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        //String str = sc.next();
        String str = sc.nextLine();     //better for total sentence

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);

    }
}