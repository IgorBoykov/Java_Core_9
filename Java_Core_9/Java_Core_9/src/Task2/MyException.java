package Task2;

public class MyException extends Exception {

	private String exception1;

	public MyException(String exception1) {
		super(exception1);
		this.exception1 = exception1;
	}

	public String getException1() {
		return exception1;
	}

}
