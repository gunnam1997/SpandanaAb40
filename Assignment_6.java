package firstExam;
//Creating one more object for SIB,IIB,CON,MM 
public class Assignment_6 {
	public static void main(String[] args) {
		System.err.println("This is main method ");
		new Assignment_6();
	}

	public Assignment_6() {
		System.out.println("This is constructor");
	}

	static{
		System.out.println("This is Static block");
	}

	{
		System.err.println("This is instance block");
	}
}
