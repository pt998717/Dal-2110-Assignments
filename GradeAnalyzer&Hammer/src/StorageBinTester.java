import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Creates a storage bin and a toolbelt. Adds items to the bin, then to the tool belt if requested.
 */
public class StorageBinTester {

    public static <T, U> void main(String[] args) {



        StorageBin<Tool, Integer> bin = new StorageBin<Tool, Integer>();
        ArrayList<Tool> workbelt = new ArrayList<Tool>();


//Your work starts here
        System.out.println("Enter tools to be stored in the format ItemName ID");
        System.out.println("Enter quit to end the list of tools");
        Scanner kb = new Scanner(System.in);
        String input = "";
        //while loop to add items to the storage bin
        while(!input.equals("quit")) {
        	//set a tool
        	Tool tool =null;      	
        	input = kb.nextLine();
        	//if the tool is Hammer from keyboard
        	if(input.split(" ")[0].equals("Hammer")) {
        		tool = new Hammer(input.split(" ")[0]);
        		((Hammer) tool).setFunction("Hammer");
        		//add it as a hammer item
        		bin.addItem(tool,Integer.parseInt(input.split(" ")[1]));
        	}
        	//if the tool equals to saw
        	if(input.split(" ")[0].equals("Saw")) {
        		tool = new Saw(input.split(" ")[0]);
        		((Saw) tool).setFunction("Saw");
        		//add it as a saw item
        		bin.addItem(tool,Integer.parseInt(input.split(" ")[1]));
        	}
        	//if the tool is Level
        	if(input.split(" ")[0].equals("Level")) {
        		tool = new Level(input.split(" ")[0]);
        		((Level) tool).setFunction("Level");
        		//then add it as a Level item
        		bin.addItem(tool,Integer.parseInt(input.split(" ")[1]));
        	}
        	
        }
        System.out.println("Items in storage:");
        //display the storage bin
        bin.displayItems();
        System.out.println("Would you like to retrieve a tool and add it to the workbelt? yes/no");
        String ans = "";
        //while loop to remove and add items from storage to workbelt
        while(kb.hasNextLine()) {
        	ans = kb.nextLine();
        	//if input is yes
        if(ans.equals("yes")) {
        	System.out.println("Enter item ID");
        	int num = kb.nextInt();
        	
        	//remove && add items by calling removeItems method
        	workbelt.add(bin.removeItem(num));
        	System.out.println("Adding tool to workbelt");
        	System.out.println("Would you like to retrieve a tool and add it to the workbelt? yes/no");
        	ans = "";
        	
        	
            }
        //if input is no
        if(ans.equals("no")) {
        	System.out.println("Okay, hava a nice day!");
        	break;
        }
        
        }
        System.out.print("Tools left in bin:");
        //display what left in the storage bin
        bin.displayItems();
        System.out.println("Tools in workbelt:");
        //display the items added in the workbelt
        for(int i=0;i<workbelt.size();i++) {
        	System.out.println(workbelt.get(i).toString());
        }
    }

}

