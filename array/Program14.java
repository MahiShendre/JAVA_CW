import java.util.*;
class Program14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter array element : ");
        for(int i= 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enetr the number to search in array : ");
        int search = sc.nextInt();

        for(int i = 0; i < size; i++){
            if(arr[i] == search ){
                System.out.println(arr[i] + " found at index "+ i);
            }
        }
    }
}