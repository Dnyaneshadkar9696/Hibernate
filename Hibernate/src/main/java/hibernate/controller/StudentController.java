package hibernate.controller;

import java.util.List;
import java.util.Scanner;

import hibernate.entity.StudentEntity;
import hibernate.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService sv = new StudentService();

		System.out.println("ORM ( Hibernate) ");

		Scanner sc = new Scanner(System.in);

		int a;

		do {

			System.out.println("Select option to do operation to enter Student Data: ");

			System.out.println("1. Insert Data");
			System.out.println("2. Delete Data");
			System.out.println("3. Update Data");
			System.out.println("4. Get Single Record");
			System.out.println("5. Get All Record");
			System.out.println("6. Exit");

			System.out.print("-----> ");
			a = sc.nextInt();

			switch (a) {

			case 1:
				System.out.println("Enter StudentId: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Student Name: ");
				String name = sc.nextLine();

				System.out.println("Enter Student Gender: ");
				String gender = sc.nextLine();

				StudentEntity se = new StudentEntity(id, name, gender);

				String m = sv.insertStudent(se);
				System.out.println(m);

				break;
			case 2:
				System.out.println("Enter StudentId: ");
				int id1 = sc.nextInt();
				StudentEntity e = new StudentEntity(id1);
				
				String ms = sv.deleteStudent(e);
				
				System.out.println(ms);
				

				break;
			case 3:
				System.out.println("Enter id to update: ");
				int id11 = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter new Name: ");
				String newName = sc.nextLine();
				
				System.out.println("New Gender details : ");
				String newGender = sc.nextLine();
				
				
				StudentEntity sy = new StudentEntity(id11, newName, newGender);
				
				String hh = sv.updateStudent(sy);
				System.out.println(hh);
				
				break;
			case 4:
				System.out.println("Enter the id: ");
				int idd = sc.nextInt();
				
				StudentEntity did = new StudentEntity(idd);
				
				StudentEntity r = sv.getSingleRecord(did);
				
				System.out.println(r.getStudentId());
				System.out.println(r.getStudentName());
				System.out.println(r.getGender());
				System.out.println("-------------------");
				System.out.println();
				
				break;
			case 5:
			
				List<StudentEntity> students = sv.getAllStudents();
				System.out.println("All the Students: ");
				 for (StudentEntity s : students) {
				        System.out.println(
				            "ID: " + s.getStudentId() +
				            ", Name: " + s.getStudentName() +
				            ", Gender: " + s.getGender()
				        );
				    }
				 System.out.println("------------------");
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Enter the accurate choice...");

			}

		} while (a != 6);

		sc.close();

	}

}
