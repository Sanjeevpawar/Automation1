package Misc;

public class reverseStringUsingCharAt {

	public static void main(String[] args) {

		String sa="Discipline is the key";
		String s="";
		
		for(int i=sa.length()-1;i>=0;i--)
		{
			s=s+sa.charAt(i);
		}
		
		System.out.print(s + " ");
	}

}
