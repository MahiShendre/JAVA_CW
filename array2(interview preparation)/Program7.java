import java.io.*;
class Program7{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

        System.out.println("Enter array size: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for( int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        System.out.println("Array is: ");
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is: " + sum);
    }
}