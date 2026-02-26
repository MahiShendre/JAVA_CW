import java.io.*;

class Program1{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        int arr[] = new int[] {1, 2, 3, 4, 5};
        for( int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
