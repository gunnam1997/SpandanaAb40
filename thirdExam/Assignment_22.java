package thirdExam;

public class Assignment_22 {

	static int n = 15;
	public static void main(String[] args) {
		for (int i = 1; i<=n; i++) {
			if (i%3==0) {
				System.out.println("FROG "+i);
			}if (i%5==0) {
				System.out.println("CAT "+i);
			}if (i%3==0 && i%5==0) {
				System.err.println("FROG AND CAT "+i);
			}
		}
	}


}
