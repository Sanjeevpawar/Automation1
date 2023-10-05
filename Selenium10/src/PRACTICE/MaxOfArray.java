package PRACTICE;

public class MaxOfArray {

	public static void main(String[] args) {
		int[]a= {5,1,6,2,7,8};
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			System.out.println(max);
		}
		
	}

}
