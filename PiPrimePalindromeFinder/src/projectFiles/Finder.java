package projectFiles;

/**
 * @author Taylor Jackson
 * 
 * This class holds the methods
 * that comprise the logic needed
 * to check for prime palindromic 
 * numbers through a string.
 */
public class Finder {
	public Finder() {
		
	}
	
	/** 
	 * This method chops the input string digits
	 * into pieces based on the number spaces and then 
	 * funnels it into the helper methods.
	 * 
	 * @param digits - The string being chopped into pieces
	 * @param spacing - The number of characters to chop into
	 * @return String - the first palindromic prime number found
	 */
	public String stringChopper(String digits, int spacing) {
		String temp = ""; // Holds the chopped segments of string
		int i = 0; // Counter for the beginning of the chop
		boolean end = false; // Ends the while loop if the end is reached
				
		while(!end) {
			for(int j = 0; j < spacing; j++) { // Add numbers to temp, loop 'spacing' number of times
				temp += digits.charAt(i + j); 
				if (i + j == digits.length() - 1) { // If the addition of i and j is more than length
					end = true; // End the loop
				}
			}
			if(primeChecker(temp)) { // Funnel the segment into primeChecker
				return temp; // If true, return the string that passed
			}
			temp = ""; // Empty the temp variable
			i++; // Increment the first number
		}
		return ""; // Return empty is no palindromic prime is found
	}
	
	/**
	 * This method calls palindromeChecker 
	 * first before before running. Then it
	 * converts digits to an int, checks
	 * if it is even, then runs through all 
	 * odd numbers to check if it is prime.
	 * 
	 * @param digits - The string being checked if prime
	 * @return boolean - Returns if the number is prime or not
	 */
	public boolean primeChecker(String digits) {
		if (palindromeChecker(digits)) { // Check for palindrome
			int temp = Integer.parseInt(digits); // Convert string to int
			if (temp % 2 != 0) { // Check if even
				for (int i = 3; i < temp; i += 2) { // Run through all odd numbers
					if (temp % i == 0) {
						return false; // Return false if divisible by a number
					}
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	/**
	 * This method checks if digits is 
	 * palindromic. It checks to see if the 
	 * first and last number are the same
	 * and moves i and j towards the middle 
	 * to keep checking.
	 * 
	 * @param digits - the string being checked if palindromic
	 * @return boolean - Returns if the number is palindromic or not
	 */
	public boolean palindromeChecker(String digits) {
		int i = 0; // Beginning increment
		int j = digits.length() - 1; // End increment
		while (i < j) {
			if (digits.charAt(i) == digits.charAt(j)) {} // If characters are the sane, do nothing
			else { // If characters are not the same not palindromic
				return false;
			}
			i++; // Increase towards middle
			j--; // Decrease towards middle
		}
		return true;
	}
}
