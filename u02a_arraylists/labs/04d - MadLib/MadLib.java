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

public class MadLib
{
	//add in three ArrayList instance variables
		//1 for nouns, 1 for adjectives, and 1 for verbs
	
	public MadLib()
	{
	}

	public MadLib(String fileName)
	{
		//load stuff
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{		
		}
		catch(Exception e)
		{
		}			
	}
	
	public void loadVerbs()
	{
		try{	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{	
		return "";
	}
	
	public String getRandomNoun()
	{		
		return "";
	}
	
	public String getRandomAdjective()
	{		
		return "";
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}