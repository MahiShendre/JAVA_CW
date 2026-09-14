import java.util.*;
class Program24{
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

        for(int i=0; i<row; i++){
            int sum = 0 ;
            for(int j=0; j<col; j++){
                if((i+1)%2!=0){         //if(i%2==0) because i is starting from zero
                    sum = sum + arr[i][j];
                }
            }
            if((i+1)%2!=0){
                System.out.println("Sum of row "+ (i+1) +" is : "+ sum);
            }
        }
    }
}