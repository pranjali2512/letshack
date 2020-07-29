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
        int output = checkSecondHighest(a, length);
        if(output == -1) {
        	System.out.println("Invalid");
        } else {
        	System.out.println("Second highest number"+ output);
        }
	}

	public static int checkSecondHighest(int a[], int length) {
		int n1, n2, min;

		if (length < 2) {
			System.out.println("Array must have at least 2 numbers.");
			return -1;
		}

		n1 = n2 = min = -1000000000; // lets equate to the minimum value of int

		for (int i = 0; i < length; i++) {

			if (a[i] > n1) {
				n2 = n1;
				n1 = a[i];
			}
			else if (a[i] > n2 && a[i] != n1)
				n2 = a[i];
		}

		if (n2 == min) {
			return -1;
		}
		else {
			
			return n2;
		}
	}
}