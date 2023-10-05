package PRACTICE;

public class MinOfArray {

	public static void main(String[] args) {
		int[]a= {212,43,22,65,75,23,43};
		int min=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

}
