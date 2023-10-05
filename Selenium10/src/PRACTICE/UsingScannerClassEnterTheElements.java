package PRACTICE;

import java.util.Scanner;

public class UsingScannerClassEnterTheElements {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of array");
		
		int size=sc.nextInt();
		int a[]=new int[size];
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Please enter the number at index");
		
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			max=a[i];
		
		}
		System.out.println(max);	
		
	}
}


