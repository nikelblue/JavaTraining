/**
 * 
 */
package org.training.warmup.sprint6;

/**
 * @author monkey
 *
 */
public class ParseBoolean {

	public static boolean parseBoolean(String s) {
		
		boolean isTrue = false;
		
		if(s!=null){
			String st = s.trim();
			if(st.compareToIgnoreCase ("True")==0) {
				isTrue = true;
			}
		}
		return isTrue;
	
	}

}
