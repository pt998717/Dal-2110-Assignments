import java.util.Scanner;
public class Exercise1 {
	public Exercise1() {
		
	}
	//recursive method that return factorial of n
	public static int factorial(int n) {
		
		if(n!=0) {
			//calling the method inside
			return n*factorial(n-1);
		}
		else {
			return 1;
		}
	}
	//power method
	public static int power(int x, int n) {
		
		if(n>0) {
			//calling power method again
			return x*power(x,n-1);
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println("[no input for part a]\n");
		System.out.print("Enter the base: ");
		//scan input
		Scanner kb = new Scanner(System.in);
		int base = kb.nextInt();
		System.out.print("Enter the exponent: ");
		int exponent = kb.nextInt();
		System.out.println("Factorials");
		//show all steps of the factorial
		for(int i =1;i<=exponent;i++) {
			System.out.println(i+"! = "+factorial(i));
		}
		System.out.println("");
		//print the power
		System.out.println(base+" to the power of "+exponent+" is "+power(base,exponent));
		kb.close();
		
	}
}
