import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		//read in the Students text file
		File file = new File("Students.txt");
		Scanner inputFile = new Scanner(file);
		//create two hashmaps
		HashMap h1 = new HashMap();
		HashMap h2 = new HashMap();
		//arraylists to store full name, user name, and password in the text file
		ArrayList fullName = new ArrayList();
		ArrayList name = new ArrayList();
		ArrayList password = new ArrayList();
		//add all elements to arraylists
		while(inputFile.hasNext()) {
			String nextLine = inputFile.nextLine();
			//store each line as a list and split elements by tab
			String[] temp= nextLine.split("\t");
			fullName.add(temp[0]);
			name.add(temp[1]);
			password.add(temp[2]);
		}
		//add keys and values in hashmaps
		for(int i=0;i<name.size();i++) {
			//A HashMap with username as key and the password as value
			h1.put(name.get(i), password.get(i));
			//Another HashMap with the username as key and full name as value
			h2.put(name.get(i), fullName.get(i));
		}
		//first time login
		System.out.print("Login: ");
		String userName = keyboard.next();
		System.out.print("Password: ");
		String passWord = keyboard.next();
		
		int count = 3;
		for(int i=1;i<4;i++) {
			//when either username or password is incorrect and remain attempt more than 0
			if((!h1.containsKey(userName) || !h1.containsValue(passWord))&&count-i!=0){
			System.out.println("");
			System.out.println("Either the usename or password is incorrect. You have "+ (count-i) + " more attempts.");
			//login again
			System.out.print("Login: ");
			userName = keyboard.next();
			System.out.print("Password: ");
			passWord = keyboard.next();
			//if the username and password match then break the loop
			}else if(h1.containsKey(userName) && h1.containsValue(passWord)){
				System.out.println("");
				System.out.println("Login successful");
				System.out.print("Welcome "+h2.get(userName));
				break;
			//when attempt time = 3
			}else {
				System.out.println("");
				System.out.println("Sorry. Incorrect login. Please contact the system administrator.");
			}
		}
		
	}
}
