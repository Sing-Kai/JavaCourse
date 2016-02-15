import java.util.*;
import java.io.*;

public class Oxo{

	public static void main(String[] args){

		Board startGame = new Board();
		Display startDisplay = new Display();	
		EnumType player = new EnumType();	
		String playerSymbol = player.getCross();

		System.out.println("Start Game");
		startDisplay.printBoard(startGame.board);
		startGame.runGame(playerSymbol);
		System.out.println("Game Finished");
	}
}