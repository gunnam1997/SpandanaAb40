package firstExam;
//To create 5 classes for Multilevel Inheritance
class Parent1{
	static void add() {
		int a=2,b=4;
		int c = a+b;
		System.out.println("add "+c);
	}
}

class Parent2 extends Parent1{
	static void sub() {
		int a=2,b=4;
		int c = a-b;
		System.out.println("sub "+c);
	}
}

class Parent3 extends Parent2{
	static void mul() {
		int a=2,b=4;
		int c = a*b;
		System.out.println("mul "+c);
	}
}
class Parent4 extends Parent3{
	static void div() {
		int a=2,b=4;
		int c = a%b;
		System.out.println("div "+c);
	}
}

class Parent5 extends Parent4{
	static void mod() {
		int a=2,b=4;
		int c = a/b;
		System.out.println("mod "+c);
	}
}

public class MultiLevelInheritance extends Parent5
{
	public static void main(String[] args) {
		Parent4 p4 = new Parent4();
		Parent2 p2 = new Parent2();
		p4.div();
		p4.mul();
		p2.sub();
		p2.add();
		mod();
	}
}


