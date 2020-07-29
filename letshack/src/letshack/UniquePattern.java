package letshack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniquePattern {

	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");  
        String first = scan.nextLine(); 
        System.out.println("Enter second string: ");  
        String second = scan.nextLine(); 
        scan.close();
        findUniquePattern(first.toLowerCase(), second.toLowerCase());
	}

	public static void findUniquePattern(String first, String second) {
		Pattern pattern = Pattern.compile("\\b[a]\\d*");
		Matcher m1 = pattern.matcher(first);
		Matcher m2 = pattern.matcher(second);
		System.out.println(m1.groupCount());
		
		
	}
}
