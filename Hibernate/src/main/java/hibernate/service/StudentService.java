package hibernate.service;

import java.util.List;

import hibernate.entity.StudentEntity;
import repository.dao.StudentRepository;

public class StudentService {
	
	
	StudentRepository sp = new StudentRepository();
	
	public String insertStudent(StudentEntity se) {
		
		String msg = sp.insertStudent(se);
		
		return msg;
		
		
	}
	
	public String deleteStudent(StudentEntity se) {
		
		String ms = sp.deleteStudent(se);
		
		return ms;
		
		
	}
	
	public String updateStudent(StudentEntity sy) {
		
		String msp = sp.updateStudent(sy);
		
		return msp;
	}
	
	public StudentEntity getSingleRecord(StudentEntity did) {
	StudentEntity stud = sp.getSingleStudent(did);
	return stud;
	}
	
	public List<StudentEntity> getAllStudents() {
		
		List<StudentEntity> li = sp.getAllStudent();
		
		return li;
	}

}
