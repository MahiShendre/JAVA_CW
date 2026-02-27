import java.util.*;
class Program4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.next();
      
        System.out.println("Enter second string: ");
        String str2 = sc.next();
        
        String m = str1.toLowerCase();
        String n = str2.toLowerCase();

        if(m.equals(n)){
            System.out.println("equal");
        }else{
            System.out.println("Not - equal");
        }
    }
}