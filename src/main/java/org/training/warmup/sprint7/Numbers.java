/**
 * 
 */
package org.training.warmup.sprint7;


/**
 * @author monkey
 *
 */
public class Numbers {	
	
	public static int sumIntegers(String ... s) throws NumberFormatException {
		
		int sumInt = 0;

		for(int i=0; i<s.length; i++) {
			int number = Integer.valueOf(s[i]);
			sumInt += number;
		}

		return sumInt;
	}
	
	
	public static float sumFloats(String ... s) throws NumberFormatException {
		float sumFloat = 0;

		for(int i=0; i<s.length; i++) {
			float number = Float.valueOf(s[i]);
			sumFloat += number;
		}

		return sumFloat;
	}
	
	
	public static String compareInt(Integer n1, Integer n2){
		String compareInt="";
		
		if(n1.compareTo(n2)<0){
			compareInt = n1 + " is less than " + n2;
		}else if(n1.compareTo(n2)==0){
			compareInt = n1 + " is equal to " + n2;
		}else if(n1.compareTo(n2)>0){
			compareInt = n1 + " is greater than " + n2;
		}
		
		return compareInt;
	}

}
