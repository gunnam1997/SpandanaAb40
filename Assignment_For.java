package firstExam;

import java.util.Scanner;

//Print numbers which are actually divisible by 5 from 1 to 100
public class Assignment_For {
	static final double pi = 3.14;
	public static void main(String[] args) {
		divisible();
		System.out.println();
		evenOrOdd();
		System.out.println();
		areaOfCircle();

	}

	static void divisible() {
		System.out.println("These are the numbers actually divisible by 5 ");
		for (int i = 1; i <=100; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}
	}

	//Print Even Or Odd numbers from 1 to 100
	static void evenOrOdd() {
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(i+" This is Even Number");
			}else {
				System.err.println(i+" This is Odd Number");
			}
		}
	}

	//Find out area of circle using human input at runtime in 10 times 
	static void areaOfCircle() {
		for (int i = 1; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			int r1 = sc.nextInt();
			double r2 = sc.nextDouble();
			double aoc = pi*r1*r2;
			System.err.println("Area of circle :"+aoc);
		}
	}
}
