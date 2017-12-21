package java8Feature;

public class Aa {
	public static void main(String[] args) {
		// Old way using anonymous inner class
		FunctionalInterfaceTest fit = new FunctionalInterfaceTest() {
			public void display() {
				System.out.println("Display from old way");
			}
		};
		fit.display();// outputs: Display from old way

		// Using lambda expression
		FunctionalInterfaceTest newWay = () -> {
			System.out.println("Display from new Lambda Expression");
		};
		newWay.display();
	}
}