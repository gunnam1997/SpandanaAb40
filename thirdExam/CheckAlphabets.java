package thirdExam;

public class CheckAlphabets {
	public static void main(String[] args) 
	{
		String s = "spandana";
		char[] ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(ch[i])) {
				System.out.println("Given string Contains alphabets,numbers,special characters ");
				return;
			}
		}
		System.out.println("Given string Contains Alphabets only");
		
		checkNumbers();
	}

	static void checkNumbers() {
		String s = "12345drg";
		char[] ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(ch[i])) {
				System.out.println("Given string Contains alphabets,numbers,special characters ");
				return;
			}
		}
		System.err.println("Given string Contains Numerics only");
	}
}
