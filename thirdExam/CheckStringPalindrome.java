package thirdExam;

import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		palindrome();
		String s = "mom";   
		String output = " ";
		for (int i = s.length()-1; i >= 0; i--) {
			char reverse = s.charAt(i);
			output = output+reverse;
		}
		System.out.println(output);
	}

	static void palindrome() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String output = "";
		for (int i = s.length()-1; i >= 0; i--) {
			char reverse = s.charAt(i);
			output = output+reverse;
		}
		if (output.equals(s)) {
			System.out.println("Given string is plaindrome ");
		}else {
			System.out.println("Given string is not a palindrome ");
		}
		System.out.println(output);
	}

}
