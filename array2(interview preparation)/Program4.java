import java.io.*;
class Program4{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for( int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Even Array is: ");
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0 ){
                System.out.println(arr[i] + " ");
            }
        }
    }

}