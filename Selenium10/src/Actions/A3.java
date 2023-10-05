package Actions;

import java.util.ArrayList;

public class A3 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add("Mango");
        a.add("Apple");
        a.add("Grapes");
        a.add("Guava");
        
        System.out.println(a);
        a.remove("Apple");
        System.out.println(a);
        
        
        
        ArrayList b=new ArrayList();
        b.add("palak");
        b.add("rajgir");
        b.add("letuce");
        
        //a.addAll(b);
        System.out.println(a);
        b.addAll(a);
        System.out.println(b);
        System.out.println(b.containsAll(a));
        
	}

}
