import java.util.*;
import java.lang.*;
import java.io.*;

class check
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i = 1;
	    while(true)
	    {
	        int sum = (i * (i + 1))/2;
	        if(sum == i * i)
	        break;
	        i++;
	    }
	    System.out.println(i);
	}
}
