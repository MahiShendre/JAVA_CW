import java.util.*;
class Program30{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of row : ");
        int row = sc.nextInt();
        System.out.println("Enter number of column: ");
        int col =sc.nextInt();

        System.out.println("Enter array elements: ");
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Corner elements are : ");
        System.out.print(arr[0][0] +" ");              // top-left
        System.out.print(arr[0][col-1] +" ");          // top-right
        System.out.print(arr[row-1][0] +" ");          // bottom-left
        System.out.print(arr[row-1][col-1] +" ");      // bottom-right
    }
}