package PRACTICE;

public class PrintOddEvenNumber {

	public static void main(String[] args) {
		int  []a= {1,2,3,4,5,6,7,8,9,10};
		int osum=0;
		int esum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				osum=osum+a[i];
			}
			else
			{
				esum=esum+a[i];
			}
			
		}
		System.out.println("The sum of odd numbers is"+osum);
		System.out.println("The sum of even numbers is"+esum);
	}

}
