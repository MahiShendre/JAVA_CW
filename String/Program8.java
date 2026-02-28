import java.util.*;
class Program8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();     //better for total sentence

        if(str.startsWith("hello")) {
            System.out.println("Yes, it starts with hello");
        } else if(str.startsWith("Hello")) {
            System.out.println("Yes, it starts with Hello"); 
        }else {
            System.out.println("No, it does not start with hello");
        }
    }
}

