class Test{

	Board boardTest = new Board();
	EnumType enumTest = new EnumType();
	Display display = new Display();
	Position position = new Position();

	private int tests;
	private String crossSymbol = enumTest.getCross();
	private String naughtSymbol = enumTest.getNaught();
	private String positionA1 = position.a1;
	private String[][] dummyBoard = {{" "," "," "},{" "," "," "},{" "," "," "}};
	private String[][] dummyBoard2 = {{"X","X","X"},{" "," "," "},{" "," "," "}};
	private String[][] dummyBoard3 = {{"X"," "," "},{"X"," "," "},{"X"," "," "}};	
	private String[][] dummyBoard4 = {{"X"," "," "},{" ","X"," "},{" "," ","X"}};
	private String[][] dummyBoard5 = {{"X","O","X"},{"O","X","X"},{"O","X","O"}};			

    void is(Object x, Object y) {
        tests++;
        if (x == y) return;
        if (x != null && x.equals(y)) return;
        throw new Error("Test " + tests + " failed: " + x + ", " + y);
    }

	public void test(){

		// check symbols are outputed correctly
		is(enumTest.getCross(), "X");
		is(enumTest.getNaught(), "O");
		is(enumTest.getSpace(), " ");	
		// Checks value is a space
		is(boardTest.isSpace(" "), true);
		is(boardTest.isSpace(crossSymbol), false);
		// Switches play symbols
		is(boardTest.switchPlayer(crossSymbol), naughtSymbol);
		is(boardTest.switchPlayer(naughtSymbol), crossSymbol);
		// Update is updated if a valid symbol is entered
		is(boardTest.updateBoard(positionA1, crossSymbol), true);
		// Checks positions on board are available
		is(boardTest.positionAvailable(dummyBoard), true);
		is(boardTest.positionAvailable(dummyBoard5), false);		
		// Check if game is a draw
		is(boardTest.gameDraw(dummyBoard), false);
		is(boardTest.gameDraw(dummyBoard5), true);
		// Checks if there are still moves on the game
		is(boardTest.continueGame(dummyBoard), true);
		is(boardTest.continueGame(dummyBoard5), false);
		// Checks if any a player has won game
		is(boardTest.gameWon(dummyBoard), false);
		is(boardTest.gameWon(dummyBoard2), true);
		is(boardTest.gameWon(dummyBoard3), true);			
		is(boardTest.gameWon(dummyBoard4), true);
		is(boardTest.gameWon(dummyBoard5), false);
		// Checks if a row is matching
		is(boardTest.matchRowSymbol(dummyBoard, crossSymbol), false);
		is(boardTest.matchRowSymbol(dummyBoard2, crossSymbol), true);
		// Checks if column is matching
		is(boardTest.matchColSymbol(dummyBoard, crossSymbol), false);
		is(boardTest.matchColSymbol(dummyBoard3, crossSymbol), true);	
		// Checks if symbol matching diagonally			
		is(boardTest.matchDiagonalSymbol(dummyBoard, crossSymbol), false);
		is(boardTest.matchDiagonalSymbol(dummyBoard4, crossSymbol), true);	


        System.out.println("Tests passed: " + tests);		
	}

}
