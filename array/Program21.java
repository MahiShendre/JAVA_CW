import java.util.*;
import java.io.*;
// Scanner and Buffered reader use karun asnwer tr aalay but as use nka karu donhi ekach code madhe because answer mixed hou shakate as per chatgpt
class Program21{
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of row : ");
        int row = sc.nextInt();

        System.out.println("Enter number of column: ");
        int col =Integer.parseInt(br.readLine());

        System.out.println("Enter array elements: ");
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}