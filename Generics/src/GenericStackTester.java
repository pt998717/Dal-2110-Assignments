import java.util.Scanner;
public class GenericStackTester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//create two types of GenericStacks
		GenericStack<Integer> num = new GenericStack<Integer>();
		GenericStack<String> str = new GenericStack<String>();
		//read in two lines
		String f_str = kb.nextLine();
		String s_str = kb.nextLine();
		//convert two lines to string and store to list split by space
		String[] f_string = f_str.split(" ");
		String[] s_string = s_str.split(" ");
		Integer[] s_integer= new Integer[s_string.length];
		//convert string to int and store in a integer list
		for(int i=0;i<s_string.length-1;i++) {
			int inte=Integer.parseInt(s_string[i]);
			s_integer[i]=inte;
		}
		//push all elements into stack from input list
		for(int i=0;i<f_string.length-1;i++) {
			str.push(f_string[i]);
		}
		
		for(int j=0;j<s_string.length-1;j++) {
			num.push(s_integer[j]);
		}
		

		System.out.println("String Stack Contents:");
		//pop each element from the first stack
		for(int i=0;i<f_string.length-1;i++) {
			System.out.println(str.pop());
		}
		System.out.println();
		//pop elements from the second stack
		System.out.println("Integer Stack Contents:");
		for(int i=0;i<s_string.length-1;i++) {
			System.out.println(num.pop());
		}
	}
	
}
