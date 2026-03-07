//Check if the string is palindrome.
import java.io.*;
class Palindrome{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Enter string : ");
        String str1 = br.readLine();
        str1 = str1.toLowerCase();

        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        String str2 = sb.toString();;
        if( str1.equals(str2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}