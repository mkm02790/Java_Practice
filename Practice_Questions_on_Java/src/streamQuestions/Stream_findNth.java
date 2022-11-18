package streamQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* Find Name of Student who has got highest Marks*/
public class Stream_findNth {

	
	  public static void main(String[] args) {
		  ArrayList<Students> s1 = new  ArrayList<Students>(); 
		  s1.add(new Students("abc" ,101 ,97,"UP")); 
		  s1.add(new Students("def" ,102 ,95,"DL")); 
		  s1.add(new Students("ghi" ,103 ,96,"MP"));
	      s1.add(new Students("jkl" ,104 ,56,"MH")); 
	      s1.add(new Students("mno" ,105 ,76,"RJ")); 
	      s1.add(new Students("pqr" ,106 ,75,"TL")); 
	      s1.add(new Students("stu" ,107 ,34,"AP"));
	      s1.add(new Students("vwx" ,108 ,41,"WB"));
	  
	  
	  
	  
	   	  
	   Integer hm=  s1.stream().map((e) -> e.getMarks()).max(Double ::compare).get();
	   System.out.println( " " +hm);
	   
	   
	   s1.stream().filter((e) -> e.getMarks()==hm).forEach(a -> System.out.println(a.getName()));
	  
	  } 
	  
} class Students{
	 
String name ;
int rollno;
int marks;
String state;  
 
 public Students(String name, int rollno, int marks, String state) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
	this.state = state;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}


}	  
	  
	  
	