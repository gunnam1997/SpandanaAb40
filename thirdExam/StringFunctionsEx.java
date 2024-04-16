package thirdExam;

public class StringFunctionsEx {

	public static void main(String[] args) {
		replaceAwithN();
		removeCapitalLetters();
		removeNUmbers();
		replaceCapitalLettersWithName();
	}

	static void replaceAwithN() {
		String s = "SPANDANA";
		System.out.println(s.replace('A', 'N'));
	}

	static void removeCapitalLetters() {
		String s = "OME sri sai RAM";
		System.out.println(s.replaceAll("[A-Z]", " "));
	}

	static void removeNUmbers() {
		String s = "hello user 123";
		System.out.println(s.replaceAll("[0-9]", " "));
	}

	static void replaceCapitalLettersWithName() {
		String s = "SpandanA";
		System.out.println(s.replaceAll("[A-Z]", "manish"));
	}
}
