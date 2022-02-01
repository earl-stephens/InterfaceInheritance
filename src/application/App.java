package application;

public class App {

	public static void main(String[] args) {
		//since Machine implements the interface, you can
		// do the below
		DefaultRunnable m1 = new Machine();
		m1.run();
		m1.displayDetails();
	}

}
