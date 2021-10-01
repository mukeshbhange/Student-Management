package studentcontroller;

import model.Student;
import serviceimpl.ServiceImpl;

public class DataDashBoard {

	public static void main(String[] args) {
		
		Student student = Student.getInstance();		
		ServiceImpl serviceimpl = ServiceImpl.getInstance();
		serviceimpl.addStudent(student);
		serviceimpl.display();
	}
}
