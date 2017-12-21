package java8Feature;

public class FunctionalInterface {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out
						.println("Runnable implemented by using Lambda Expression");
			}
		});
//		t.start();

		Thread t1 = new Thread(
				() -> {
					System.out
							.println("Runnable implemented by using Lambda Expression");
				});
		t1.start();
	}
	
	
	
}
