package gr.upatras.exercise1;

public class Sub {
	public String mySub(int a, int b) {
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
		Sub sub = new Sub();
		String result = sub.mySub(10, 12);
		System.out.println(result);

	}

}
