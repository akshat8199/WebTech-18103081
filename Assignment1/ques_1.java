import java.util.*;

class Check_Substring{
    
    public static boolean areAllZeroes(int[] arr)
    {
    	for(int i=0;i<26;i++)
    	{
    		if(arr[i]!=0)
    			return false;
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String s = sc.next();
		int subLen = s.length();
		int inputLen = input.length();
		if(inputLen < subLen)
		{
			System.out.println(0);
			return;
		}
		int[] arr = new int[26];
		int ans=0;
		for(int i=0;i<subLen;i++)
		{
			arr[input.charAt(i)-'a']++;
			arr[s.charAt(i)-'a']--;
		}
		if(areAllZeroes(arr))
		ans++;
		
		for(int i=subLen;i<inputLen;i++)
		{
			arr[input.charAt(i-subLen)-'a']--;
			arr[input.charAt(i)-'a']++;
			if(areAllZeroes(arr))
				ans++;
		}
		System.out.println(ans);
	}
}
