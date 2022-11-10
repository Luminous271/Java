import java.util.*;
import static java.lang.System.*;

public class ArrayListAddAll
{
   public static void main(String args[])
   {
      ArrayList<String> words = new ArrayList<String>();
      Collections.addAll(words, "it", "is", "a", "lie");   
      out.println(words);
   }
}