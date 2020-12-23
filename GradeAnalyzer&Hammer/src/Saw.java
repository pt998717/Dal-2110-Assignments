
public class Saw extends Tool{
	private String func;
	//contractor and call super class
	public Saw(String name) {
		super(name);
	}
	//set function
	public void setFunction(String function) {
		func = function;
	}
	//override toString method
	public String toString() {
		return func+" I saw stuff";
	}
}
