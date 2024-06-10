package firstExam;
//Create 4 static method to perform arithmetic operations and call it inside the main method
public class Assignment_3 {
	static int a=10;
	static int b=10;
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
	}
	public static void add() {
		System.out.println(a+b);
	}
	public static void sub() {
		System.out.println(a-b);
	}
	public static void mul() {
		System.out.println(a*b);
	}
	public static void div() {
		System.out.println(a/b);
	}
}
