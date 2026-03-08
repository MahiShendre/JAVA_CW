//Count how many times a specific character appears
import java.io.*;
class Frequency{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Enter string: ");
        String str1 = br.readLine();

        System.out.print("Enter character: ");
        char ch = br.readLine().charAt(0);

        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == ch){
                count = count + 1;
            }
        }
        System.out.println("count is : " + count);

    }
}