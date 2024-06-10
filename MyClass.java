package firstExam;

class GrandParent{
	GrandParent() {

	}
}
class Parents extends GrandParent{
	Parents() {

	}
}
class Child extends Parents{
	Child() {
		System.out.println("child");
	}
}

public class MyClass{
	public static void main(String[] args) {
		Child c = new Child();
	}
}
