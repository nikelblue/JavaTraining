package org.training.equals.example02;

/**
 * Please read the contract of {@link Object#equals(Object)} (link below) to 
 * understand what that method is doing by default
 *  
 * @author nikelblue
 * @see Object#equals(Object)
 * @see http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals%28java.lang.Object%29
 */
public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = p1; //p2 is same instance as p1
		Point p3 = new Point(1,2);

		//Operator == returns 'true' only if both 'points' are same instance.
		System.out.printf("p1 == p2: %s\n", p1 == p2);
		//equals still returns true if both points are same instance, which means
		//we didn't break the initial behavior
		System.out.printf("p1.equals(p2): %s\n", p1.equals(p2));
		
		//They are not same instance (p3 has been created again with new)
		System.out.printf("p1 == p3: %s\n", p1 == p3);
		//This time equals is smarter and checks if both points coordinates are the same
		System.out.printf("p1.equals(p3): %s\n", p1.equals(p3));
	}
	
}
