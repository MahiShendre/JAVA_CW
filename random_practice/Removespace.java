//Remove all spaces from the string.
import java.io.*;
class Removespace{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter string: ");
        String str1 = br.readLine();

        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch != ' '){
                System.out.print(ch);
            }
        }
    }
}