package letshackTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class SecondHighestTest {

	@Test
	void test() {
		Random element_object = new Random();
		Random size_object = new Random();

		// generate one test case file

		// generate size
		int size = size_object.nextInt(100);
		System.out.println(size);

		// generate array with above size
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = element_object.nextInt(10);
			System.out.println(a[i]);
		}

	}

}
