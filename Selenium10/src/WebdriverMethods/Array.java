package WebdriverMethods;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the numbers");
		int[] a=new int[5];
		for(int i=0;i<=a.length-1;i++)
		{
		a[i]=sc.nextInt();
		}
		int sum=0;

		
		// Sum of array elements
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum + " Is the sum of elements of the array");
		
		// Find max number in the array
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}

		System.out.println(max + " Is the largest number in the array");
		
		
		
	}

}
