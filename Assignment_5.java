package firstExam;
//Create 5 constructors int,char,string,Boolean and int, Boolean, string and call them in main method
public class Assignment_5 {
	public static void main(String[] args) {
		new Assignment_5(10,2,7);
		new Assignment_5('c');
		new Assignment_5("spandana");
		new Assignment_5(true);
		new Assignment_5(false,100,"sai");
	}
	Assignment_5(int i,int b,int c){
		System.out.println("Int statement will be executed :" +i+" "+b+" "+c);
	}
	Assignment_5(char c){
		System.err.println("Char statement will be executed ");
	}
	Assignment_5(String s){
		System.out.println("String statement will be executed ");
	}
	Assignment_5(boolean b){
		System.err.println("Boolean statement will be executed ");
	}
	Assignment_5(boolean b,int i,String s){
		System.out.println("Boolean,Int,String statement will be executed ");
	}
}
