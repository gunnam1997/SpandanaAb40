package firstExam;

import java.util.ArrayList;
public class InterviewQuestions {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("1");
		list.add("spandana");
		list.add(null);
		list.add("gunnam");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for (String newList : list) {
			System.out.print(newList+" ");
		}
		System.out.println();
		int i=0;
		while (list.size()>i) {
			System.out.print(list.get(i)+" ");
			i++;
		}
	}

}
