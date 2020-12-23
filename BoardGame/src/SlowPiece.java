
public class SlowPiece extends Piece {
	//inherit Piece and create subclass SlowPiece
	//Constructor
	public SlowPiece(String Name, String Colour, int X, int Y){
		super(Name, Colour, X, Y);
	}
	//static method move that determine the piece goes left or right for 1 space
	public static void move(String direction) {
		//After moving left still on the board
		if(direction.equals("left") && 0<Y) {
			//for the piece moves on the board and the previous position equals to null
			Board.board[X][Y-1]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual Y decrease by 1
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by 1 space\n");
			Y = Y-1;
		//else the piece will move out of the board
		}else if(direction.equals("left")) {
			System.out.println("Error: out of board!");
		}
		//After moving right still on the board
		if(direction.equals("right") && Y<7) {
			//for the piece moves on the board and the previous position equals to null
			Board.board[X][Y+1]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual Y increase by 1
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by 1 space\n");
			Y=Y+1;
		//else the piece will move out of the board
		}else if(direction.equals("right")){
			System.out.println("Error: out of board!");
		}
	
	}
	//override method toString follow name+colour+SlowPiece
	public String toString() {
		
		return Name+Colour+"SlowPiece";
	}
}