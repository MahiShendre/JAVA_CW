//Count how many words are present.
import java.io.*;
class   CountWord{
    public static void main(String[] args )throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("enter string: ");
        String str1 = br.readLine();

        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            char ch= str1.charAt(i);
            if(ch != ' ' && (i == 0 || str1.charAt(i-1) == ' ')){       //
               count = count + 1;
            }
        }
        System.out.print("no of words are : " + count);
    }
}
