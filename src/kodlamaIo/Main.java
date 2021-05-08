package kodlamaIo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> coursesIds = new ArrayList<Integer>();
		coursesIds.add(0);
		coursesIds.add(1);
		
		ArrayList<Integer> takenCoursesIds = new ArrayList<Integer>();
		takenCoursesIds.add(coursesIds.get(0));
		
		String[] skills = {"Front-End", "Backend"};
		
		Instructor instructor = new Instructor(0, "Didem", "Ak", "didem.ak@gmail.com", "didem32", "123456", false, coursesIds, skills);
		Student student = new Student("Eren", "Ecir", "eren.ecir@gmail.com", "eren12", "12345", false, takenCoursesIds);
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		instructorManager.addCourse(instructor, 2);
		studentManager.joinCourse(student, 2);
		
		System.out.println(coursesIds);
		System.out.println(takenCoursesIds);
		
	}
	

}
