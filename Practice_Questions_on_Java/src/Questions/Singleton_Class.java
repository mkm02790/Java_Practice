package DesignPatterns;

public class Singleton_Class {

	public static void main(String[] args) {
		Stud st1 = Stud.getName();
		System.out.println(st1.hashCode());
		Stud st2 = Stud.getName();
		System.out.println(st2.hashCode());

	}

}
class Stud {
	private static Stud name ;
	private Stud (){}
	public static Stud getName() {
		if(name == null) {
			name = new Stud() ;
		}
		return name;
	}
}

