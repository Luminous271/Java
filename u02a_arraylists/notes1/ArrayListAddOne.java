//© A+ Computer Science
// www.apluscompsci.com

//ArrayList add() example

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListAddOne
{
   public static void main(String args[])
	{
		ArrayList<String> words;
		words = new ArrayList<String>();

		words.add("it");
		words.add("is");
		words.add("a");
        words.add(0,"lie");   // try rewriting as add(0,"lie");
        //words.add(0,"cake");
		out.println(words);
	}
}