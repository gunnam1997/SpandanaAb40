package thirdExam;

import java.util.Date;

public class TimePractice {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());//machine time
		Date d1 = new Date(d.getTime());//human time
		System.out.println(d1);
		String currentTime = d1.toString();
		Date futureTime = new Date(d.getTime()+(1000*60*60*24*10));//human time
		System.out.println(futureTime);

	}

	static void findOutFutureTime() {
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime());
		System.out.println(d1);
		String currentTime = d1.toString();
		Date futureTime = new Date(d.getTime()+(1000*60*60*24*10));
		System.out.println(futureTime);
	}
}
