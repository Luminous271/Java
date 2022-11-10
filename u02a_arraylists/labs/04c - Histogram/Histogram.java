//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
      letters = new ArrayList<Character>();
      count = new ArrayList<Integer>();
      for(int i = 0; i < values.length; i++){
         letters.add(values[i]);
         count.add(0);
      }
      fileName = fName;
      
		out.println("search letters = "+letters);
      
      
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      Scanner scan = new Scanner(new File(fileName));
      while(scan.hasNextLine()){
         String line = scan.nextLine();
         for(int i = 0; i < letters.size(); i++){
         int coun = 0;
            for(int j = 0; j < line.length(); j++){
               if(letters.get(i) == line.charAt(j))
                  coun++;
            }
         count.set(i, count.get(i)+coun);
         }
      }
	}

	public char mostFrequent()
	{
      int most = 0;
      int index = 0;
      for(int i = 0; i < count.size(); i++)
         if(count.get(i) > most){
            most = count.get(i);
            index = i;
         }
      
		return letters.get(index);
	}

	public char leastFrequent()
	{
      int least = Integer.MAX_VALUE;
      int index =0;
      for(int i = 0; i < count.size(); i++)
         if(count.get(i) < least){
            index = i;
            least = count.get(i);
            
         }
      
		return letters.get(index);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}