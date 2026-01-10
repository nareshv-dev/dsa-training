import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
    /* n --> Number of person
    At the annual meeting of Board of Directors of Acme Inc. 
    If everyone attending shakes hands exactly one time with every other attendee, 
    how many handshakes are there? */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * (n - 1) / 2);
    }
}
 