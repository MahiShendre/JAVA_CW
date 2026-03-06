//Reverse each word but keep the word order the same.

import java.io.*;
class ReverseWords{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence:");
        String str = br.readLine();

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            StringBuffer sb = new StringBuffer(words[i]);
            System.out.print(sb.reverse() + " ");
        }
    }
}