package wuziqi;

public class Chessboard {
	// Define the board 
	private String[][] board;
	// Define the size of the board
	public static final int BOARD_SIZE  = 22;
	
	public void initBoard(){
		board = new String[BOARD_SIZE][BOARD_SIZE];
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				board[i][j] = "+";
			}
		}
	}
	
	public static int getBoardSize(){
		new Chessboard();
		return Chessboard.BOARD_SIZE;
		
	}
	
}
