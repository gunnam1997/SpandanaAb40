package firstExam;

import java.util.Scanner;
//Assignment_7
//Find area of circle
//area of circle = pi r^2
public class AreaOfCircle {
	static final double pi = 3.14;
	public static void main(String[] args) {
		area();
	}

	public static void area() {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		double r2 = sc.nextDouble();
		double aoc = pi*r1*r2;
		System.err.println("Area of circle :"+aoc);
	}

}
