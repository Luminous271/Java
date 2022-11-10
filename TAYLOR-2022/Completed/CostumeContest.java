package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class CostumeContest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("costumecontest.in"));
        int c = scan.nextInt(); int j = scan.nextInt(); scan.nextLine();
        List<Costume> lst = new ArrayList<Costume>();
        for (int i = 0; i < c; i++) {
       
            String name = scan.next();
            int total = 0;
            for (int k = 0; k < j; k++) {
                total += scan.nextInt();
            }
            lst.add(new Costume(name, total));
           
        }
        Collections.sort(lst);
        for (int i = 0; i < 3; i++) {
            System.out.println(lst.get(i));
        }
    }
}

class Costume implements Comparable<Costume> {
    String name;
    int total;

    public Costume(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public int compareTo(Costume other) {
        if (total - other.total == 0) {
            return name.compareTo(other.name);
        }
        return other.total - total;
    }
    public String toString() {
        return name;
    }
}