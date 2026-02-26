import java.io.*;

class Program2_M{
    public static void main ( String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Our Required array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
