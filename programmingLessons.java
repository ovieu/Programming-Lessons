/*
	Q. Is it okay to redeclare a variable inside a loop?
	A. es, as far as you dont plan to reuse that value
Example:
*/
	while(true) {
	/*	this is the redeclaration */
		int value = readInt("Enter a value: ");
	/*	end of redeclaration */
		if (value == SENTINEL) break;
		total += value;
	}
	
/*	
Q. When checking conditions, alway check for the false condition
   first. That way, if the condition evaluates to false, you dont 
   have to continue the computation anymore. If the check ends without
   a false return, then the condition you are checking for is true
   Example:
   */
   
   //	checks if a string is a palindrome
   private String isPalindrome(String str) {
   	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) != str.charAt(str.length() - (i + 1)) {
			return false;
			}
		}
		return true;
	}
		
/*	A better way to express if else statements */
 if (condition) {
     statement;
 } else {
     statement;
 }
 
 //can be replaced with
            
   if (!condition) {
       return statement;
   } return false statement;
            
           //   Example
   private String replaceOccurence(String str, String orig, String repl) {
       int index = str.indexOf(repl);
       if (index != -1) {
        str = str.substring(0, index) + repl + str.substring(index, orig.length());
        return str;
       }
       return str;
   }

