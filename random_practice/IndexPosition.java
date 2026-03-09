//Return the index position of the first occurrence.
import java.io.*;
class IndexPosition{
    public static void main(String[] args )throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("enter string: ");
        String str1 = br.readLine();

        System.out.println("enter the character : ");
        char ch = br.readLine().charAt(0);

        System.out.println(str1.indexOf(ch));
    }
}