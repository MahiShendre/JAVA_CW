import java.util.*;
class Program13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        char arr[]= new char[size];
        System.out.println("Enter array element : ");
        for(int i= 0; i < size; i++){
            arr[i] = sc.next().charAt(0);
        }
        
        System.out.println("array is: ");
        for(int i = 0; i < size; i++){
            if( arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
                System.out.println(arr[i] + " at index " + i);
        }   
    }
}