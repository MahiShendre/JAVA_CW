import java.util.*;
class Program7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter array element : ");
        for(int i= 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("array is: ");
        for(int i = 0; i < size; i++){
            if(arr[i] % 4 == 0){
                System.out.println(arr[i] + " is divisible by 4 and index is " + i);
            }
        }   
    }
}