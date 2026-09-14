import java.util.*;
class Program25{
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
        // for(int i=0; i<col; i++){
        //     int sum = 0 ;
        //     for(int j=0; j<row; j++){
        //         sum = sum + arr[i][j];
        //     }
        //     System.out.println("Sum of column "+ (i+1) +" is : "+ sum);
        // }

 // just to avoid confusion of i and j 
        for(int j = 0; j < col; j++){
            int sum = 0;
            for(int i = 0; i < row; i++){
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " is : " + sum);
        }
    }
}
