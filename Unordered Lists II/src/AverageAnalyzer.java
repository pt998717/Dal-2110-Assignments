

import java.util.ArrayList;


public class AverageAnalyzer {

    private ArrayList<Integer> values;

    public AverageAnalyzer(ArrayList<Integer> values){
        this.values = values;


    }

    //mean method to find the mean among the give list
    public double mean(){
    	//initialize the sum and mean
    	double sum = 0;
    	double mean = 0;
    	//add all numbers
    	for(int i=0;i<values.size();i++) {
    		sum = sum+values.get(i);
    	}
    	//sum/size of the list is the mean
    	mean = sum/values.size();
        return mean;
    }


    //mode method that find the number with the most frequency
    public int mode(){
    	//initialize the max and the mode as s
    	int max = 0;
    	int s = 0;
    	//int list count that store the mode of all numbers
    	int[] count = new int[values.size()];
    	//put 
    	for(int i = 0;i<values.size();i++){
			for(int j = 0;j<values.size();j++){
				//if find a value repetition then that position count+1
				if(values.get(i)==values.get(j)){
					count[i]++;
				}
			}
		}
    	//find the biggest number in the mode list - count[]
    	for(int i =0;i<values.size();i++){
			if(max<=count[i]){
				max=count[i];
				//max is the mode founded
				s=values.get(i);
			}
			
		}
    	
        return s; //remove this, default value for template
    }
}
