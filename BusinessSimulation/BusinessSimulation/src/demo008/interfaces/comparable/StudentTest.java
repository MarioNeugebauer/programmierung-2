package demo008.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(100, "Miller"));
		studentList.add(new Student(43, "Smith"));
		studentList.add(new Student(67, "Brooks"));
		studentList.add(new Student(23, "Adams"));
		
		Collections.sort(studentList);
		
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getId() + " : "+studentList.get(i).getName());
		}
	}
}
