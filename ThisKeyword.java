package firstExam;

public class ThisKeyword {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		int a =20;
		System.out.println("======");
		ThisKeyword keyword = new ThisKeyword();
		keyword.method1();
	}
	public void method1() {
		int b=22;
		this.b=b;
		System.out.println(b);
	}
}
