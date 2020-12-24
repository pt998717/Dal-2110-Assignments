
/**
This class tests the code for Lab4: Exercise2. It creates a GeographyQuiz,
adding elements from an input file to an unordered list, then calling them up
randomly to provide questions and answers for the game. Remember that different lists add elements in FiLo or LiFo.
It expands upon a framework provided by Srini (Dr. Srini Sampalli). Modified by Rob from previous version.
*/

//import Labs.Lab4Fall2020.List;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GeographyQuiz {
	public static void main(String[] args) throws IOException {
        // initialize Scanner to capture user input
        //TO DO
		File file = new File("CountryCapitals.txt");
		


        // capture file information from user and read file
        //TO DO
		Scanner inputFile = new Scanner(file);
        // initialize List to store data from the text file
        ArrayList<String> capitals = new ArrayList<String>();
        ArrayList<String> countries = new ArrayList<String>();
        ArrayList<String> questions = new ArrayList<String>();
        //The rest of your work starts here
        //store data from the text file to lists
        while(inputFile.hasNextLine()) {
        	countries.add(inputFile.nextLine());
        	capitals.add(inputFile.nextLine());
        }
        //add two options that will be asked
        questions.add("country");
        questions.add("capital");
        //Scanner that allows keyboard input
        Scanner kb = new Scanner(System.in);
        String input = "";
        //initialize the ints that count correct and total question number
        int c=0;
        int i=0;
        int t=0;
        System.out.println("Welcome to the Country-Capital Quiz");
        //if starts the game with yes then enter the while loop
        while(!input.equals("No")) {
        	//random r that stands for a random element
        	Random r = new Random();
        	//two numbers set for which country or capitals that selected
        	int rint = r.nextInt(capitals.size());
        	int qint = r.nextInt(questions.size());
        	System.out.print("Play? ");
        	//from keyboard
        	input = kb.nextLine();
        	//ask for the country of given capital
        	if(qint==0&&!input.equals("No")) {
        		System.out.println("What "+questions.get(0)+" has "+capitals.get(rint)+" as its capital?");
        		input = kb.nextLine();
        		//match the country then correct
        		if(input.equals(countries.get(rint))) {
        			c++;
        			System.out.print("Correct. ");
        		//else incorrect
        		}else {
        			System.out.print("Incorrect. The correct answer is "+countries.get(rint)+". ");
        			i++;
        			
        		}
        	}
        	//ask the capital of the given country
        	if(qint==1&&!input.equals("No")) {
        		System.out.println("What is the "+questions.get(1)+" of "+countries.get(rint)+"?");
        		input = kb.nextLine();
        		if(input.equals(capitals.get(rint))) {
        			c++;
        			System.out.print("Correct. ");
        	//else incorrect
        		}else {
        			i++;
        			System.out.print("Incorrect. The correct answer is "+capitals.get(rint)+". ");
        			
        		}
        	}
        	//total questions number
        	t++;
        }
        //convert the integer to a float number
        DecimalFormat df = new DecimalFormat("0.00");
        
        if(input.equals("No")) {
        	System.out.println("Game over.");
        	System.out.println("Game Stats: ");
        	System.out.println("Questions played: "+ (t-1) +"; Correct answers: "+c +"; Score: "+df.format((float)c*100/(t-1))+"%");
        }

	}
}
