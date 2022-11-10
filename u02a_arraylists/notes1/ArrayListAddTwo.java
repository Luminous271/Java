//© A+ Computer Science
// www.apluscompsci.com

//ArrayList add() example

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListAddTwo
{
   public static void main(String args[])
	{
		ArrayList<Integer> nums;
		nums = new ArrayList<Integer>();

		nums.add(new Integer(34));
		nums.add(0,99);
		nums.add(21);
		nums.add(11);
        out.println(nums);
		//nums.add(4,77);
		//out.println(nums);
	}
}