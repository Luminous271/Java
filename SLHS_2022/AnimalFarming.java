import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class AnimalFarming {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.nextLine();
        while(i > 0){
                String[]  num = in.nextLine().split(" ");
                if(Integer.parseInt(num[0]) == Integer.parseInt(num[1]) && Integer.parseInt(num[1]) == Integer.parseInt(num[2]) && Integer.parseInt(num[2]) == Integer.parseInt(num[3])){
                    out.println("sheep");
                }
                else if(Integer.parseInt(num[0]) == Integer.parseInt(num[2]) && Integer.parseInt(num[1]) == Integer.parseInt(num[3])){
                    out.println("cattle");
                }
                else
                    out.println("pigs");
            
            i--;
        }
    }
}