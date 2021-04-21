
public class ExceptionDemo {
	public static void main(String[] args) {
		
		try {
			int z = 10 / 0;
			int a = 10;
			int b = a + 10;
		} catch (ArithmeticException n) {			
		
			n.printStackTrace();
			System.exit(0);

		} 
		
		finally {
			System.out.println("finally");
		}

		System.out.println("rest code");
	}
}
