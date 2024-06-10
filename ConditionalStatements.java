package firstExam;
public class ConditionalStatements {

	public static void main(String[] args)
	{
		ifEx();
		ifElseEx();
		ifElseIfEx();
	}

	//if example
	public static void ifEx() {
		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println("1");
		}
		if(a<b)
		{
			System.out.println("2");
		}
		if(a>=b)
		{
			System.out.println("3");
		}
		if(a<=b)
		{
			System.out.println("4");
		}
		if(a==b)
		{
			System.out.println("5");
		}
		if(a!=b)
		{
			System.out.println("6");
		}
	}

	//ifElse example
	public static void ifElseEx() {
		int a=100,b=200;
		if (a>b) {
			System.out.println("Condition one executed");
		}
		else {
			System.out.println("Else block will be executed");
		}
	}

	//ifElseIf example
	public static void ifElseIfEx() {
		int a=1,b=2,c=3;
		if (a==b) {
			System.out.println("Condition one");
		}else if (b>c) {
			System.out.println("Condition two");
		}else if (c<=a) {
			System.out.println("condition three");
		}else {
			System.out.println("No condition are executed");
		}
	}

}
