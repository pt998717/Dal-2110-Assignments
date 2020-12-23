

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeAnalyzerTester {

    public static void main(String[] args) throws FileNotFoundException {

        GradeAnalyzer analyzer = new GradeAnalyzer();
        //Your work starts here
        //set a record as null
        Record record = null;
        //to store a keyboard input
        String input = "";
        //Scanner to read a file
        Scanner kb = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = kb.nextLine();
		//initialize a file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		//add all records in the file to the gradelist
		for(int i=0;i<52;i++) {
			//input data from the file
			input = inputFile.nextLine();
			String name = input;
			input = inputFile.nextLine();
			String str_grade = input;
			//convert string(grade) to integer
			int grade = Integer.parseInt(str_grade);
			record = new Record(name,grade);
			//add record to the gradelist
			analyzer.addRecord(record);

			
		}
		//call the methods from analyzer class
		analyzer.printAllRecords();
		System.out.println("_______________________________________________");
		analyzer.printHistogram();
    }
}
