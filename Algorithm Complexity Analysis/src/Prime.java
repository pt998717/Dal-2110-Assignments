import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long nth = kb.nextInt();
		//read a nth number

		long startTime, endTime, executionTime;
		startTime = System.currentTimeMillis();
		//set start time
		long nthprime = nthPrime(nth);
		//apply method nthPrime
		 endTime = System.currentTimeMillis();
		 executionTime = endTime - startTime;
		 //set end time
		System.out.print(nth+" "+nthprime+" "+executionTime);
	}
		
		
		
	public static long nthPrime(long n) {
		int count=0;
		int j;
		boolean boo=false;
		long prime = 0;
		//Initialize count stands for nth prime, j for , boo for transformation conditions
			for(long i=2;i<20000000;i++) {
				//20000000 stands for a very large number
				for(j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						boo=true;
						break;
					}
				}
				//i%j means i%(a number >= 2 and <= Math.sqrt(i)), we know that Math.sqrt(i)*Math.sqrt(i)=i
				//assume x<=Math.sqrt(i) and y>=Math.sqrt(i), and there must be 2<=x<=Math.sqrt(i).
				//so only we need to do is to see that if x is exist or not, if exist, i%j=0, that means i is not prime.
				//mathematic idea from "Writing an isPrime function in java and using Math.sqrt [duplicate]", Tim Biegeleisen, 2017.
				//source website: https://stackoverflow.com/questions/46536431/writing-an-isprime-function-in-java-and-using-math-sqrt
				if(boo==false) {//else it is a prime
					count++;
					if(count==n) {//if count to the number that given then return it
						prime = i;
						return i;
					}
				}
			}
			return prime;
		}
		
	}

