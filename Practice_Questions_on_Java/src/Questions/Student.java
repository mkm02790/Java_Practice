package comparison;



 class  Student implements Comparable<Student> {
	 private String name;
     private Integer id;
	 private String subject;

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

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
/*
 * @Override public int compareTo(Student o) {
 * 
 * return this.name.compareTo(o.getName()); }
 */

@Override
public int compareTo(Student o) {
	int i;
	if(this.getId() < o.getId()) {
		i=-1;
	}else if(this.getId() > o.getId()) {
		i=1;		
	}else {
		i=0;
	}		
	return i;
		
	
	
}

}
