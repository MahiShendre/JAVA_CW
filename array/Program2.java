import java.util.*;
class Program2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        if( size == 10 ){
            int arr[]= new int[size];
            System.out.println("Enter array element : ");
            for(int i= 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
        
            System.out.println("array is: ");
            for(int i = 0; i < size; i++){
                System.out.println(arr[i]);
            }
        }else{
            System.out.println("Error : the size of array sholud be 10 ");
        }
        
    }
}