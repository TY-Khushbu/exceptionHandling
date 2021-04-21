
public class MyArithmaticException {
	void doArithmaticOp() throws ArithmeticException {
		System.out.println(10 / 0);

	}
	

	public static void main(String[] args) {
		MyArithmaticException ae = new MyArithmaticException();
		try {
			ae.doArithmaticOp();
		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
			

		}
	}
	

}
