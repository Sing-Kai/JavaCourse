
//to represent the current state of the game, 
//i.e. a 3x3 grid, plus which player's turn it is to move next. 
//It should probably also be responsible for checking whether moves are valid or not, 
//whether a player has just won or not, or whether the game is a draw

class Board{

	public String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};

	Display display = new Display();
	Position boardPosition = new Position();
	EnumType symbol = new EnumType();

	String crossSymbol = symbol.getCross();
	String naughtSymbol = symbol.getNaught();
	String spaceSymbol = symbol.getSpace();

	public void runGame(String playerSymbol){

		Boolean start = true;

		while (start){

			String userInput = display.scanUserInput();

			if (updateBoard(userInput, playerSymbol)){
				display.printBoard(board);
			}

			start = continueGame(board);

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
		display.printInvalidInput(userInput);
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

	public Boolean positionAvailable(String[][] board){

		for(int row = 0; row < board.length; row++){
			for(int col =0; col < board[row].length; col++){
				if (isSpace(board[row][col])){
					return true;
				} 
			}
		}
		return false;
	}

	public Boolean isSpace(String value){
		if(value == spaceSymbol){
			return true;
		}
		return false;
	}

	public Boolean gameDraw(String[][] board){

		if(!(positionAvailable(board))){
			return true;
		}
		return false;
	}

	public Boolean gameWon(String[][] board){

		if (matchRowSymbol(board, crossSymbol)){
			return true;
		}
		if (matchRowSymbol(board, naughtSymbol)){
			return true;
		}	
		if (matchColSymbol(board, crossSymbol)){
			return true;
		}
		if (matchColSymbol(board, naughtSymbol)){
			return true;
		}
		if (matchDiagonalSymbol(board, crossSymbol)){
			return true;
		}		
		if (matchDiagonalSymbol(board, naughtSymbol)){
			return true;
		}
		return false;
	}

	public Boolean continueGame(String[][] board){

		if (gameWon(board) || gameDraw(board)){
			return false;
		}
		return true;
	}

	// if one of the three rows have the same symbole then return true
	public Boolean matchRowSymbol(String[][] rowPosition, String symbol){
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
	public Boolean matchColSymbol(String[][] colPosition, String symbol){
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
	public Boolean matchDiagonalSymbol(String [][] diagPosition, String symbol){
		if(diagPosition[0][0] == symbol && diagPosition[1][1] == symbol && diagPosition[2][2] == symbol){
			return true;
		}
		if(diagPosition[0][2] == symbol && diagPosition[1][1] == symbol && diagPosition[2][0] == symbol){
			return true;
		}
		return false;
	}

}
