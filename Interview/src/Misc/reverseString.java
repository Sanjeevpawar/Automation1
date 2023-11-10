package Misc;

public class reverseString {

	public static void main(String[] args) {

		String s="Discipline is the key";
		String [] sa=s.split(" ");
		
		
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(sa[i]+ " ");
		}
	}

}
