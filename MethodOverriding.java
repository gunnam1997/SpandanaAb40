package firstExam;
class MethodOverridingParent{
	void add() {
		int a=5,b=10,c;
		c=a+b;
		System.out.println("This is parent class "+c);
	}
}
public class MethodOverriding extends MethodOverridingParent {

	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		mo.add();
		System.out.println("This is childclass main method");
		MethodOverridingParent mop = new MethodOverridingParent();
		mop.add();
	}

	void add() {
		String a="spandana",b="gunnam",c;
		c=a+b;
		System.out.println("This is child class "+c);
	}

}
