

import java.util.ArrayList;


public class SetAnalyzer<T> {

    public SetAnalyzer(){

    }


    public ArrayList<T> intersection(ArrayList<T> list1,ArrayList<T> list2){

       //your work here
    	//initialize the Arraylist that stores the intersection
    	ArrayList<T> inter = new ArrayList<T>();
    	
    	for(int i=0;i<list1.size();i++) {
    		for(int j=0;j<list2.size();j++) {
    			//find the repeats among the two lists
    			if(list1.get(i).equals(list2.get(j))) {
    				inter.add(list1.get(i));
    			}
    		}
    	}
        return inter;  //remove this, default value for template
    }


    public ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2){
    	ArrayList<T> union = new ArrayList<T>();
        //your work here
    	//add all list1 and list2 into the arraylist union
    	for(int i=0;i<list1.size();i++) {
    		union.add(list1.get(i));
    	}
    	
    	for(int i=0;i<list2.size();i++) {
    		union.add(list2.get(i));
    	}
    	//delete the repeat value from the union list
    	for(int i=0;i<list1.size();i++) {
    		for(int j=0;j<list2.size();j++) {
    			if(list1.get(i).equals(list2.get(j))) {
    				union.remove(list1.get(i));
    			}
    		}
    	}
        return union;  //remove this, default value for template

    }


}
