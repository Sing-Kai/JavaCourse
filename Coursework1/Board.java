
//to represent the current state of the game, 
//i.e. a 3x3 grid, plus which player's turn it is to move next. 
//It should probably also be responsible for checking whether moves are valid or not, 
//whether a player has just won or not, or whether the game is a draw

class Board{

	public String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};
	Display displayBoard = new Display();
	Position boardPosition = new Position();
	EnumType symbol1 = new EnumType();
	EnumType symbol2 = new EnumType();

	String crossSymbol = symbol1.cross;
	String naughtSymbol = symbol2.naught;
/*	Boolean player1 = true;
	Boolean player2 = false;	
*/
	public void runGame(){

		Boolean start = true;
		Boolean end = false;
		String playerSymbol = symbol1.cross;		
//		Boolean player1 = true;
//		Boolean player2 = false;

		while (start){

			String userPostion = displayBoard.scanUserInput();

			updateBoard(userPostion, playerSymbol);

			displayBoard.printBoard(board);

			playerSymbol = switchPlayer(playerSymbol);

		}
	}

	public void updateBoard(String value, String playerSymbol){

		if (value.equals(boardPosition.a1)){
			board[0][0] = playerSymbol;
		}
		else if(value.equals(boardPosition.a2)){
			board[0][1] = playerSymbol;			
		}
		else if(value.equals(boardPosition.a3)){
			board[0][2] = playerSymbol;			
		}
		else if(value.equals(boardPosition.b1)){
			board[1][0] = playerSymbol;			
		}
		else if(value.equals(boardPosition.b2)){
			board[1][1] = playerSymbol;			
		}
		else if(value.equals(boardPosition.b3)){
			board[1][2] = playerSymbol;			
		}
		else if(value.equals(boardPosition.c1)){
			board[2][0] = playerSymbol;			
		}
		else if(value.equals(boardPosition.c2)){
			board[2][1] = playerSymbol;			
		}
		else if(value.equals(boardPosition.c2)){
			board[2][2] = playerSymbol;			
		}
		else{
			invalidPosition(value);
		}
	}
/*
	public Boolean changerPlayer1(Boolean player1){
		if (player1){
			return false;
		}
	}

	public Boolean changePlayer2(Boolean player2){
		if (player2){
			return false;
		}
	}
*/

	public String switchPlayer(String playerSymbol){
		if (playerSymbol.equals(crossSymbol)){
			return naughtSymbol;
		}
		else{
			return crossSymbol;
		}
	}



	public void invalidPosition(String value){
		System.out.println("Sorry " + value + " is not a valid position. Please try again.");
		runGame();		
	}
/*
	public Boolean gameFinished(){

	}

	public Boolean gameWon(){

	}

	public Boolean gameDraw(){

	}
*/

/*	
	public Boolean checkRow(String[][] rowPosition){
		if ((rowPosition[0][0] == rowPosition[0][1]) && (rowPosition[0][1] == rowPosition[0][2])){
			return true;
		}

		if ((rowPosition[1][0] == rowPosition[1][1]) && (rowPosition[1][1] == rowPosition[1][2])){
			return true;
		}

		if ((rowPosition[2][0] == rowPosition[2][1]) && (rowPosition[2][1] == rowPosition[2][2])){
			return true;
		}

		return false;				
	}

	public Boolean checkCol(String[][] colPosition){
		if ((colPosition[0][0] == colPosition[1][0]) && (colPosition[1][0] == colPosition[2][0])){
			return true;
		}

		if ((colPosition[0][1] == colPosition[1][1]) && (colPosition[1][1] == colPosition[2][1])){
			return true;
		}

		if ((colPosition[0][0] == colPosition[1][1]) && (colPosition[1][1] == colPosition[2][2])){
			return true;
		}

		return false;
	}
*/
//	public Boolean checkDiagonal(){

//	}

// need a method to check if position has been used already


}
