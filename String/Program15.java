import java.util.*;
class Program15{
    public static void main(String[] main){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = sc.nextLine();

        System.out.println(str1);

        StringTokenizer st = new StringTokenizer(str1 , " ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}