package polymorphismDemo_Homework2;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("Müþteri eklendi");
		baseLogger.log("Log mesajý");
	}
}
