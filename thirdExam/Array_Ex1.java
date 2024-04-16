package thirdExam;

import java.util.Arrays;

public class Array_Ex1 {
	public static void main(String[] args) 
	{
		int num[] = new int[5];
		int number[] = new int[5];
		number[0]= 23;
		number[1]= 22;
		number[2]= 3;
		number[3]=43;
		number[4]= 97;
		for (int i = 0; i <number.length; i++) {
			num[i]=number[i];

		}
		System.out.println("The first array is-> " + Arrays.toString(number));
		System.out.println("The Copied Array is->  "+ Arrays.toString(num));
	}
}
