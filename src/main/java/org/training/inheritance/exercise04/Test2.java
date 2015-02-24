package org.training.inheritance.exercise04;

public class Test2 extends Test1 {
// !!! TRY TO ANSWEER BEFORE WRITING ANY PIECE OF CODE
//	Which of the following methods would be legal (individually) at line 11 in class Test2? 
//	(Choose all that apply.)
//			A. float aMethod(float a, float b) {...}
//			B. public int aMethod(int a, int b) throws Exception {...}
//			C. public float aMethod(float a, float b) throws Exception {...}
//			D. public float aMethod(float p, float q) {...}
	
	public int aMethod(int a, int b) throws Exception {
		return a + b;
	}
	
	/*public float aMethod(float a, float b) throws Exception {
		return a + b;
	}*/
	
	public float aMethod(float p, float q) {
		return p + q;
	}
	
	
}
