package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Emp {
   public  static class Empdetail{
	int id;
	String name;
	public Empdetail(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}


    public static void main(String[] args) {
        ArrayList<Empdetail> al = new ArrayList<Empdetail>();
	al.add(new Empdetail(103,"dasd"));
	al.add(new Empdetail(102,"qweq"));
	al.add(new Empdetail(101,"ewewq"));
	al.add(new Empdetail(101,"tfsful"));

	
	Collections.sort(al , new SortByName());
	for(Empdetail ee : al)
	{
		System.out.println(ee.name);
		System.out.println();
	}

	}
	
public static class SortByName implements Comparator<Empdetail>{

	@Override
	public int compare(Empdetail o1, Empdetail o2) {
		
		
		return o1.name.compareTo(o2.name);
	}
}}