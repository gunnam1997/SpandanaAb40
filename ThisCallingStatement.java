package firstExam;
class ThisParent{
	public ThisParent() {
		System.out.println("Parent constructor");
	}
	public ThisParent(String s) {
		System.out.println("Parent constructor with para");
	}
}
public class ThisCallingStatement extends ThisParent{
	public ThisCallingStatement() {
		this(false);
		System.out.println("Child constructor without para");
	}
	public ThisCallingStatement(Boolean b) {
		this(true,"spandana");
		System.out.println("Child constructor with para");
	}
	public ThisCallingStatement(Boolean b,String s) {
		System.out.println("Child constructor with double para");
	}
	public static void main(String[] args) {
		new ThisCallingStatement();
	}

}
