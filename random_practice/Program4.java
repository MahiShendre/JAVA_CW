/* Task:
Count how many vowels (a, e, i, o, u) are present in the string.  */

import java.io.*;
class Program4{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

        System.out.println("Enter string: ");
        String str1 = br.readLine();

        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u' || str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U' ){
                count++;
            }
        }
        System.out.println("count is: " + count );

    }

    /*
    int count = 0;
    str1 = str1.toLowerCase();
    for(int i = 0; i < str1.length(); i++){
        char ch = str1.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
    }
*/

}