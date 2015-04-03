/**
 * 
 */
package org.training.warmup.sprint6;

/**
 * @author monkey
 *
 */
public class ComputeInitials {

	public static String computeInitials(String fullName){
		
		String initials="";

		if(fullName == null) {
			initials = null;
		}else if(fullName == "") {
			initials = "";
		}else {		
			String fullNameSpace = fullName.replaceAll("\\.", " ");
			String fullNameSpaceAll = fullNameSpace.replaceAll("-", " ");

			String[] words = fullNameSpaceAll.split(" ");

			for(int i=0; i<words.length;i++){
				String trimedWord = words[i].trim();

				if(trimedWord.isEmpty()==false){
					String firstChar = trimedWord.substring(0,1);
					initials = initials.concat(firstChar);					
				}
			}
			
			initials = initials.toUpperCase();
		}

		return initials;
	}

}
