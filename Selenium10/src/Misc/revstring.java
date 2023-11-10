package Misc;

public class revstring {
	
	public static void main(String[] args) {
		
		String s="Whats happening with me";
		String [] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(" " + s1[i]);
		}
	}

}
