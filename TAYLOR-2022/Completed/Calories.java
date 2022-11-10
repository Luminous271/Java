package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Calories {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("calories.in"));
        int runs = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < runs; i++){
            if(scan.nextLine().equals("*")){
                
                int g = scan.nextInt();
                int ini = scan.nextInt();
                int t = scan.nextInt();
                int netCal = 0;
                while(scan.hasNextInt()){
                    netCal = netCal + scan.nextInt();
                    
                }
                if(scan.hasNextLine())
                scan.nextLine();
                int during = ini + netCal;
                during = during + t;
                if(during > g){
                    out.println("He needs to lose " + (during - g) + " calories");
                }
                if(during < g){
                    out.println("He needs to gain " + (g - during) + " calories");
                }
                if(during == g){
                    out.println("He needs to maintain weight");
                }
            }
        }
    }
}