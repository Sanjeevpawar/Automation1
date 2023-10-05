package basic;

public class split {

	public static void main(String[] args) {

		
		String s=" India is my country";
		
		String[] sa=s.split(" ");
		
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(" " + sa[i]);
		}
		
	}

}
