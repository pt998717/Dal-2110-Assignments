import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class AverageAnalyzerTester {
	public static void main(String[] args) throws IOException
	{
		//read in filename
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String filename = keyboard.nextLine();
		//read from the file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		//an arraylist that stores numbers from the file
		ArrayList<Integer> values = new ArrayList<Integer> ();
		AverageAnalyzer a = new AverageAnalyzer(values);
		//put values into the arraylist
		while(inputFile.hasNext()) {
			String str = inputFile.nextLine();
			//convert to integer
			int num = Integer.parseInt(str);
			values.add(num);
		}
		System.out.println("Mean: "+a.mean());
		System.out.println("Mode: "+a.mode());
		
	}
}
