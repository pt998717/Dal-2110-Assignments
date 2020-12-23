
public class SlowFlexible extends SlowPiece {
	//inherit SlowPiece and create subclass SlowFlexible
	//Constructor
	public SlowFlexible(String Name, String Colour, int X, int Y){
		super(Name, Colour, X, Y);
	}
	//static method move that determine the piece goes up or down for 1 space
	public static void move(String direction) {
		//After moving up still on the board
		if(direction.equals("up")&&0<X) {
			//for the piece moves on the board and the previous position equals to null
			Board.board[X-1][Y]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual X decrease by 1
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by 1 space\n");
			X=X-1;
		//else the piece will move out of the board
		}else if(direction == "up") {
			System.out.println("Error: out of board!");
		}
		
		//Making sure after moving down for 1 space still on the board
		if(direction.equals("down")&&X<7) {
			Board.board[X+1][Y]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual X increase by 1
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by 1 space\n");
			X=X+1;
		//else the piece will move out of the board
		}else if(direction == "down") {
			System.out.println("Error: out of board!");
		}
		
	}
	//override method toString follow name+colour+SlowFlexible
	public String toString() {
		return this.Name+this.Colour+"SlowFlexible";
	}
}
