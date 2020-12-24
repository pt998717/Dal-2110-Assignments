import java.util.Scanner;
public class Exercise2 {
	public Exercise2() {
		
	}
	public static void countDown2(int n) {
		if(n>0) {
			
			System.out.print(n+"	");
			//calling countDown method again to decrease n by 2
			countDown2(n-2);
		}else {
			//print BlastOff when count to zero
			System.out.println("BlastOff!");
		}
	}
	public static void main(String[] args) {
		//scan the input
		System.out.println("Enter an integer: ");
		Scanner kb = new Scanner (System.in);
		int n = kb.nextInt();
		kb.close();
		//calling the method in main
		countDown2(n);
		
		
	}
}
