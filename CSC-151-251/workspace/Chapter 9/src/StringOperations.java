/*
 * Jason Jordan
 * CSC 151
 * 
 * String Operations
 */
public class StringOperations {

	public static int WordCount (String str){
		String Str[] = str.split(" ");
		return Str.length;
	} // end WordCount
	
	
	public static String[] ReplaceSubstring (String str, String str2, String str3){
	     String Str[];
	     
		Str = str.split(" ");  
		for (int index = 0; index < Str.length; index++){
			if( Str[index].equalsIgnoreCase(str2)){
				Str[index] = str3;
			} // end if
		}// end for
	       
		return Str;
	}// end ReplaceSubstring
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end class
