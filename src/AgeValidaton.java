
public class AgeValidaton {

	void voteEligibility(int age) {
		if (age < 18) {
			try {
				throw new MyException();
			}
			catch (MyException e) {
			   e.printStackTrace();
			}
		} else {
			System.out.println("voted succesfully");
		}
	}

	public static void main(String[] args) {
		AgeValidaton ageVal = new AgeValidaton();
		ageVal.voteEligibility(17);
	}
}
