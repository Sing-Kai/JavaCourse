import java.util.*;
//A Display class, which deals with printing out the board as text, 
//and with receiving inputs from the players

class Display{

	private String startMessage = "\nStart Game - Player 1 is X and Player 2 is O\n";
	private String endMessage = "Game Over!";
	private String player1Wins = "Player 1 is winner";
	private String player2Wins = "Player 2 is winner";
	private String gameIsDraw = "Game is a draw";
	private String invalidInput = " is not a valid position. Please try again.";	
	private String enterPosition = "\nPlease enter position on board:";
	private String replayMessage = "Would you like to replace";


	public void printStartMessage(){
		System.out.println(startMessage);
	}

	public void printEndMessage(){
		System.out.println(endMessage);
	}

	public void printPlayer1Wins(){
		System.out.println(player1Wins);
	}

	public void printPlayer2Wins(){
		System.out.println(player2Wins);
	}

	public void printGameIsDraw(){
		System.out.println(gameIsDraw);
	}

	public void printInvalidInput(String userInput){
		System.out.println(userInput + invalidInput);		
	}

	private void printTopRow(){
		System.out.println("   1 2 3");
	}

	private void printRow(int row){
		if(row == 0){
			System.out.print("a  ");
		}
		else if(row == 1){
			System.out.print("b  ");
		}
		else{
			System.out.print("c  ");			
		}
	}

	public void printBoard(String[][] board){

		printTopRow();

		for(int row = 0; row < board.length; row++){

			printRow(row);

			for(int col =0; col < board[row].length; col++){
				System.out.print(board[row][col]+" ");
			}

			System.out.print("\n");
		}
	}

	public String scanUserInput(){
		System.out.println(enterPosition);
		Scanner scannedPosition = new Scanner(System.in);
		String userPosition = scannedPosition.nextLine();
		return userPosition;
	}
}
