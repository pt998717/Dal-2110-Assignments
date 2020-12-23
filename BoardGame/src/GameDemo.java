import java.util.Scanner;
public class GameDemo {
	public static void main(String[] args) {
		//initialize Board class, the board as well as name, colour, direction, x, y, n
		//Board Board = new Board();
		Board Board = new Board();
		Piece[][] board = new Piece[8][8];
		String Name = null, Colour = null, direction=null;
		int X = 0, Y = 0, n=0;
		
		Scanner kb = new Scanner(System.in);
		String king = "";
		//a while loop if the commang is not exit then never stop
		while(!king.equals("exit")) {
			
		System.out.println("Enter a command (type help for details):");
		//read from the keyboard
		king = kb.nextLine();
		//split each word by a space
		String[] string = king.split(" ");
		//switch case if the keyword matches the first word from keyboard
		switch(string[0]) {
		//if matches move
		case "move": 
			//convert string to integer
			X = Integer.valueOf(string[1]).intValue();
			Y = Integer.valueOf(string[2]).intValue();
			direction = string[3];
			n = Integer.valueOf(string[4]).intValue();
			//apply move method in Board class in a static way
			Board.move(X, Y, direction, n);
			break;
			
		case "exit":
			//matches exit then stop the problem
			System.out.print("Exit successfully");
			break;
			
		case "help":
			//matches help then print the help menu
			System.out.println("Possible commands are as follows:\n" + 
					"create location [fast][flexible]: Creates a new piece.\n" +
					"move location direction [spaces]: Moves a piece.\n" + 
					"print: Displays the board.\n" + 
					"help: Displays help.\n" + 
					"exit: Exits the program.");
			break;
		
		//create a new piece if matches create
		case "create":
			//put the third and fourth string as a case
			String modle = string[3]+string[4];
			X = Integer.valueOf(string[1]).intValue();
			Y = Integer.valueOf(string[2]).intValue();
			System.out.println("Input a name for the new piece:");
			//need to type in a name for the piece
			Name = kb.next();
			System.out.println("Input a colour for the new piece:");
			//a colour is also required
			Colour = kb.next();
			//initialize the following four subclasses
			SlowPiece slowpiece = new SlowPiece(Name, Colour, X, Y);
			FastPiece fastpiece = new FastPiece(Name, Colour, X, Y);
			SlowFlexible slowflexible = new SlowFlexible(Name, Colour, X, Y);
			FastFlexible fastflexible = new FastFlexible(Name, Colour, X, Y);
			//if the keyboard third and fourth string match, then switch to corresponding case
			switch(modle) {
			case"slowpiece":
				//apply slow piece move in the board class
				Board.Add(slowpiece);
				break;
			case"fastpiece":
				//apply fast piece move in the board class
				Board.Add(fastpiece);
				break;
			case"slowflexible":
				//apply slow flexible move in the board class
				Board.Add(slowflexible);
				break;
			case"fastflexible":
				//apply fast flexible move in the board class
				Board.Add(fastflexible);
				break;
			}
			break;
		//display the board by calling Display method in Board class
		case "print":
			Board.Display();
			break;
		
		
		}
	}
	}
}
