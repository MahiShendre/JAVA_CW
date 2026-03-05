import java.io.*;
class Program1{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}