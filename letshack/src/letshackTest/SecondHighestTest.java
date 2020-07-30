package letshackTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import letshack.SecondHighest;

class SecondHighestTest {

	@Test
	void testUniquePositives() {
		int[] inputArray = {8,7,6,3,10,9};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, "9");
	}
	
	@Test
	void testUniqueNegatives() {
		int[] inputArray = {-2,-3,-7,-13,-4,-19,-11};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, "-3");
	}
	
	@Test
	void testNotUniquePositives() {
		int[] inputArray = {8,9,8,3,3,9};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, "8");
	}
	
	@Test
	void testNotUniqueNegatives() {
		int[] inputArray = {-1,-1,-2,-3,-4,-2};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, "-2");
	}
	
	@Test
	void testEqualsNegative() {
		int[] inputArray = {-1,-1,-1};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, null);
	}
	
	@Test
	void testEqualsPositive() {
		int[] inputArray = {5,5,5};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, null);
	}
	
	@Test
	void testInvalidArray() {
		int[] inputArray = {3};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, null);
	}
	
	@Test
	void testIntegerArray() {
		int[] inputArray = {3,-3,-4,5,6,0,9,-1};
		
		String output = SecondHighest.checkSecondHighest(inputArray, inputArray.length);
		assertEquals(output, "6");
	}

}
