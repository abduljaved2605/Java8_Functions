package practice;

import java.util.HashMap;

public class Driver {
	
	static int rec(int i)
	{
		
		return (i * rec(i-1));
	}
	
public static void main(String[] args) {
	
	String cha = "Geek";
	
	char[] numberOfChar = cha.toCharArray();
	HashMap<Character, Integer> hashCounter = new HashMap<Character, Integer>();
	
	for(char isCharPresent : numberOfChar)
	{
		if(hashCounter.containsKey(isCharPresent))
		{
			hashCounter.put(isCharPresent, hashCounter.get(isCharPresent)+1);
		} else {
			hashCounter.put(isCharPresent, 1);
		}
	}
	System.out.println("the hash map"+hashCounter);
	
	String a ="1";
	String b = "a";
	if(a.equals(b))
	{
		System.out.println("a and be equal");
	}
	else
	{
		if (a == b)
		{
			System.out.println("memory contens equal");

		}
	}
	
	int i;
	int fact =1;
	int  um=5;
	for(i=1; i<=um;i++)
	{
		fact= fact*i;
	}
	System.out.println("The factorial is"+fact);
	
	int facto=1;
	//System.out.println("Factorial by recursion "+rec(um));
	
}
	

}
