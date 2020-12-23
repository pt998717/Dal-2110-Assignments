import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
public class OrderedListDemo {
	public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1,OrderedList<T> list2){
		//create two ordered list
		OrderedList<T> result = new OrderedList<T>();
		OrderedList<T> temp = new OrderedList<T>();
		   int f1 = 0;
		   int f2 = 0;
		   //insert all items from list2 to result
		   while(f2<list2.size()) {		   
			     result.insert(list2.get(f2));
			     f2++;    
		   }
		   //first item for list1
		   T person=list1.first();
		   //compare list1 and list2 items
		   for(f1=0;f1<list1.size();f1++) {
			   //if the item in list2 less than result then insert it
			   if(person.compareTo(result.get(f1))<0){
				    temp.insert(person);	 
				    person =list1.next();
				    }
			   //if the item is equals to the result item then not insert
			   if(person.compareTo(result.get(f1))==0){
				   person =list1.next();				   
			     }
		   }
		   //temp stores items that not in result but in list1
		   //add the items that not in list1 to list1
		   for(f1=0;f1<temp.size();f1++) {
			   result.insert(temp.get(f1));
		   }
		   return result;
		}
		public static void main(String[] args) throws FileNotFoundException {
		//scan file names
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first filename to read from: ");
		String filename1 = kb.nextLine();
		System.out.print("Enter the second filename to read from: ");
		String filename2 = kb.nextLine();
		kb.close();
		//initialize a file
		File file1 = new File(filename1);
		Scanner inputFile1 = new Scanner(file1);
		File file2 = new File(filename2);
		Scanner inputFile2 = new Scanner(file2);
		//two ordered list
		OrderedList<String> names1 = new OrderedList<String>();
		OrderedList<String> names2 = new OrderedList<String>();
		//add items from list1 to orderedlist
		while(inputFile1.hasNext()){
			String s = inputFile1.nextLine();
			names1.insert(s);
		}
		inputFile1.close();
		//add items from list2 to orderedlist
		while(inputFile2.hasNext()){
			String s = inputFile2.nextLine();
			names2.insert(s);
		}
		
		inputFile2.close();
		
		System.out.println("The Ordered Lists contain the following entries:\nList1:");
		//print names1 items
		names1.enumerate();
		System.out.println("List2:");
		//print names2 items
		names2.enumerate();
		System.out.println("\nA merged version of the two lists looks like this:");
		//call merge method and print the items
		merge(names1,names2).enumerate();
	}
}
