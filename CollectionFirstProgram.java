package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.TreeSet;

//Finding out the property of ArrayList,Vector,LinkedList,treeSet,Priority Queue
public class CollectionFirstProgram {

	public static void main(String[] args) {
		arrayList();
		vector();
		linkedList();
		treeSet();
		priorityQueue();
	}

	//properties of ArrayList
	public static void arrayList() {
		ArrayList aL = new ArrayList();
		aL.add(123);//ArrayList are index based data Structure 
		aL.add(123);//ArrayList can store duplicate values 
		aL.add("spandana");//ArrayList can store heterogeneous elements
		aL.add("andhra pradesh");//ArrayList can follow the insertion order
		aL.add(null);//ArrayList can store any number of NULL values 
		aL.add(null);//ArrayList can not follow the sorting order 
		System.out.println(aL);
	}

	//properties of Vector 
	public static void vector() {
		Vector v = new Vector();
		v.add(123);//Vector are index based data Structure 
		v.add(123);//Vector can store duplicate values 
		v.add("spandana");//Vector can store heterogeneous elements
		v.add("andhra pradesh");//Vector can follow the insertion order
		v.add(null);//Vector can store any number of NULL values 
		v.add(null); 
		System.err.println(v);
	}

	//properties of LinkedList 
	public static void linkedList() {
		LinkedList lL = new LinkedList();
		lL.add(123);//LinkedList are index based data Structure 
		lL.add(123);//LinkedList can store duplicate values 
		lL.add("spandana");//LinkedList can store heterogeneous elements
		lL.add("andhra pradesh");//LinkedList can follow the insertion order
		lL.add(null);//LinkedList can store any number of NULL values 
		lL.add(null); //LinkedList can not follow the sorting order
		System.out.println(lL);
	}

	//properties of TreeSet 
	public static void treeSet() {
		TreeSet tS = new TreeSet();
		tS.add("123");//TreeSet are index based data Structure 
		tS.add("123");//TreeSet can store duplicate values 
		tS.add("spandana");//TreeSet can store heterogeneous elements
		tS.add("andhra pradesh");//TreeSet can follow the insertion order
		//tS.add(null);//TreeSet can not store NULL values 
		//tS.add(null); //TreeSet can not follow the sorting order
		System.err.println(tS);
	}

	//properties of PriorityQueue 
	public static void priorityQueue() {
		PriorityQueue pQ = new PriorityQueue();
		pQ.add("123");//priorityQueue are index based data Structure 
		pQ.add("123");//priorityQueue can store duplicate values 
		pQ.add("spandana");//priorityQueue can store heterogeneous elements
		pQ.add("andhra pradesh");//priorityQueue can follow the insertion order
		//pQ.add(null);//priorityQueue can not store NULL values 
		//pQ.add(null); //priorityQueue can not follow the sorting order
		System.out.println(pQ);
	}
}
