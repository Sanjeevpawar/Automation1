package PRACTICE;

public class SumOfMaxAndMinElement {

	public static void main(String[] args) {
		int[]a= {212,43,22,65,75,23,43};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(max+min);
	}

}
