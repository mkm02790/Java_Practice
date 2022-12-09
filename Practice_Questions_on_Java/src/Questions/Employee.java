package Questions;

public class Employee implements Comparable<String> {

	int id;
	String Name;
	String Salary;
	String Department;
	@Override
	
	
	public int compareTo(String o) {
		o.compareTo(Salary);
		return id ;
	}
	
	
}
