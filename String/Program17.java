import java.util.*;
class Program17{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter string: ");
        String str1 = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str1 , ", ");    //space after comma is important else use trim
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}