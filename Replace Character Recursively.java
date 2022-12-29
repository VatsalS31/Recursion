//Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.


public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 0) {
			return input;

		}
		String smallans = replaceCharacter(input.substring(1), c1, c2);
	
		if (input.charAt(0) == c1) {
			
			return c2+smallans;

		}
		return input.charAt(0)+smallans;
		
		 

	}
}
