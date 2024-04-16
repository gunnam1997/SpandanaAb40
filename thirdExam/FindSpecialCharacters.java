package thirdExam;

import java.util.Arrays;
import java.util.Scanner;
//Q1)check in the given string how many Special characters are present
public class FindSpecialCharacters {

	public static void main(String[] args) {
		int count = 0;
		String s = "Manish123 $# kumar";
		char[] ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(ch[i])&&!Character.isAlphabetic(ch[i]) 
					&&!Character.isSpaceChar(ch[i])){
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No special characters are found ");
		}else {
			System.err.println("Special characters are found "+count);
		}
		arrayLength5();
	}

	//Q2)Create a Array of length 5 & int datatype & Store value in it using scanner class
	static void arrayLength5() {
		Scanner sc = new Scanner(System.in);
		int[]a=new int[5];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		a[3]=sc.nextInt();
		a[4]=sc.nextInt();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}


