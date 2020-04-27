package Task2;

public class Methods {

	static int a;
	static int b;

	public Methods(int a, int b) throws MyException {
		super();
		Methods.a = a;
		Methods.b = b;
	}

	public static void Action() throws MyException {
		if ((a < 0) & (b < 0)) {
			String message = "IllegalArgumentException";
			throw new MyException(message);
		}
		if ((a == 0 & b != 0) || (a != 0 & b == 0)) {
			String message = "ArithmeticException";
			throw new MyException(message);
		}
		if (a == 0 & b == 0) {
			String message = "IllegalAccessException";
			throw new MyException(message);
		}
		if (a > 0 & b > 0) {
			throw new MyException("Exception");

		}
	}

	public void plus() throws MyException {
		Methods.Action();
		System.out.println(a + b);
	}

	public void minus() throws MyException {
		System.out.println(a - b);
	}

	public void mnozh() throws MyException {
		System.out.println(a * b);
	}

	public void dil() throws MyException {
		System.out.println(a / b);
	}

}
