
public class Record {
	//initialize name and grade
	private String name;
	private int grade;
	//contractor
	public Record(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	//get name
	public String getName(){
		return this.name;
	}
	//get grade
	public int getGrade() {
		return this.grade;
	}
	//set name
	public void setName(String name) {
		name = this.name;
	}
	//set grade
	public void setGrade(int grade) {
		grade = this.grade;
	}
}
