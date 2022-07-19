package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coomparable {

	public static void main(String[] args) {
		Student std1 = new Student("abc",001,"Hindi");
	
		Student std4 = new Student("jkl",004,"Science");
		Student std2 = new Student("def",002,"English");
		Student std3 = new Student("ghi",003,"Math");
		Student std5 = new Student("mno",005,"Physics");
		
		ArrayList<Student> stdlist = new ArrayList<>();
		
		stdlist.add(std3);
		stdlist.add(std5);
		stdlist.add(std2);
		stdlist.add(std1);
		stdlist.add(std4);
		
		
		
		iterateList.iterate(stdlist);
		System.out.println("list before Sorting");
		Collections.sort(stdlist);
		iterateList.iterate(stdlist);
		
		
	}

}
class Student implements Comparable<Student> {
	private String name;
	private Integer id;
	private String subject;
	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}
	
	public Student(String name, Integer id, String subject) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override                                                                                                                                                                                                                                                                                                                                                                                           
	public int compareTo(Student obj) {
		
		return this.getName().compareTo(obj.getName());
	}
	
	
}

class iterateList {
	public static <T> void iterate(ArrayList<T> std) {
		for(T st : std) {
			System.out.println(st);
		}
	}
}