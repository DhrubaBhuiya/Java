package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Kuheli");
		l.add("Urmi");
		l.add("Rajdeep");
		l.add("Supriti");
		l.add("Dhruba");
		
		System.out.println(l);
		
		ListIterator itr = l.listIterator();
		while(itr.hasNext()){
			String s = (String)itr.next();
			if(s.equals("Dhruba")){
				itr.remove();
			}
		}
		System.out.println(l);

	}

}
