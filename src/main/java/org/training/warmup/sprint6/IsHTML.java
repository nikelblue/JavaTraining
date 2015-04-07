/**
 * 
 */
package org.training.warmup.sprint6;

/**
 * @author monkey
 *
 */
public class IsHTML {


	public static boolean isHTML(String text) {
		boolean isHTML = false;
		
		if(text != null){
			String textTrimed = text.trim().toLowerCase();
			if(textTrimed.startsWith("<html>") && textTrimed.endsWith("</html>")) {
				isHTML = true;
			}			
		}
			
		return isHTML;
	}

}
