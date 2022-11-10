package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class TakeOne {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("TakeOne.in"));
        int runs = scan.nextInt();
        int total = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < runs; i++){
            if(scan.hasNext())
            total =  total - scan.nextInt();
        }
        if(total > 0)
            out.println(total);  
        if(total <= 0)
            out.println("no more candy");  
    }
}