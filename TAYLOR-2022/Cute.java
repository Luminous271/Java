import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Cute {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("cute.in"));
        int n = scan.nextInt(); scan.nextLine();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(",");
            long a = Long.parseLong(tokens[0]);
            long b = Long.parseLong(tokens[1]);
            long c = Long.parseLong(tokens[2]);
            long val = (long) Math.pow(a, b);
            if (val % Integer.MAX_VALUE <= c) {
                System.out.println("CUTE");
            }
            else {
                System.out.println("NOT CUTE");
            }
        }
    }
}