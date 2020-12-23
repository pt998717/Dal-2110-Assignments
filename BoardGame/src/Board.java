
public class Board{
	//create a empty board to store pieces
	public static Piece[][] board = new Piece[8][8];
	public Board() {
	}
	//Add method to add new pieces to the board
	public static void Add(Piece piece) {
		//check if there is a space to add this piece
		if(board[piece.getX()][piece.getY()]==null ) {
			board[piece.getX()][piece.getY()]=piece;
		}else {
			System.out.print("Error: already have a piece "+"("+piece.getX()+","+piece.getY()+")\n");//else print error
		}
		
	}
	//move method that apply other classes move method
	public static void move(int X, int Y, String direction, int n) {
		//error if no piece at that location
		if(board[X][Y]==null){
			System.out.print("Error: no piece at ("+X+","+Y+")\n");
		}
		//match slowpiece move method then call it in a static way
		if(board[X][Y]!=null&&(direction.equals("left")||direction.equals("right"))&&n==1) {
			SlowPiece.move(direction);
			//match fastpiece move method then call it in a static way
		}else if(board[X][Y]!=null&&(direction.equals("left")||direction.equals("right"))&&n>1) {
			FastPiece.move(direction,n);
			//match slowflexible move method then call it in a static way
		}else if(board[X][Y]!=null&&(direction.equals("up")||direction.equals("down"))&&n==1) {
			SlowFlexible.move(direction);
			//match fastflexible move method then call it in a static way
		}else if(board[X][Y]!=null&&(direction.equals("up")||direction.equals("down"))&&n>1) {
			FastFlexible.move(direction,n);
		}
	}
	//display the board
	public void Display() {
		for(int i=0;i<8;i++) {
		//create rows
			for(int j=0;j<8;j++) {
				//create columns
				//if no piece then default to -
				if(board[i][j]==null) {
				System.out.print("-     ");
				//else print that piece
				}else {
					System.out.print(board[i][j]);
			}
		}
			System.out.println();
		}

	}
}
	


