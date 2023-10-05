package arrayList;

import java.util.ArrayList;

public class A2 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add("wildcraft");
		a.add("american express");
		a.add("HRX");
		
		for(Object o: a)
		{
			System.out.println(o);
		}
	}

}
