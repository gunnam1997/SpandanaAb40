package firstExam;

class SuperKeywordParent {
	void sub() {
		int a=10,b=10,c;
		c=a-b;
		System.out.println("This is parentclass method "+c);
	}
}
public class SuperKeyword extends SuperKeywordParent{
	void sub() {
		int a=10,b=10,c;
		c=a-b;
		System.out.println("This is childclass method "+c);
		super.sub();
	}
	public static void main(String[] args) {
		System.out.println("This is main method ");
		SuperKeyword sk = new SuperKeyword();
		sk.sub();
	}
}
