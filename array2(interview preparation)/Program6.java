import java.io.*;
class Program6{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

        System.out.println("Enter array size: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for( int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = 100;
        System.out.println("Array is: ");
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr [i];
            }
        }
        System.out.println("minimum: " + min);
    }
}