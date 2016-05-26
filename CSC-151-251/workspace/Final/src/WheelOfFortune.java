import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Jason Jordan
 * CSC 151
 * 
 * Final Project
 * Wheel of Fortune
 */
public class WheelOfFortune {

	public static void main(String[] args) {
		boolean winner = false;
		
		int currentPlayer =1;
		int choice = 0;
		int spin = 0;
		int spinValue = 0;
		int totalMoney=0;
		int moneyEarned = 0;
		int[] values = {100,300,500,700,900,2000,3000,5000};
		int[] playerScore = {0,0,0};
		String avaliableLetters[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String letterSelection;
		String puzzle[] = {"N","O"," ","G","O","O","D"," ","D","E","E","D"," ","G","O","E","S"," ","U","N","P","U","N","I","S","H","E","D"};
		String blankPuzzle[] = {"_","_"," ","_","_","_","_"," ","_","_","_","_"," ","_","_","_","_"," ","_","_","_","_","_","_","_","_","_","_"};
		String puzzleSolve = "NO GOOD DEED GOES UNPUNISHED";
		String puzzleGuess = "";
		String puzzleType = "(Phrase)";
		
		// Scanner
		Scanner input = new Scanner(System.in);
		// Random
		SecureRandom random = new SecureRandom();
		
		do{
			System.out.println("\nWelcome to the Wheel of Fortune\n");
			System.out.print("Available letters - \n\n");
			for (int index=0; index < avaliableLetters.length; index++){
				System.out.print(avaliableLetters[index]);
			}
			System.out.print("\n\nHere is the puzzle "  + puzzleType + " :\n\n");

			for (int index=0; index < blankPuzzle.length; index++){
				System.out.print(blankPuzzle[index]);
				System.out.print(" ");
			}
			System.out.println("\n\nPlayer " + currentPlayer + " – would you like to Spin (1) or Guess (2) the puzzle? __");
			boolean invalidEntries = true;
			do {
				try{
					choice = input.nextInt();
					if (choice == 1 || choice == 2){
					invalidEntries = false;
					}
				} // end try

				catch (InputMismatchException inputError){
					System.out.println("Must enter a 1 or 2");
					input.nextLine();   
				} // end catch
				
			} while (invalidEntries);
			
			if (choice == 1){
				int letterMatch = 0;
				spin = random.nextInt(10); 
				spin = spin + 1;
				if (spin >= 1 && spin <=8){
					spinValue = values[(spin - 1)];
					System.out.println("You landed on $" + spinValue + ".");
					System.out.println("Select your letter from the available letters from above: __");
					letterSelection = input.nextLine();
					letterSelection = input.nextLine();
					for (int index2=0; index2 < avaliableLetters.length; index2++){
						if (letterSelection.equalsIgnoreCase(avaliableLetters[index2])){
							avaliableLetters[index2] = " ";
						} // end Amend available letters
					}
					for (int index3=0; index3 < puzzle.length; index3++){
						if (letterSelection.equalsIgnoreCase(puzzle[index3])){
							letterMatch++;
							blankPuzzle[index3] = puzzle[index3];
						} // end Letter Match
					}
						if (letterMatch > 0){
							System.out.println("There is/are " + letterMatch + " " + letterSelection + "'s in the puzzle.");
						moneyEarned = letterMatch*spinValue;
						totalMoney = moneyEarned + playerScore[(currentPlayer-1)];
						playerScore[(currentPlayer-1)] = totalMoney;
							System.out.println("You earned $" + moneyEarned);
							pause();
							}
						if (letterMatch == 0){
							System.out.println("There are no " + letterSelection + "'s in the puzzle.");
							currentPlayer = changePlayer(currentPlayer);
							pause();
						}
					// end puzzle check
					
				} // end money spin
				if (spin == 9){
					System.out.println("You went bankrupt!"); 
					playerScore[(currentPlayer-1)] = 0;
					currentPlayer = changePlayer(currentPlayer);
					pause();
				} // end bankrupt
				
				if (spin == 10){
					System.out.println("You lose a turn!");
					currentPlayer = changePlayer(currentPlayer);
					pause();
				} // end lose turn
			}
			if (choice == 2){
				System.out.println("Enter your guess: ");
				puzzleGuess = input.nextLine();
				puzzleGuess = input.nextLine();
				
				if (puzzleGuess.equalsIgnoreCase(puzzleSolve)){
					System.out.println("Congratulations, You have won the game with a score of $" + totalMoney + "!");
					winner = true;
				}
				else{
					System.out.println("I'm sorry, that is not correct.");
					currentPlayer = changePlayer(currentPlayer);
					pause();
					}
				}
			
			
			
			
		} while (winner == false);
		
		
		
		
	} // end main

	public static int changePlayer(int currentPlayer){
		if (currentPlayer == 1){
			currentPlayer =2;
		}else {
		if (currentPlayer == 2){
			currentPlayer =3;
		}else {
		if (currentPlayer == 3){
			currentPlayer =1;
		}
		}
		}
		return currentPlayer;
	} // end changePlayer
		
		
		
		
	public static void pause(){
		String enter = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Press enter to continue");
		enter = input.nextLine();
	}
		

	
	
	
	
	
	
	
	
	
	
} // end class
