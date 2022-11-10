package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Boo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("boo.in"));
        String line = scan.nextLine();
        for (char ch : line.toCharArray()) {
            if (ch == 'N') {
                out.println("Nobody's There");
            }
            else {
                out.println("Boo!");
            }
        }
        
    }
}