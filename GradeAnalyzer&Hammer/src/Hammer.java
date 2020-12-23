
public class Hammer extends Tool {
	private String func;
	//Contractor and calling super()
	public Hammer(String name){
		super(name);
	}
	//set function
	public void setFunction(String function) {
		func = function;
	}
	//override tOString
	public String toString() {
		return func+" I hammer stuff";
	}
}
