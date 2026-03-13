import java.util.*;
class RemoveVowels{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str1 = sc.nextLine();

        str1 = str1.toLowerCase();

        for(int i = 0; i < str1.length(); i++){

            char ch = str1.charAt(i);

            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                System.out.print(ch);
            }
        }
    }
}