package firstExam;

public class BasicPrograms {
	public static void main(String[] args) {
		BasicPrograms bp = new BasicPrograms();
		bp.EvenOrOdd();
		bp.EvenOrOddEx();
	}
	
	//using for loop
	public void EvenOrOdd() {
		int n = 10;
		for (int i = 1; i < n; i++) {
			if (i%2==0) {
				System.out.println(i+" Even number");
			}else {
				System.err.println(i+" Odd number");
			}
		}
	}

	//without loop		
	public void EvenOrOddEx() {
		int a = 4;
		if (a%2==0) {
			System.out.println(a+" It is even");
		}else {
			System.err.println(a+" It is odd");
		}
	}
}
