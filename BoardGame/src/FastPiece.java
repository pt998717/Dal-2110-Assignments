
public class FastPiece extends Piece {
	//inherit Piece and create subclass FastPiece
	//Constructor
	public FastPiece(String Name, String Colour, int X, int Y) {
		super(Name, Colour, X, Y);
	}
	//static method move that determine the piece goes left or right for n space
	public static void move(String direction, int n) {
		//After moving left n spaces still on the board
		if(direction.equals("left") && Y>=n) {
			//for the piece moves on the board and the previous position equals to null
			Board.board[X][Y-n]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual Y decrease by n
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by "+n+" spaces\n");
			Y=Y-n;
		//else the piece will move out of the board
		}else if(direction.equals("left")) {
			System.out.println("Error: out of board!");
		}
		
		
		//After moving right n spaces still on the board
		if(direction.equals("right") && 7-Y>=n) {
			//for the piece moves on the board and the previous position equals to null
			Board.board[X][Y+n]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual Y increase by n
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by "+n+" spaces\n");
			Y=Y+n;
		//else the piece will move out of the board
		}else if(direction.equals("right")) {
			System.out.println("Error: out of board!");
		}
		
	}
	//override toString follows name+colour+FastPiece
	public String toString() {
		return Name+Colour+"FastPiece";
	}
}
