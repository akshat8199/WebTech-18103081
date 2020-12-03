import java.util.*;

class vector{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paragraph : ");
		String s = sc.nextLine();
		System.out.println("Enter the number of strings : ");
		int n = sc.nextInt();
		System.out.println("Enter the strings : ");
		
		HashSet<String> vec=new HashSet<String>();
		for(int i = 0; i < n; i++)
		{String mm = sc.next();
		vec.add(mm);}
		
		s.trim();
		s = s + " ";
		int i = 0;
		String newString = "";
		int k = 0;
		while(s.indexOf(' ', k) != -1)
		{
		    k = s.indexOf(' ', k);
		    String p = s.substring(i, k);
		    if(vec.contains(p))
		    {
		        newString += p.charAt(0);
		        for(int j = 0; j < p.length() - 1; j++)
		        newString += "*";
		    }
		    else newString += p;
		    newString += " ";
		    k++;
		    i = k;
		}
		newString.trim();
		System.out.println(newString);
	}
}
