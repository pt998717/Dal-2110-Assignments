import java.util.*;
import java.util.Scanner;
public class Exercise1 {
	public static <T> void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter how many items are in the list?");
		int size = kb.nextInt();
		//create two lists to store integers and strings
		Integer[] list2 = new Integer[size];
		String[] list1 = new String[size];
		System.out.println("Are we sorting Strings or Integers?");
		String str = kb.next();
		//when inputs are strings
		if (str.equals("Strings")) {
			System.out.println("Enter values");
			//store all strings from input in the list
			for(int i=0;i<size;i++) {
				String input = kb.next();
				list1[i]=input;
			}
				System.out.println("Do you want to sort Min or Max?");
				String str1 = kb.next();
				//sortMax
				if(str1.equals("Max")) {
					System.out.print("Sorting complete. Total swaps: ");
					//calling bubbleSortMax method
					bubbleSortMax(list1);
					//print the list
					for(int h=0;h<size;h++) {
						System.out.print(list1[h]+" ");
					}
				}
				//sortMin
				else {
					System.out.print("Sorting complete. Total swaps: ");
					//calling bubbleSortMin method
					bubbleSortMin(list1);
					//print the list
					for(int h=0;h<size;h++) {
						System.out.print(list1[h]+" ");
					}
				}
				}
		//when inputs are integers
		else if(str.equals("Integers")){
			System.out.println("Enter values");
			//store all integers from input in the list
			for(int i=0;i<size;i++) {
				int input = kb.nextInt();
				list2[i]=input;
			}
			System.out.println("Do you want to sort Min or Max?");
			String str1 = kb.next();
			//sortMin
			if(str1.equals("Min")) {
				System.out.print("Sorting complete. Total swaps: ");
				//calling bubbleSortMin method
				bubbleSortMin(list2);
				//print the list
				for(int h=0;h<size;h++) {
					System.out.print(list2[h]+" ");
				}
			}
			//sortMax
			else {
				System.out.print("Sorting complete. Total swaps: ");
				//calling bubbleSortMax method
				bubbleSortMax(list2);
				//print the list
				for(int h=0;h<size;h++) {
					System.out.print(list2[h]+" ");
				}
			}
		}
		kb.close();
		
	}
	//bubbleSortMin method
	public static <T extends Comparable<T>> T[] bubbleSortMin (T[] list) {
		int count = 0;
		int n = list.length;
		//two for loops to select two near elements
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				//using compare the two elements
				if(list[j].compareTo(list[j+1])>0){
					//store the bigger one in the front and swap them
					T temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					//count plus one
					count++;
				}
			}
			
		}
		System.out.println(count);
		return list;
		
	}
	//bubbleSortMax method
	public static <T extends Comparable<T>> T[] bubbleSortMax (T[] list) {
		int count = 0;
		int n = list.length;
		//two for loops to select two near elements
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				//using compare the two elements
				if(list[j].compareTo(list[j+1])<0){
					//store the smaller one in the front and swap them
					T temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					//count one more
					count++;
				}
			}
		}
		System.out.println(count);
		return list;
	}

}
