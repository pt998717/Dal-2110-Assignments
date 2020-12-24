import java.util.Scanner;
public class Exercise3 {
	private static int mult = 0;
	public Exercise3() {
		
	}
	public static void multiples(int n, int m) {
		
		if(m>1) {
		//mult is the results of multiples
		mult = mult+n;
		System.out.print(mult+", ");
		//m decreases by 1 each time
		multiples(n,m-1);
		}else if(m==1){
			mult = mult+n;
			//no comma after last number
			System.out.print(mult);
		}
	}
	public static void main(String[] args) {
		//scan all inputs
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter a value:");
		int n = kb.nextInt();
		System.out.println("How many multiples do you want?");
		int m = kb.nextInt();
		System.out.println("The first "+m+" multiples of "+n+" are:");
		//calling multiples method
		multiples(n,m);
		kb.close();
	}
}
