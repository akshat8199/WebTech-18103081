import java.util.*;
import java.lang.*;
import java.io.*;

class hailstone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    n = sc.nextInt();
	    System.out.print(n + " ");
	    while(n != 1)
	    {
	        if(n % 2 == 1)
	        n = n * 3 + 1;
	        else
	        n = n / 2;
	        System.out.print(n + " ");
	    }
	}
}
