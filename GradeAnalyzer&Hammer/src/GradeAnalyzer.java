

/**
 * Basic record keeping class
 */
public class GradeAnalyzer {

    //setting up a list for Records and for storing summary data on grades
    private List<Record> gradeList;
    private int[] gradeSummary;
    public GradeAnalyzer(){
       //your work starts here
    	gradeList = new List<Record>();
    }
    //method that add records to the grade list
    public void addRecord(Record r) {
    	gradeList.add(r);
    }
    //method that remove records from the grade list
    public void removeRecord(Record r) {
    	gradeList.remove(r);
    }
    //clear all records from the grade list
    public void clearAllRecords(Record r) {
    	gradeList.removeAll(r);
    }
    //print all records from the grade list
    public void printAllRecords() {
    	Record record = gradeList.first();
    	//get the first element from the gradelist
    	String name = record.getName();
    	int grade = record.getGrade();
    	//get the name and the grade from the first record
    	System.out.println(name+","+grade);
    	//for the rest of the gradelist use .next()
    	for(int i=0;i<51;i++) {
    		Record record1 = gradeList.next();
        	String name1 = record1.getName();
        	int grade1 = record1.getGrade();
    		System.out.println(name1+","+grade1);
    		
    	}
    	
    }
    //print the histogram
    public void printHistogram() {
    	//set the list size
    	gradeSummary = new int[52];
    	//initialize all the strings to store *
    	String star0 = "" ,star1 = "",star2 = "",star3 = "",star4 = "",star5 = "",star6 = "",star7 = "",star8 = "",star9 = "";
    	//go through all the grades and decide which add a "*"
    	for(int i=0;i<52;i++){
    		//put the first grade in the integer list
    		gradeSummary[i]=gradeList.first().getGrade();
    		//different intervals add "*"
    		if(0<=gradeSummary[i] && gradeSummary[i]<10 ) {
    			star0 = star0+"*";
    		}
    		else if(10<=gradeSummary[i] && gradeSummary[i]<20 ) {
    			star1 = star1+"*";
    		}
    		else if(20<=gradeSummary[i] && gradeSummary[i]<30 ) {
    			star2 = star2+"*";
    		}
    		else if(30<=gradeSummary[i] && gradeSummary[i]<40 ) {
    			star3 = star3+"*";
    		}
    		else if(40<=gradeSummary[i] && gradeSummary[i]<50 ) {
    			star4 = star4+"*";
    		}
    		else if(50<=gradeSummary[i] && gradeSummary[i]<60 ) {
    			star5 = star5+"*";
    		}
    		else if(60<=gradeSummary[i] && gradeSummary[i]<70 ) {
    			star6 = star6+"*";
    		}
    		else if(70<=gradeSummary[i] && gradeSummary[i]<80 ) {
    			star7 = star7+"*";
    		}
    		else if(80<=gradeSummary[i] && gradeSummary[i]<90 ) {
    			star8 = star8+"*";
    		}
    		else if(90<=gradeSummary[i] && gradeSummary[i]<=100 ) {
    			star9 = star9+"*";
    		
    		}
    		//remove the first element from the grade list then now the next element is the first element of the list
    		gradeList.remove(gradeList.first());
    	}
    	//print the histogram as the given format
    	System.out.println("0-10|"+star0+"\n"+"10-20|"+star1+"\n"+"20-30|"+star2+"\n"+"30-40|"+star3+"\n"+"40-50|"+star4+"\n"+"50-60|"+star5+"\n"+"60-70|"+star6+"\n"+"70-80|"+star7+"\n"+"80-90|"+star8+"\n"+"90-100|"+star9);
    }

}