import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class ScaryMovie {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("scarymovies.in"));
        int n = scan.nextInt(); scan.nextLine();
        ArrayList<Movie> lstGood = new ArrayList<Movie>();
        ArrayList<Movie> all = new ArrayList<Movie>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int time = scan.nextInt(); double rating = scan.nextDouble(); int am = scan.nextInt();
            if (scan.hasNextLine()) scan.nextLine();
            if (time <= 120 && rating >= 7 && am <= 20) {
                lstGood.add(new Movie(name, time, rating, am));
            }
            all.add(new Movie(name, time, rating, am));
           
        }
        Collections.sort(lstGood);
        System.out.println(lstGood.get(0));
        double max = 0;
        Movie least = null;
        double min = 100000;
        Movie most = null;
        for (Movie m : all) {
            if (m.amount < min) {
                min = m.amount;
                least = m;
            }
            if (m.amount > max) {
                max = m.amount;
                most = m;
            }
        }
        out.println(least + " " + String.format("%.3f", min));
        out.println(most + " " + String.format("%.3f", max));
    }
}
class Movie implements Comparable<Movie> {
    int time;
    double rating;
    int disturb;
    String name;
    double amount;
    public Movie(String name, int time, double rating, int disturb) {
        this.time = time;
        this.rating = rating;
        this.disturb = disturb;
        this.name = name;
        this.amount = (double) this.time / (this.disturb);
    }
    public int compareTo(Movie other) {
   
        if (Math.abs(amount - 7) < Math.abs(other.amount - 7)) {
            return -1;
        }
        else {
            return 1;
        }
    }
    public String toString() {
        return name;
    }
}