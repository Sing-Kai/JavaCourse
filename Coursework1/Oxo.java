import java.util.*;
import java.io.*;

public class Oxo{

	public static void main(String[] args){

		Board game = new Board();
		Display display = new Display();	
		EnumType player = new EnumType();	
		Test runTest = new Test();		
		String player1 = player.getCross();
		String player2 = player.getNaught();

		runTest.test();

		display.printStartMessage();
		display.printBoard(game.board);
		game.runGame(player1);


		// prints out if player 1 or player 2 is winner or game is a draw 
		if(game.matchRowSymbol(game.board, player1)){
			display.printPlayer1Wins();
		}
		else if(game.matchColSymbol(game.board, player1)){
			display.printPlayer1Wins();
		}
		else if(game.matchDiagonalSymbol(game.board, player1)){
			display.printPlayer1Wins();			
		}
		else if(game.matchRowSymbol(game.board, player2)){
			display.printPlayer2Wins();			
		}
		else if(game.matchColSymbol(game.board, player2)){
			display.printPlayer2Wins();	
		}
		else if(game.matchDiagonalSymbol(game.board, player2)){
			display.printPlayer2Wins();			
		}
		else{
			display.printGameIsDraw();
		}

		display.printEndMessage();
	}

}