import java.util.*;
import java.lang.*;
import java.io.*;

class counting_sort
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of the array : ");
	    n = sc.nextInt();
	    System.out.println("Enter the elemnets");
	    int a[] = new int[n];
	    
	    for(int i = 0; i < n; i++)
	    a[i] = sc.nextInt();
	    
	    int counting[] = new int[21];
	    Arrays.fill(counting, 0);
	    
	    for(int i = 0; i < n; i++)
	        counting[a[i]]++;
	        
        for(int i = 1; i < 21; i++)
            counting[i] = counting[i] + counting[i - 1];
            
	    int output[] = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	        output[counting[a[i]] - 1] = a[i];
	        counting[a[i]]--;
	    }
	    
	    //print
	    System.out.println();
	    for(int i = 0; i < n; i++)
	    System.out.print(output[i] + " ");
	}
}
