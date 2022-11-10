package Completed;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class MandyMode {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("mandymode.in"));
        int runs = scan.nextInt();
        String vowels = "aeiou";
        scan.nextLine();
       /* */ for(int i = 0; i < runs; i++){
            String[] candies = scan.nextLine().split(",");
            int[] number = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer :: parseInt).toArray();
            int numCandies = number.length;
            //find index of values
            for(int nC = 0; nC < numCandies; nC++){
                String currCandy = candies[nC]; 
                int index = 0;           
                for(int a = 1; a <= currCandy.length(); a++){
                    if(vowels.contains(currCandy.substring(a-1, a))) {
                        index = a-1;
                        break;
                    }
               
                }
                for (int j = 0; j < number[nC]; j++) 
                if (currCandy.charAt(currCandy.length() - 1) == 's') {
                    out.println("m" + currCandy.substring(index, currCandy.length()-1));
                }
                else {
                    out.println("m" + currCandy.substring(index));
                }
            }
        }
    }
}