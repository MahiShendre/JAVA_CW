import java.util.*;
class Program28{
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
        // int sum = 0;
        // for(int i=1; i<row; i++){
        //     for(int j=col; j>=1; j--){
        //         sum = sum + arr[i][j-i];
        //     }
        // }

        int sum = 0;
        for(int i = 0; i < row; i++){
            sum = sum + arr[i][col - 1 - i];
        }
        System.out.println("sum : " + sum);
    }
}

