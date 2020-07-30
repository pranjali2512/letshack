package letshackTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import letshack.UniquePattern;

class UniquePatternTest {

	@Test
	void testOccurUnique() {
		String str1 = "My order number is A45675";
		String str2 = "Please cancel my order A45675";
		String output = UniquePattern.findUniquePattern(str1, str2);
		assertEquals(output, "A45675");
	}
	
	@Test
	void testOccurNotUnique() {
		String str1 = "My order number is A45675 A5348923";
		String str2 = "Please cancel my order A45675";
		String output = UniquePattern.findUniquePattern(str1, str2);
		assertEquals(output, null);
	}
	
	@Test
	void testOccurNotUnique2() {
		String str1 = "My order number is A45675";
		String str2 = "Please cancel my order A45675 A5348923";
		String output = UniquePattern.findUniquePattern(str1, str2);
		assertEquals(output, null);
	}
	
	@Test
	void testNoOrder1() {
		String str1 = "My order number is order number";
		String str2 = "Please cancel my order A45675 A5348923";
		String output = UniquePattern.findUniquePattern(str1, str2);
		assertEquals(output, null);
	}
	
	@Test
	void testNoOrder2() {
		String str1 = "My order number is here A23";
		String str2 = "Please cancel my order number";
		String output = UniquePattern.findUniquePattern(str1, str2);
		assertEquals(output, null);
	}

}
