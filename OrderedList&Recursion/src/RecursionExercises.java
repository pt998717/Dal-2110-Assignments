
public class RecursionExercises {
	//Recursion method squares
	public static int squares(int n) {
		//n = 1(1*1 =1) return 1
		if(n==1) {
			return 1;
		}
		//add n*n each time
		return n*n+squares(n-1);
	}

	public static String reverseString(String n, int i) {
		//return n if n has length larger than one
		if((n==null)||(n.length()<=1)) {
			return n;
		}
		//return the method itself
		//charAt(0) is the first char in the given word and add it to the end each time to achieve reverse
		return reverseString(n.substring(1),i) + n.charAt(0);
	}
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 6;
		String str1 = "Hello";
		String str2 = "Orange";
		int i1 = 2;
		int i2 = 3;
		//cut the substring before the give index for n
		String n1 = str1.substring(0,str1.length()-i1);
		String n2 = str2.substring(0,str2.length()-i2);
		//calling two methods
		System.out.println("The sum of the squares up to "+num1+ " is: "+squares(num1));
		System.out.println("The sum of the squares up to "+num2+ " is: "+squares(num2));
		System.out.println("Starting word is "+str1+", reversed from index "+i1+" is "+reverseString(n1,i1));
		System.out.println("Starting word is "+str2+", reversed from index "+i2+" is "+reverseString(n2,i2));
	}
}
