

import java.util.ArrayList;

/**
 * A class which stores items with unique identifiers
 * @param <T>
 * @param <U>
 */
public class StorageBin<T,U> {

    private ArrayList<T> itemsStored;
    private ArrayList<U> itemIDs;


    /**
     * Setting up the lists
     */
    public StorageBin(){
    	itemsStored = new ArrayList<T>();
    	itemIDs = new ArrayList<U>();
        //Your work starts here
    }
    //return the storagebin size
    public int sizeofBin() {
    	return itemsStored.size();
    }
    //add items to the storage bin 
    public void addItem(T item, U id) {
    	if(!itemIDs.contains(id)) {
    		itemsStored.add(item);
    		itemIDs.add(id);
    		//if exist an ID then error
    	}else {
    		System.out.println("Error, ID already used");
    	}
    	
    }
    //remove items from the storage bin
	public T removeItem(U id) {
    	T item = itemsStored.remove(itemIDs.indexOf(id));//indexOf method to find the position of item
		itemIDs.remove(itemIDs.indexOf(id));
		return item;
    }
	//display items in the storagebin
    public void displayItems() {
    	for(int i=0;i<itemIDs.size();i++) {
    	System.out.println("Item:"+itemsStored.get(i).toString()+" ID: "+itemIDs.get(i)+"\n");
    	}
    }
    

}
