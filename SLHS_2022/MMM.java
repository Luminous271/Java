import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class MMM {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        in.nextLine();
        while(r  > 0){
            String solve = "";
            int num = in.nextInt();
            if(num%1000 != 0){
                solve += num/1000 + ":";
                num%=1000;
            }
            else
                solve += "0:";
                if(num%100 != 0){
                    solve += num/100 + ":";
                    num%=100;
                }
                else
                    solve += "0:";
                    if(num%50 != 0){
                        solve += num/50 + ":";
                        num%=50;
                    }
                    else
                        solve += "0:";
                        if(num%20 != 0){
                            solve += num/20 + ":";
                            num%=20;
                        }
                        else
                            solve += "0:";
                            if(num%10 != 0){
                                solve += num/10 + ":";
                                num%=10;
                            }
                            else
                                solve += "0:";
                                if(num%5 != 0){
                                    solve += num/5 + ":";
                                    num%=5;
                                    solve+=num;
                                }
                                if(num%1 != 0){
                                    solve += num/1 + ":";
                                }

            
        System.out.println(solve);
            r--;
        }
    }
}