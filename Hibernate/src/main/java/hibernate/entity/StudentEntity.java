package hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud1")
public class StudentEntity {
	
	    public StudentEntity(String studentName, String gender) {
		super();
		this.studentName = studentName;
		this.gender = gender;
	}

		public StudentEntity(int studentId) {
		super();
		this.studentId = studentId;
	}

		@Id
	    private int studentId;
	    @Column(nullable = false)
	    private String studentName;
	    private String gender;
	    
		public StudentEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentEntity(int studentId, String studentName, String gender) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.gender = gender;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Entity [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + "]";
		}
	    
	    
	    
}
