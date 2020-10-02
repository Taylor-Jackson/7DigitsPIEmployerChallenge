package projectFiles;

/**
 * @author JacksonTaylor
 *
 * This class holds the main method
 * and executes the methods in Finder
 * using the constant from DigitsofPI.
 */
public class Main {

	public static void main(String[] args) {
		DigitsofPI digits = new DigitsofPI();
		Finder find = new Finder();
		
		System.out.println(find.stringChopper(digits.digits, 7) + " is the answer!");
	}
}
