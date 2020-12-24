import java.util.*;
public class Exercise1 {
	public static void main (String[] args){
		System.out.println("What size hash table do you want to work with?");
		System.out.print("Enter a positive Integer: ");
		Scanner kb = new Scanner(System.in);
		//read in size
	    int size = kb.nextInt();
	    //create a arraylist to store keys
	    ArrayList<LinkedList<Integer>> table = new ArrayList<LinkedList<Integer>>(size);
	    //add empty linkedlists to the table
	    for(int i=0;i<size;i++) {
	    	LinkedList<Integer> n = new LinkedList<Integer>();
	    	table.add(n);
	    }
	    //enter the number of keys
		System.out.println("How many keys do you want to generate? ");
		System.out.print("Enter a positive Integer: ");
		int keys = kb.nextInt();
		kb.close();
		//Using set to store random numbers without repetition
		Set<Integer> hashSet = new LinkedHashSet<Integer>();
		Random r = new Random();
		while(hashSet.size() != keys) {
			hashSet.add(r.nextInt(10000) + 1);
		}
		//using a list to store the random values
		List<Integer> rmList=new ArrayList<>(hashSet);
		System.out.println("");
		System.out.println("Hash Table created:");
		//Add keys to appropriate LinkedList
		for(int i=0;i<keys;i++) {
			//calling the hash function
			int pos = rmList.get(i)%size;
			LinkedList<Integer>arr = table.get(pos);
			arr.add(rmList.get(i));
			//set the position and the key to the table
			table.set(pos, arr);
		}
		int count=0;
		int longest = 0;
		for(int i=0;i<size;i++) {
			LinkedList<Integer> list = table.get(i);
			//if the list is empty
			if(list.size()==0) {
				System.out.println("-->empty");
			}
			//if there is only one element in the list
			else if(list.size()==1) {
				System.out.print("-->"+list.get(0));
				System.out.println("");
			}
			//Multiple elements in the list
			else {
				//count the collisions
				count = count+list.size()-1;
				//select the longest list
				if(list.size()>longest) {
					longest = list.size();
				}
				for(int j=0;j<list.size();j++) {
					System.out.print("-->"+list.get(j));
				}
				System.out.println("");
			}
		}
		//load factor
		float load = keys/size;
		System.out.println("");
		System.out.println("Statistics:");
		System.out.println("Table size: "+size);
		System.out.println("Number of keys: "+keys);
		System.out.println("Load factor: "+load);
		System.out.println("Number of collisions: "+count);
		System.out.println("Longest list: "+longest);
	}
}
