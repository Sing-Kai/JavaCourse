
//A Position class to represent a position on the 3x3 playing board.

class Position{

	public String a1 = "a1";
	public String a2 = "a2";
	public String a3 = "a3";
	public String b1 = "b1";
	public String b2 = "b2";
	public String b3 = "b3";
	public String c1 = "c1";
	public String c2 = "c2";
	public String c3 = "c3";

//	public String block1[0][0];

	public String getPositionA1(){
		return a1;
	}

	public String getPositionA2(){
		return a2;
	}

	public String getPositionA3(){
		return a3;
	}

	public String getPositionB1(){
		return b1;
	}

	public String getPositionB2(){
		return b2;
	}	

	public String getPositionB3(){
		return b3;
	}	

	public String getPositionC1(){
		return c1;
	}

	public String getPositionC2(){
		return c2;
	}	

	public String getPositionC3(){
		return c3;
	}		
/*
    public String[][] topRow(String[][] board){
    	String[][] topRowArray = {};
    	for (int row = 0; row < 1; row++){
    		for(int col =0; col < 3; col++){
    			topRowArray[row][col] = board[row][col];
    		}
    	}
    	return topRowArray;
    }

*/

 /*   
    public String[][] setBoardPosition(String[][] board, String playerSymbol){

    }
*/
}
