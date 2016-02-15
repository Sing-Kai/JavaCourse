
//to represent the current state of the game, 
//i.e. a 3x3 grid, plus which player's turn it is to move next. 
//It should probably also be responsible for checking whether moves are valid or not, 
//whether a player has just won or not, or whether the game is a draw

class Board{

	public String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};

	Display displayBoard = new Display();
	Position boardPosition = new Position();
	EnumType symbol = new EnumType();

	String crossSymbol = symbol.getCross();
	String naughtSymbol = symbol.getNaught();
	String spaceSymbol = symbol.getSpace();



	public void runGame(String playerSymbol){

		Boolean start = true;
		Boolean end = false;	

		while (start){

			String userInput = displayBoard.scanUserInput();

			if(updateBoard(userInput, playerSymbol)){
				displayBoard.printBoard(board);
			}

			if (gameWon(board)){
				start = end;
			}

			playerSymbol = switchPlayer(playerSymbol);
		}
	}

	public String switchPlayer(String playerSymbol){

		if (playerSymbol.equals(crossSymbol)){
			return naughtSymbol;
		}
		else{
			return crossSymbol;
		}
	}

	public void invalidPosition(String userInput, String playerSymbol){
		System.out.println("Sorry " + userInput + " is not a valid position. Please try again.");
		runGame(playerSymbol);		
	}

	public Boolean updateBoard(String userInput, String playerSymbol){

		if (userInput.equals(boardPosition.a1) && isSpace(board[0][0])){
			board[0][0] = playerSymbol;
			return true;
		}
		else if (userInput.equals(boardPosition.a2) && isSpace(board[0][1])){
			board[0][1] = playerSymbol;	
	 		return true;		
		}
		else if (userInput.equals(boardPosition.a3) && isSpace(board[0][2])){
			board[0][2] = playerSymbol;	
	 		return true;				
		}
		else if (userInput.equals(boardPosition.b1) && isSpace(board[1][0])){
			board[1][0] = playerSymbol;	
	 		return true;				
		}
		else if (userInput.equals(boardPosition.b2) && isSpace(board[1][1])){
			board[1][1] = playerSymbol;		
	 		return true;				
		}
		else if (userInput.equals(boardPosition.b3) && isSpace(board[1][2])){
			board[1][2] = playerSymbol;	
	 		return true;					
		}
		else if (userInput.equals(boardPosition.c1) && isSpace(board[2][0])){
			board[2][0] = playerSymbol;	
	 		return true;					
		}
		else if (userInput.equals(boardPosition.c2) && isSpace(board[2][1])){
			board[2][1] = playerSymbol;	
	 		return true;					
		}
		else if (userInput.equals(boardPosition.c3) && isSpace(board[2][2])){
			board[2][2] = playerSymbol;	
	 		return true;				
		}
		else{
			invalidPosition(userInput, playerSymbol);
		}

		return false;
	}

	public Boolean isSpace(String value){
		if(value == spaceSymbol){
			return true;
		}
		return false;
	}

/*
	public Boolean gameDraw(){

	}
*/
	public Boolean gameWon(String[][] board){

		if (checkRowSymbol(board, crossSymbol)){
			return true;
		}
		if (checkRowSymbol(board, naughtSymbol)){
			return true;
		}	
		if (checkColSymbol(board, crossSymbol)){
			return true;
		}
		if (checkColSymbol(board, naughtSymbol)){
			return true;
		}
		if (checkDiagonalSymbol(board, crossSymbol)){
			return true;
		}		
		if (checkDiagonalSymbol(board, naughtSymbol)){
			return true;
		}
		return false;
	}

	// if one of the three rows have the same symbole then return true
	public Boolean checkRowSymbol(String[][] rowPosition, String symbol){
		if (rowPosition[0][0] == symbol && rowPosition[0][1] == symbol && rowPosition[0][2] == symbol){
			return true;
		}
		if (rowPosition[1][0] == symbol && rowPosition[1][1] == symbol && rowPosition[1][2] == symbol){
			return true;
		}
		if (rowPosition[2][0] == symbol && rowPosition[2][1] == symbol && rowPosition[2][2] == symbol){
			return true;
		}
		return false;				
	}

	// if one of the three columns have the same symbole then return true
	public Boolean checkColSymbol(String[][] colPosition, String symbol){
		if (colPosition[0][0] == symbol && colPosition[1][0] == symbol && colPosition[2][0] == symbol){
			return true;
		}
		if (colPosition[0][1] == symbol && colPosition[1][1] == symbol && colPosition[2][1] == symbol){
			return true;
		}
		if (colPosition[0][2] == symbol && colPosition[1][2] == symbol && colPosition[2][2] == symbol){
			return true;
		}
		return false;
	}

	// if one of the diagonal lines have the same symbole then return true
	public Boolean checkDiagonalSymbol(String [][] diagPosition, String symbol){
		if(diagPosition[0][0] == symbol && diagPosition[1][1] == symbol && diagPosition[2][2] == symbol){
			return true;
		}
		if(diagPosition[0][2] == symbol && diagPosition[1][1] == symbol && diagPosition[2][0] == symbol){
			return true;
		}
		return false;
	}



}
