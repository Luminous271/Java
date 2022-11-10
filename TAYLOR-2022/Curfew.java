import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Curfew {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("halloweencurfew.in"));
        int n = scan.nextInt(); scan.nextLine();
        for (int i = 0; i < n; i++) {
            int time = 0;
            String[] tokens = scan.nextLine().split(" ");
            String t = tokens[0];
            
            int index = t.indexOf(":");
            time += (Integer.parseInt(t.substring(0, index)) * 60);
            time += Integer.parseInt(t.substring(index + 1));
            time += Integer.parseInt(tokens[1]);
            String name = tokens[2];
           
            String cur = tokens[3];
            int curfew = 0;
            index = cur.indexOf(':');
            curfew += (Integer.parseInt(cur.substring(0, index)) * 60);
            curfew += Integer.parseInt(cur.substring(index + 1));
            if (time <= curfew) {
                out.println(name + " is not in trouble");
            }
            else {
                out.println(name + " is in trouble");
            }
            out.println(t);
          
        }
        
    }
}