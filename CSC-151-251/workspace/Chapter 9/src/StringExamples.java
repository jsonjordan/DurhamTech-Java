/*
 * Examples of using the String object
 */
public class StringExamples {

	public static void main(String[] args) {
		
		// declare string var
		String s1 = "Hello World";
		
		// length
		int length = s1.length();
		System.out.println(length);
		
		// charAt
		System.out.printf("Letter at position 1 is: %s \n", s1.charAt(1));
		
		// indexOf and lastIndexOf
		String str = "Four score and seven years ago";
		int first, last;
		
		first = str.indexOf("r");
		System.out.println("First occurrence of the letter r is: " + first);
		
		last = str.lastIndexOf("r");
		System.out.println("Last occurrence of the letter r is: " + last);

		// using substring
		String fullName = "Jason Jordan";
		
		String lastName = fullName.substring(6);
		System.out.println(lastName);
		
		String firstName = fullName.substring(0, 5);
		System.out.println(firstName);
		
		// startsWith and endsWith
		String str2 = "Peace";
		String str3 = "peace";
		if ( str2.startsWith("Pe")){
			System.out.println("Peace starts with PE");
		}// end if
		else{
			System.out.println("It did not.");
		}
		
		if (str2.equalsIgnoreCase(str3)){
			System.out.println("Equals when ignoring case");
		}
		
		// Sara's problem
		String str4 = "Peace";
		String str5= "pe";
		String str6 = str4.substring(0, 2);
		
		if (str5.equalsIgnoreCase(str6)){
			System.out.println("Sarah's problem solved");
		}
		
		// concatenation
		String str7 = "Flip ";
		String str8 = "Wilson";
		String str9 = str7.concat(str8);
		System.out.println(str9);
		
		
		
		
		
		
		
		

	} // end main

} // end class
