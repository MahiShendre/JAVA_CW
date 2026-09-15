import java.util.*;
class Program29{
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

        int sum1 = 0;
        for(int i = 0; i < row; i++){
            sum1 = sum1 + arr[i][i];
        }
        System.out.println("Sum of primary diagonal : " + sum1);
        int sum2 = 0;
        for(int i = 0; i < row; i++){
            sum2 = sum2 + arr[i][col-1-i];
        }
        System.out.println("Sum of secondary diagonal : " + sum2);
        System.out.println("Product of diagonals is: "+ sum1*sum2);
    }
}