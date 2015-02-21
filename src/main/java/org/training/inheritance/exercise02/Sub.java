package org.training.inheritance.exercise02;

public class Sub extends Base {

	public void method(int j) {
		System.out.println("This value is " + j);
	}

	public void method(String s) {
		System.out.println("I was passed " + s);
	}

	/**
	 * !!! TRY TO ANSWER BEFORE RUNNING THIS MAIN METHOD !!!
	 * 
	 * What output results when the main method of the class Sub is run? 
	 * A. Value is 5Value is 6
	 * B. This value is 5This value is 6
	 * C. Value is 5This value is 6
	 * D. This value is 5Value is 6
	 * E. I was passed 5I was passed 6
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Base b1 = new Base();
		Base b2 = new Sub();
		b1.method(5);
		b2.method(6);
	}
}
