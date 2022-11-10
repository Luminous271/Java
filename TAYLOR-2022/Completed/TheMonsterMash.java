package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class TheMonsterMash {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("monstermash.in"));
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % (a *b) == 0) {
                System.out.println("It was a graveyard smash!");
            }
            else if (i % a == 0){
                out.println("He did the Monster Mash!");
            }
            else if (i % b == 0) {
                out.println("He did the flash,");
            }
            else {
                out.println("He did the mash,");
            }
        }
        
    }
}