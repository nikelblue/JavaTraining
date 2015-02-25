/**
 * 
 */
package org.training.inheritance.exercise03;

/**
 * !!! TRY TO ANSWEER BEFORE WRITING ANY PIECE OF CODE
 * 
 * Which of the following methods would be legal if added (individually) at line 23? (Choose all
 * that apply.)
 * A. public int aMethod(int a, int b) { }
 * B. public float aMethod(float a, float b) { }
 * C. public float aMethod(float a, float b, int c) throws Exception { }
 * D. public float aMethod(float c, float d) { }
 * E. private float aMethod(int a, int b, int c) { }
 * 
 * @author daniel
 *
 */
public class Test1 {
	public float aMethod(float a, float b) {
		return a+b;
	}
	
	//new method here
	public int aMethod(int a, int b) {
		return a+b;
	}
	
	public float aMethod(float a, float b, int c) throws Exception {
		return a + b + c;
	}
	
	private float aMethod(int a, int b, int c) {
		return a + b + c;
	}
	
	float f = aMethod(1,3,5);
}
