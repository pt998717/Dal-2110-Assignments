import java.util.Scanner;
public class Exercise3 {
	public static void writeVertical(int n) {
		//s is the ones place in integer n
		int s = n%10;
		if(n==0) {
			return;
		}else {
			//delete the ones place
			writeVertical(n/10);
		}
		//each time prints the ones place number
		System.out.println(s);
	}
	public static void main(String[] args) {
		//Scan the input
		System.out.println("Enter an integer: ");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		kb.close();
		//call the recusion method
		writeVertical(num);
	}
}
