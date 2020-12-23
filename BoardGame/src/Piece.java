
public class Piece {
	//create super class Piece
	//Create variable Name Colour; static variable X Y
	protected String Name, Colour;
	protected static int X;
	protected static int Y;
	//Constructor
	public Piece(String Name, String Colour, int X, int Y) {
		this.Name = Name;
		this.Colour = Colour;
		Piece.X = X;
		Piece.Y = Y;
	}
	//setName
	public void setName(String Name) {
		this.Name = Name;
	}
	//setColour
	public void setColour(String Colour) {
		this.Colour = Colour;
	}
	//setX
	public void setX(int X) {
		Piece.X = X;
	}
	//setY
	public void setY(int Y) {
		Piece.Y = Y;
	}
	//get Name
	public String getName() {
		return this.Name;
	}
	//get Colour
	public String getColour() {
		return this.Colour;
	}
	//get X
	public Integer getX() {
		return Piece.X;
	}
	//get Y
	public Integer getY() {
		return Piece.Y;
	}
	//toString method follows name+colour
	public String toString() {
		return this.Name+this.Colour;
	}
}