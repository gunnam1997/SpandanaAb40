package firstExam;


public class Constructor {
	public static void main(String[] args) {
		System.out.println("Execute main method");
		//Constructor c = new Constructor();//syntax 1 of creating an object
		new Constructor();//syntax 2 of creating an objects
		new Constructor(2);
		new Constructor(false,"spandana");
	}
	Constructor() {
		System.out.println("Calling Constructor");
	}


	//ConstructorOverload
	Constructor(int a){
		System.out.println("We are calling Parametrized constructor"+a);
	}

	Constructor(boolean b,String s){
		System.err.println("We are calling Parametrized constructor "+b +" "+s);
	}

}
