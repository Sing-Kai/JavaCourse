import java.util.*;
//A Display class, which deals with printing out the board as text, 
//and with receiving inputs from the players

class Display{

	public void sayDisplay(){
		System.out.println("Display");
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
		System.out.println("Please enter position on board:");
		Scanner scannedPosition = new Scanner(System.in);
		String userPosition = scannedPosition.nextLine();
		return userPosition;
	}

}
