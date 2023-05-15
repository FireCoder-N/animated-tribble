package gr.upatras.exercise1;

public class Sub {
	public String mySub(int a, int b) {
		/*
		 * Developer: up1072685
		 * Developer github name: FireCoder-N
		 * 
		 * This function takes 2 integers a, b as arguments 
		 * and returns "POSITIVE" if a-b>=0
		 * and "NEGATIVE" otherwise.
		 * 
		 */
		String result;
		if (a-b>=0) {
			result = "POSITIVE";
		}
		else {
			result = "NEGATIVE";
		}
		return result;
	}

	public static void main(String[] args) {
		/*
		 * The main function of the program. Used as example/test for the mySub method.
		 * Tested with numbers a=10, b=12. => returned "NEGATIVE", because a-b = -2 < 0 
		 */
		Sub sub = new Sub();
		String result = sub.mySub(10, 12);
		System.out.println(result);

	}

}
