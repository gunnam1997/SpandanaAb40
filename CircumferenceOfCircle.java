package firstExam;

import java.util.Scanner;
//Assignment_7
//Find Circumference Of Circle
//Circumference Of Circle = 2 pi r
public class CircumferenceOfCircle {
	static final double pi = 3.14;
	public static void main(String[] args) {
		circumferenceOfCircle();
	}

	public static void circumferenceOfCircle() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double coc = 2*pi*r;
		System.err.println("Circumference Of Circle:"+coc);
	}
}
