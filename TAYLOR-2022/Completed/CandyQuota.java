package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class CandyQuota {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("CandyQuota.in"));
        while(scan.hasNextLine()){
            int[] number = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
                out.println(number[0] * 11 + number[1] * 20 + number[2] * 8 <= 600);
        }
    }
}