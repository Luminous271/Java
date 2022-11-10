package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class CoffeeMaker {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("coffeemaker.in"));
        int n = scan.nextInt(); scan.nextLine();
        Map<String, Long> map = new TreeMap<String, Long>();
        map.put("MW", (long)1000000);
        map.put("GW", (long) 1000000000);
        map.put("W", (long) 1);
        map.put("kW",(long) 1000);
        for (int i = 0; i < n; i++) {
            long max = scan.nextInt() * map.get(scan.next()); scan.nextLine();
            long curr = scan.nextInt() * map.get(scan.next()); scan.nextLine();
            long coffee = scan.nextInt() * map.get(scan.next()); 
            if (scan.hasNextLine())
                scan.nextLine();
            if (coffee + curr <= max) {
                out.println("The coffee maker can be plugged in");
            }
            else {
                out.println("The coffee maker cannot be plugged in");
            }
        }
        
    }
}