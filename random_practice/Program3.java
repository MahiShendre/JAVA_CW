import java.io.*;
class Program3{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

        for (int i = 5; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
* * * * * 
* * * *
* * *
* *
*
*/