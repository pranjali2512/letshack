package letshackTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import letshack.SecondHighest;

class SecondHighestTest {

	@Test
	void test() {
		int[] inputArray = {8,7,6,3,10,9};
		int output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, 9);
	}

}
