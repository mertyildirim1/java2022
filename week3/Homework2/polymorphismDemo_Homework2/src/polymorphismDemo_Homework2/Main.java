package polymorphismDemo_Homework2;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
