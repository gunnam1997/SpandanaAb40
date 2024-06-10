package firstExam;
import java.util.Scanner;
//Assignment_7
//Write 5 methods using one scanner globally and also write 5 methods using 5 scanners locally 
public class ArithmeticOperations_UsingScanner {
	Scanner sc = new Scanner(System.in);
	int i1 = sc.nextInt();
	int i2 = sc.nextInt();
	public static void main(String[] args) {
		ArithmeticOperations_UsingScanner math = new ArithmeticOperations_UsingScanner();
		math.add();
		math.sub();
		math.mul();
		math.div();
		math.mod();
		System.out.println();
		math.addL();
		math.subL();
		math.mulL();
		math.divL();
		math.modL();
	}

	//Created Globally 
	public void add() {
		int add = i1+i2;
		System.err.println("Addition of two numbers "+add);
	}
	public void sub() {
		int sub = i1-i2;
		System.out.println("Subtraction of two numbers "+sub);
	}
	public void mul() {
		int mul = i1*i2;
		System.err.println("Multiplication of two numbers "+mul);
	}
	public void div() {
		int div = i1%i2;
		System.out.println("Division of two numbers "+div);
	}
	public void mod() {
		int mod = i1/i2;
		System.err.println("ModuloDivision of two numbers "+mod);
	}

	//Created locally
	public void addL() {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int addL = a1+a2;
		System.err.println("Addition of two numbers "+addL);
	}
	public void subL() {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int subL = s1-s2;
		System.out.println("Subtraction of two numbers "+subL);
	}
	public void mulL() {
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int mulL = m1*m2;

		System.err.println("MUltiplication of two numbers "+mulL);
	}
	public void divL() {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int divL = d1%d2;
		System.out.println("Division of two numbers "+divL);
	}
	public void modL() {
		Scanner sc = new Scanner(System.in);
		int md1 = sc.nextInt();
		int md2 = sc.nextInt();
		int modL = md1/md2;
		System.err.println("Modulodivision of two numbers "+modL);
	}
}
