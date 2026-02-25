import java.util.*;
class Program16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter array element : ");
        for(int i= 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        int pro = 1;
        for(int i = 0; i < size; i++){
            if(i % 2 != 0){
                pro = pro * arr[i];
            }   
        }
        System.out.println("Product is : " + pro);
    }
}