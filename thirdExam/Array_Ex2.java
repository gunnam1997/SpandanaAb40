package thirdExam;

import java.util.Arrays;

public class Array_Ex2 {
public static void main(String[] args) {
	int number[] = new int[5];
	int num[] = new int[5];
	int k=num.length-1;//4,3,2,1,0
	number[0]= 23;
	number[1]= 22;
	number[2]= 3;
	number[3]= 43;
	number[4]= 97;
	for (int i = 0; i <number.length; i++) 
	{
		num[k]=number[i];
		k--;//start from 4 untill 0
	}
	System.out.println("The given array is-> " + Arrays.toString(number));
	System.out.println("The reverse Array is->  "+ Arrays.toString(num));
}
}
