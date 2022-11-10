import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class DryRun {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int runs = in.nextInt();
        int total = 0;
        while(runs > 0){
            total += in.nextInt();
            runs--;
        }
        System.out.println(total);
        System.out.println("Robert Segovia, Gora Bepary, Joseph Steele");
        System.out.println("Team 25");
        
    }
}