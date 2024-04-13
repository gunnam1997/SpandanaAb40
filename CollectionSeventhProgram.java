package collection;

import java.util.Enumeration;
import java.util.Vector;
//Out of so many legacy class's in any one class i want you to iterate using Enumeration
public class CollectionSeventhProgram {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(123);
		v.add("GROTECHMINDS");
		v.add(234);
		v.add("MKT");

		Enumeration eNum = v.elements(); 
		while (eNum.hasMoreElements()) {
			System.out.println(eNum.nextElement());			
		}
	}

}
