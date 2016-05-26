import java.security.SecureRandom;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Dice Game
 */



public class DiceGame {

	public static void main(String[] args) {
		// declare vars
		int numUser, numComp, userWins = 0, compWins = 0;
		
		// instance of securerandom
		SecureRandom rand = new SecureRandom();
		
		
		for (int counter = 1; counter <= 10; counter++){
			numUser = 1 + rand.nextInt(6);
			numComp = 1 + rand.nextInt(6);
			System.out.println("User rolled a " + numUser + " Computer rolled a " + numComp);
			if (numUser > numComp){
				userWins ++;
			}
			
			if (numUser < numComp){
				compWins ++;
			}
			
			
			
		} // end of loop
		
		
		if (userWins > compWins ){
			System.out.print("The user wins " + userWins + " - " + compWins);
		} // end if
		
		if (userWins < compWins ){
			System.out.print("The computer wins " + compWins + " - " + userWins);
		} // end if
		
		if (userWins == compWins ){
			System.out.print("The user and computer tied " + userWins + " - " + compWins);
		} // end if
		
		
	}	// end main

}	// end class
