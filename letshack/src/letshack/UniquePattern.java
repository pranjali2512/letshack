package letshack;

import java.util.ArrayList;
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
		Pattern pattern = Pattern.compile("\\b[a][0-9]*\\b");
		Matcher m1 = pattern.matcher(first);
		ArrayList<String> unique = new ArrayList<String>();
		while(m1.find()) {
			unique.add(m1.group());
		}
		if( unique.size()> 1) {
			System.out.println("null");
			return;
		}
		Matcher m2 = pattern.matcher(second);
		while(m2.find()) {
			unique.add(m2.group());
		}
		if( unique.size()> 2) {
			System.out.println("null");
			return;
		}
		if(unique.get(0).equals(unique.get(1))) {
			System.out.println(unique.get(0));
		} else {
			System.out.println("null");
		}
		
	}
}
