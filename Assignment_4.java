package firstExam;
//create 5 static method and 5 non static method and call it inside main method
public class Assignment_4 {
	public static void main(String[] args) {
		name();
		age();
		gender();
		number();
		state();
		Assignment_4 a4 = new Assignment_4();
		a4.method1();
		a4.method2();
		a4.method3();
		a4.method4();
		a4.method5();
	}
	
	public static void name() {
		System.out.println("name -- "+"spandana");
	}
	public static void age() {
		System.out.println("age -- "+"26");
	}
	public static void gender() {
		System.out.println("gender -- "+"female");
	}
	public static void number() {
		System.out.println("number -- "+"987654321");
	}
	public static void state() {
		System.out.println("state -- "+"andra");
	}

	public void method1() {
		System.err.println("we are calling non static method1");
	}
	public void method2() {
		System.err.println("we are calling non static method2");
	}
	public void method3() {
		System.err.println("we are calling non static method3");
	}
	public void method4() {
		System.err.println("we are calling non static method4");
	}
	public void method5() {
		System.err.println("we are calling non static method5");
	}
}
