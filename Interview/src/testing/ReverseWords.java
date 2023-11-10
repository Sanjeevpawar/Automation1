0package testing;

public class ReverseWords {

	public static void main(String[] args) {
		String s="Poland I am coming";
		
		String[] rev=s.split(" ");
		
		
		for(int i=s.length()-1;i<=0;i--)
		{
			System.out.println(" " + rev[i]);
		}
		
		
		
	}

}
