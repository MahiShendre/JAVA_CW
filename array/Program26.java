import java.util.*;
class Program26{
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

        System.out.println("Array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] % 3 ==0){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}