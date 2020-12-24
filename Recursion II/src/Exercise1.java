
public class Exercise1 {
	
		public static int fib(int n) {
			//base n=0
			if(n==0) {
				return 0;
			}
			//base n=1
			if(n==1) {
				return 1;
			}
			//recusion for adding two integers
			else {
				return fib(n-1)+fib(n-2);
			}
		}
	public static void main(String[] args) {
		//using a loop to print the result
		for(int i =0;i<20;i++) {
			if(i<19) {
			System.out.print(fib(i)+",");
			}else {
				System.out.print(fib(i));
			}
		}
	}
}
