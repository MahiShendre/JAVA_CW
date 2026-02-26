import java.io.*;
class Program2{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Enter  array size: ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter array element: ");
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        System.out.println("array is: ");
        for( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}