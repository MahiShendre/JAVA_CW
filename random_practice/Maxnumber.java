//Find the largest number in the array.
import java.util.*;
class Maxnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[]{3, 8, 2, 10, 54};

        int max = 1;
        for(int i = 0; i < arr.length; i++){
            if( max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum is : " + max );

    }
}







