import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * String Operations Main
 */
public class StringOperationsMain {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String str = input.nextLine();
		
		System.out.print("Enter a word in the sentence to replace: ");
		String str2 = input.nextLine();
		
		System.out.print("Enter the replacement word: ");
		String str3 = input.nextLine();
		
		int wCount = StringOperations.WordCount(str);
		String Str[] = StringOperations.ReplaceSubstring(str, str2, str3);
		
		System.out.println("Your sentence has " + wCount + " words in it.");
		System.out.println("Your new sentence is:");
		
		
		for (int index = 0 ; index < Str.length; index++){
		System.out.print(Str[index] + " ");
		}
		
		
		
		
		
		
		

	} // end main

} // end class

