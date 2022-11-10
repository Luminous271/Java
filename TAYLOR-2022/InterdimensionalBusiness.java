import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class InterdimensionalBusiness {
    public static int[][] mat;
    public static int net;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("InterdimensionalBusiness.in"));
        int runs = scan.nextInt();
        int rows = scan.nextInt();
        int col = scan.nextInt();
        mat = new int[rows][col];
        scan.nextLine();
        for(int i = 0; i < mat.length; i++){  
            mat[i] = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer :: parseInt).toArray();
        }
        int reccur = net + reccur(0, 0);
        out.println(Math.abs(reccur)+1);
        out.println(mat.length);
    }
    static int reccur(int row, int col){
        if(col < mat[0].length-1 && row  < mat.length-1){
            out.println(mat[row][col] + " " + row + " " + col);
            if(mat[row+1][col] > mat[row][col+1]){
                return reccur(row+1,col) + reccur(row,col+1) + mat[row][col];
            }
            if(mat[row+1][col] < mat[row][col+1]){
                return reccur(row,col+1) + reccur(row+1,col) + mat[row][col];
            }
        }
        else{
            return mat[row][col];
        }
        return 0;
    }
    
}