import java.util.*;
import java.lang.*;
import java.io.*;

class string_sort
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string : ");
	    s = sc.next();

	    int j = 0;
        char temp = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i < chars.length; i++)
        {
            for(j=0; j < chars.length; j++)
            {
                if(chars[j] > chars[i])
                {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        s = new String(chars);
	    System.out.println(s);
	}
}
