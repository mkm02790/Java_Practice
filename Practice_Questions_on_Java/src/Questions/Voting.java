package Questions;

public class Voting {

	public static void main(String[] args) {
	int age=13;
	Votingrights.rights(age);

	}

}
class Votingrights{
	
	static void rights(int age)  {
		if(age <18)
		{
			throw new KhudKiCustomExceptionClass("ye to partameterize");
		}
		else
			System.out.println("ellgible for voting");
	}
}