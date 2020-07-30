package letshack;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String args[]) {
		int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        length = scan.nextInt();
        int a[] = new int[length];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < length; i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        String returnValue = checkSecondHighest(a, length);
        if(returnValue == null) {
        	System.out.println("Invalid");
        } else {
        	System.out.println("Second highest number"+ returnValue);
        }
	}

	public static String checkSecondHighest(int a[], int length) {
		int highestNumber, secondHighestNumber, minNumber;

		if (length < 2) {
			System.out.println("Array must have at least 2 numbers.");
			return null;
		}

		highestNumber = secondHighestNumber = minNumber = -1000000000; // lets equate to the minimum value of int

		for (int i = 0; i < length; i++) {

			if (a[i] > highestNumber) {
				secondHighestNumber = highestNumber;
				highestNumber = a[i];
			}
			else if (a[i] > secondHighestNumber && a[i] != highestNumber)
				secondHighestNumber = a[i];
		}

		if (secondHighestNumber == minNumber) {
			return null;
		}
		else {
			
			String returnVal = Integer.toString(secondHighestNumber);
			return returnVal;
		}
	}
}