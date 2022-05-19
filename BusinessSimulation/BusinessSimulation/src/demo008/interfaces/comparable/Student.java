package demo008.interfaces.comparable;

public class Student implements Comparable<Student> {

	private int id;
	
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	// @Override
	public int compareTo(Student student) {
		if(this.id==student.id) {
			return 0;
		} else if(this.id>student.id) {
			return 1;
		} else {
			return -1;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
