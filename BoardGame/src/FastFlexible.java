
public class FastFlexible extends FastPiece {
	//inherit FastPiece and create subclass FastFlexible
	//Constructor
	public FastFlexible(String Name, String Colour, int X, int Y){
		super(Name, Colour, X, Y);
	}
	//static method move that determine the piece goes up or down for n space
	public static void move(String direction, int n) {
		//After moving up still on the board
		
		if(direction.equals("up")&&X>=n) {
			//for the piece moves on the board and the previous position equals to null
			Board.board[X-n][Y]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual X decrease by n
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by "+n+" spaces\n");
			X=X-n;
		//else the piece will move out of the board
		}else if(direction == "up") {
			System.out.println("Error: out of board!");
		}
		
		//Making sure after moving down for n space still on the board
		if(direction.equals("down")&&7-X>=n) {
			Board.board[X+n][Y]=Board.board[X][Y];
			Board.board[X][Y]=null;
			//After printing the command, the actual X increase by n
			System.out.println("Piece at ("+X+","+Y+")"+" moved "+direction+" by "+n+" spaces\n");
			X=X+n;
		//else the piece will move out of the board
		}else if(direction == "down") {
			System.out.println("Error: out of board!");
		}
		
	}
	//override method toString follow name+colour+FastFlexible
	public String toString() {
		return this.Name+this.Colour+"FastFlexible";
	}
}
