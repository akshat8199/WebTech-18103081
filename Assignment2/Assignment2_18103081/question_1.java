import java.util.*;
import java.lang.*;
import java.io.*;

class order
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String a, b;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String 1 : ");
	    a = sc.next();
	    System.out.println("Enter String 2 : ");
	    b = sc.next();
	    
	    int m = (a.length() < b.length())? a.length() : b.length();
	    int i = 0;
	    for(; i < m; i++)
	    {
	        if(a.charAt(i) != b.charAt(i))
	        {
	            if(a.charAt(i) > b.charAt(i))
	            System.out.println(a + " is greater than " + b);
	            else
	            System.out.println(b + " is greater than " + a);
	            break;
	        }
	    }
	    
	    if(i == m)
	    {
	        if(a.length() == b.length())
	        System.out.println(a + " and " + b + " are the same strings");
	        else if(a.length() > b.length() )
	        System.out.println(a + " is greater than " + b);
	        else
	        System.out.println(b + " is greater than " + a);
	    }
	}
}
