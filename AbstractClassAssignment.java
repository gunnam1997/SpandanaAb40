package firstExam;
//Create Multi level Inheritance using 2 Abstract classes and 1 concrete class 
abstract class Abstract1{
	int a=2,b=2,c;
	abstract void add1();
	abstract void sub1();
	void mul1() {
		c = a*b;
		System.out.println("This is Abstarct class 1 Concrete method "+c);
	}
}

abstract class Abstract2 extends Abstract1{
	int a=4,b=4,c;
	abstract void add2();
	abstract void sub2();
	void mul2() {
		c = a*b;
		System.out.println("This is Abstarct class 2 Concrete method "+c);
	}
}

public class AbstractClassAssignment extends Abstract2{
	int a=5,b=5,c;
	public static void main(String[] args) {
		AbstractClassAssignment absct = new AbstractClassAssignment();
		absct.div();
		absct.mod();
		absct.add1();
		absct.add2();
		absct.sub1();
		absct.sub2();
		absct.mul1();
		absct.mul2();
	}
	void div() {
		c = a%b;
		System.out.println("This is Concrete class method "+c);
	}
	void mod() {
		c = a/b;
		System.out.println("This is Concrete class method "+c);
	}
	void add2() {
		c = a+b;
		System.out.println("This is abstarct class 2 method "+c);
	}
	void sub2() {
		c = a-b;
		System.out.println("This is abstarct class 2 method "+c);
	}
	void add1() {
		c = a+b;
		System.out.println("This is abstarct class 1 method "+c);
	}
	void sub1() {
		c = a-b;
		System.out.println("This is abstarct class 1 method "+c);
	}
}
