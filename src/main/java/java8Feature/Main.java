package java8Feature;

public class Main implements Test{
	
	public void show(){
		System.out.println("from main");
	}
	
	public static void main(String[] args) {
		Main main =new Main();main.show();
		Test test =new Test() {
		};test.show();
		
		
		AnotherTest anotherTest =new AnotherTest() {
		};
		anotherTest.show();

		
		FunctionalInterfaceTest newWay = () -> {
			System.out.println("Display from new Lambda Expression");
		};
		newWay.display();
	}
	
}

interface Test {

	
	default void show() {
		System.out.println("show from Test");
	}

}


interface AnotherTest {

	default void show() {
		System.out.println("show from AnotherTest");
	}

}