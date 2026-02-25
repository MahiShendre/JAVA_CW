import java.util.*;
class Program8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter Age : ");
        for(int i= 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 1;
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }   
        System.out.println("Count is : " + count);
    }
}