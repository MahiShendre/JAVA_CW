import java.util.*;
class Program17{
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
        if(size % 2 ==0){
            for(int i = 0; i < size; i+=2){
                System.out.println(arr[i] + " ");
            }
        }else{
            for(int i = 0; i < size; i++){
                System.out.println(arr[i] + " ");
            }
        }
    }
}