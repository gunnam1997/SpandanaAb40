package firstExam;
//Switch case with the help of scanner class
import java.util.Scanner;
public class SwitchPractice {
	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	static int x = sc.nextInt();
	static int y = sc.nextInt();
	public static void main(String[] args) {
		switch (a) {
		case 1: {
			int z=x+y;
			System.out.println("This is case 1 ::addition "+z);
			break;
		}
		case 2: {
			int z=x-y;
			System.out.println("This is case 2 ::subtraction "+z);
			break;
		}
		case 3: {
			int z=x*y;
			System.out.println("This is case 3 ::multiplication "+z);
			break;
		}
		default:
			System.out.println("No case will be executed ");
		}
		sc.close();
	}
}
