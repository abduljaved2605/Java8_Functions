package practice;

public class recursive {
	
	static int rec(int i) {
		if(i == 0)
		{
			return 1;
		}
		else {
			return (i *rec(i-1));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Factorial of a number "+rec(4));
	}

}
