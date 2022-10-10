package kodlamaIoDemo_Homework3.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail sent: " + data);

	}

}
