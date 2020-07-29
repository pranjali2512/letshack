package letshackTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import letshack.UniquePattern;

class UniquePatternTest {

	@Test
	void test() {
		String str1 = "My order number is A45675";
		String str2 = "Please cancel my order A45675";
		String output = UniquePattern.findUniquePattern(str1, str2);
		assertEquals(output, "A45675");
	}

}
