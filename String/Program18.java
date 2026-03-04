import java.util.*;
class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String sent = sc.nextLine();

        System.out.println("Enter substring to check: ");
        String sub = sc.nextLine();

        if (sent.contains(sub)) {
            System.out.println("This sentence contains the substring " + sub );
        } else {
            System.out.println("This sentence does not contain the substring " + sub );
        }
    }
}