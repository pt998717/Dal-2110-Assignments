import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class SetAnalyzerTester {
	public static <T> void main(String[] args) throws IOException
	{
		//read integer or string from the keyboard
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Will you be analyzing Strings or Integers? \n");
	String type = keyboard.nextLine();
	//read in the file name
	System.out.print("Enter file name: ");
	String filename1 = keyboard.nextLine();
	//read in another file name
	System.out.print("Enter the second file name: ");
	String filename2 = keyboard.nextLine();
	
	File file1 = new File(filename1);
	Scanner inputFile1 = new Scanner(file1);
	File file2 = new File(filename2);
	Scanner inputFile2 = new Scanner(file2);
	//set SetAnalyzer for using methods in it
	SetAnalyzer a = new SetAnalyzer();
	ArrayList<T> list1 = new ArrayList<T>();
	ArrayList<T> list2 = new ArrayList<T>();
	//pass in values from file to lists
	while(inputFile1.hasNext()) {
		T str1 = (T) inputFile1.nextLine();
		list1.add(str1);
	}
	while(inputFile2.hasNext()) {
		T str2 = (T) inputFile2.nextLine();
		list2.add(str2);
	}
	System.out.println("Intersection:");
	System.out.println(a.intersection(list1, list2)+"\n");
	System.out.println("Union:");
	System.out.println(a.union(list1, list2));
	}
}
