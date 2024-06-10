package firstExam;
class Parent
{
	Parent(){
		System.err.println("This is implicit constructor");//implicitly
	}
	public Parent(int a,int b) {
		int c=a+b;
		System.out.println("This is parent class constructor "+c);
	}

	public Parent(String a,String b) {
		String c=a+b;
		System.out.println("This is parent class constructor ::"+c);
	}
}
 class SuperCallingStatement extends Parent
{
	public SuperCallingStatement() {
		super("OM","SAI");//Explicitly
		//super(4, 8);//Explicitly//is there any limit to call Explicitly in super calling statement 
		
		System.out.println("This is child class constructor");
	}
	public static void main(String[] args) {
		new SuperCallingStatement();
	}

}


