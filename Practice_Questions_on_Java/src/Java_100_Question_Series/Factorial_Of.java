package Java_100_Question_Series;

public class Factorial_Of {

	public static void main(String[] args) {
		RecurFact recurFact = new RecurFact();
		System.out.println(recurFact.fact(12));

	}

}
class RecurFact {
	int fac ;
	 int fact(int n) {
		 fac = (n==1) ? 1:n* fact(n-1);
			return fac;
		}
	
}