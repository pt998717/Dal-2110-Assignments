import java.util.Scanner;
public class GenericQueueTester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//create two GenericQueues
		GenericQueue<Integer> num = new GenericQueue<Integer>();
		GenericQueue<String> str = new GenericQueue<String>();
		//read in two lines
		String f_str = kb.nextLine();
		String s_str = kb.nextLine();
		//store the two lines in string list and split by space
		String[] f_string = f_str.split(" ");
		String[] s_string = s_str.split(" ");
		Integer[] s_integer= new Integer[s_string.length];
		//store the elements into queue
		for(int i=0;i<f_string.length-1;i++) {
			str.enqueue(f_string[i]);
		}
		//convert string to integer
		for(int i=0;i<s_string.length-1;i++) {
			int inte=Integer.parseInt(s_string[i]);
			s_integer[i]=inte;
		}
		//store the integers in the queue
		for(int j=0;j<s_string.length-1;j++) {
			num.enqueue(s_integer[j]);
		}
		
		System.out.println("String Queue Contents:");
		//remove elements from the queue and print it
		for(int i=0;i<f_string.length-1;i++) {
			System.out.println(str.dequeue());
		}
		System.out.println();
		//remove elements from the queue and print it
		System.out.println("Integer Queue Contents:");
		for(int i=0;i<s_string.length-1;i++) {
			System.out.println(num.dequeue());
		}
	}
}
