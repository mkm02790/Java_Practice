package comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentMainClass {

	public static void main(String[] args) {

		Student std1 = new Student("abc", 001, "Hindi");

		Student std4 = new Student("jkl", 004, "Science");
		Student std2 = new Student("def", 002, "English");
		Student std6 = new Student("zef", 123, "Computer");
		Student std3 = new Student("ghi", 003, "Math");
		Student std5 = new Student("mno", 005, "Physics");

		List<Student> stdlist = Arrays.asList(std1, std2, std3, std4, std5 ,std6);
//Using Comparable interFace
		Collections.sort(stdlist ,new NameComparator());
		
//Using Comparator interface		
System.out.println(stdlist );
	}

}
