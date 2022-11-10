//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab04c
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram(new char[]{'a','b','c'},"lab04c1.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test.mostFrequent());
		out.println("Letter occurring least : "+test.leastFrequent());
		out.println("\n");
		out.println(test);

		test = new Histogram(new char[]{'d','e','a'},"lab04c2.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test.mostFrequent());
		out.println("Letter occurring least : "+test.leastFrequent());
		out.println("\n");
		out.println(test);

		test = new Histogram(new char[]{'x','a','r','g'},"lab04c3.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test.mostFrequent());
		out.println("Letter occurring least : "+test.leastFrequent());
		out.println("\n");
		out.println(test);
      
      
      //some other tests from cs2
      
      Scanner kb = new Scanner(System.in);
      out.println("what: ");
      String a = kb.nextLine();
      out.println("how: ");
      int e = kb.nextInt();
      out.println("oh: ");
      kb.nextLine();
      String b = kb.nextLine();
      out.println("that: ");
      int c = kb.nextInt();
      out.println(a + " " + b + c + e);
      
	}
}