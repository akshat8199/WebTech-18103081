import java.util.*;
import java.lang.*;
import java.io.*;

class Anagrams
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	    String b = sc.next();
	    
	    if(a.length() != b.length())
	    {
	        System.out.println("Strings lengths don't match!! So they can never be anagrams");
	        return;
	    }
	    else
	    {
	        char[] arr = a.toCharArray();
            Arrays.sort(arr);
            a = new String(arr);
            arr = b.toCharArray();
            Arrays.sort(arr);
            b = new String(arr);
            if(a.equals(b))
            System.out.println("The strings are anagrams");
            else
            System.out.println("The strings are not anagrams");
	    }
	}
}
