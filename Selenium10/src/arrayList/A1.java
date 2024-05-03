package arrayList;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {

		ArrayList vegetables=new ArrayList(5);
		
		vegetables.add("carrot");
		vegetables.add("cucumber");
		vegetables.add("beetroot");
		
	
		ArrayList b=new ArrayList();
		b.add("lily");
		b.add("Rose");
		b.add("Lotus");
		b.add("Jasmine");
		
		
		
		vegetables.addAll(b);
		
		System.out.println(vegetables);
		
	}

}
