import java.io.*;
class Program5{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

        System.out.println("Enter array size: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for( int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 1;
        System.out.println("Even Array is: ");
        for(int i = 0; i < n; i++){
            if(arr[i] > max ){
                max = arr [i];
            }
        }
        System.out.println("maximun: " + max);
    }
}