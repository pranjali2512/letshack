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
        String output = findUniquePattern(first, second);
        System.out.println(output);
	}

	public static String findUniquePattern(String first, String second) {
		Pattern pattern = Pattern.compile("\\b[a][0-9]*\\b");
		Matcher m1 = pattern.matcher(first.toLowerCase());
		ArrayList<String> unique = new ArrayList<String>();
		
		while(m1.find()) {
			unique.add(m1.group());
		}
		
		if(unique.size() == 1) {
			Matcher m2 = pattern.matcher(second.toLowerCase());
			while(m2.find()) {
				unique.add(m2.group());
			}
			if(unique.size() == 2 ){
				if(unique.get(0).equals(unique.get(1))) {
					return unique.get(0).toUpperCase();
				}
				return null;
			}
		}
		return null;
	}
}
