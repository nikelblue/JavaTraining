package org.training.inheritance.overriding.example2;

public class OperationTest {

	public static void main(String[] args) {
		float a = 2.3f;
		float b = 4.5f;
		
		Operation op = new Operation();
		Sum sum = new Sum();
		Multiply multiply = new Multiply();
		Compare comp = new Compare();
		
		System.out.println("operation: " + op.apply(a, b));
		System.out.println("sum:       " + sum.apply(a, b));
		System.out.println("multiply:  " + multiply.apply(a, b));
		System.out.println("compare:   " + comp.apply(a, b));

	}

}
