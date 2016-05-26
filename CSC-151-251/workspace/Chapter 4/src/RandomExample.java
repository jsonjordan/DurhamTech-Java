import java.security.SecureRandom;

/*
 * Example of random number generator 
 * 
 * 
 */
public class RandomExample {

	public static void main(String[] args) {
		// instance of securerandom
		SecureRandom rand = new SecureRandom();

		// pick number from 1 = 100
		int num;
		
		for ( int i =1; i <= 10; i++){
			num = 1 + rand.nextInt(100);
			System.out.println(num);
		}
		
		
		
		
		
		
		
	} // end main

} // end class
