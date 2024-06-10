package firstExam;

import java.util.Iterator;

public class PracticeForLoop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		forLoop();
		System.out.println();
		forLoop1();
		System.out.println();
		forLoop2();
		System.out.println();
		forLoop3();
	}

	//Using for loop print 1 to 10
	static void forLoop() {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	}

	//Using for loop print 1 to 100 by missing every second number
	static void forLoop1() {
		for (int i = 1; i <=100; i++) {
			System.out.println(i);
			i++;
		}
	}

	//print even numbers from 1 to 100
	static void forLoop2() {
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				System.out.println("It is even number "+i);
			}
		}
	}

	//write a for loop that runs for infinite times
	static void forLoop3() throws InterruptedException {
		for (int i = 0; i <1; i--) {
			System.out.println("-----");
			Thread.sleep(2000);
		}
	}
}
