package thirdExam;
//Exception Handling Program using Array concept
public class ArrayException {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};

		try {
			int c=a[0]/a[6];
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}
