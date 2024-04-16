package thirdExam;

import java.util.Arrays;
import java.util.Iterator;

public class CheckNumericValue {

	public static void main(String[] args) {
		boolean answer;
		String name = "spandana";
		char [] a1=name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			answer = Character.isDigit(a1[i]);
			System.out.println(answer);
			if (answer == true) {
				System.out.println(i);
			}
		}
	}
}
