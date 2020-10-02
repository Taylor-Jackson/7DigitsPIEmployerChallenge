//package projectFiles;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
///**
// * @author Taylor Jackson
// *
// * This is the testing class 
// * for the Finder class. It was needed
// * to make sure the separate parts of 
// * the program worked to isolate issues.
// */
//public class FinderTest {
//	Finder find = new Finder();
//
//	@Test
//	/**
//	 * This method tests the primeChecker method
//	 * against good and bad input.
//	 */
//	public void testAnswerChecker() {
//		assertTrue(find.primeChecker("9149419")); // Good input
//		assertTrue(find.primeChecker("131"));
//		
//		assertFalse(find.primeChecker("22222")); // Bad input
//		assertFalse(find.primeChecker("543345"));
//	}
//
//	@Test
//	/**
//	 * This method tests the palindromChecker method
//	 * against good and bad input.
//	 */
//	public void testPalindromeCheck() {
//		assertTrue(find.palindromeChecker("323")); // Good input
//		assertTrue(find.palindromeChecker("9149419"));
//		
//		assertFalse(find.palindromeChecker("321321")); // Bad input
//		assertFalse(find.palindromeChecker("1234"));
//	}
//
//}
