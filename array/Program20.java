import java.util.*;
class Program20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter array element : ");
        for(int i= 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        int max=0;
        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }   
        System.out.println("maximum element is: " + max);
    }
}