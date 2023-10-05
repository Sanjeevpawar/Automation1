package iP;

public class reverseStringUsingSplit {

	public static void main(String[] args)
	{
		String s="I will be back in the game";
		String [] sa=s.split(" ");
		
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(sa[i] + " ");
		}
		
		
	}

}
