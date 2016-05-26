
public class trial2 {

	public static void main(String[] args) {
		int [] [] scores = { {88, 80, 79, 92}, {75, 84, 93, 80}, 
				{98, 95, 92, 94}, {91, 84, 88, 96} }; 
		
		System.out.print(scores[2][3]);
		
		String str = "abc456"; 
		int m = 0; 
		while ( m < 6 ) 
		{ 
		if (Character.isLetter(str.charAt(m))) 
		System.out.print( 
		Character.toUpperCase(str.charAt(m))); 
		m++; 
		} 

		int loc; 
		String stri = "The cow jumped over the moon."; 
		loc = stri.indexOf("ov"); 
		System.out.println(loc);
		
		StringBuilder str1 = new StringBuilder("Little Jack Horner "); 
		str1.append("sat on the "); 
		str1.append("corner"); 
		System.out.println(str1);
		
		
		StringBuilder str2 = 
				new StringBuilder("We have lived in Chicago, " + 
				"Trenton, and Atlanta."); 
				str2.replace(17, 24, "Tampa"); 
				System.out.println(str2);
		
				
				String input = "99#7"; 
				int number; 
				try 
				{ 
				number = Integer.parseInt(input); 
				} 
				catch(NumberFormatException ex) 
				{ 
				number = 0; 
				} 
				catch(RuntimeException ex) 
				{ 
				number = 1; 
				} 
				catch(Exception ex) 
				{ 
				number = -1; 
				} 

				System.out.println(number); 
		
	}

	
	
}
