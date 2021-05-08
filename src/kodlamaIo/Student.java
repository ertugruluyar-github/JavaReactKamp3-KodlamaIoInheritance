package kodlamaIo;

import java.util.ArrayList;

public class Student extends User {
	private ArrayList<Integer> takenCourseIds;

	public Student(int id, String firstName, String lastName, String email, String userName, String password,
			boolean isVerifiedEmail, ArrayList<Integer> takenCourseIds) {
		super(id, firstName, lastName, email, userName, password, isVerifiedEmail);
		this.takenCourseIds = takenCourseIds;
	}

	public Student(String firstName, String lastName, String email, String userName, String password,
			boolean isVerifiedEmail, ArrayList<Integer> takenCourseIds) {
		super(firstName, lastName, email, userName, password, isVerifiedEmail);
		this.takenCourseIds = takenCourseIds;
	}
	
	//Getter - Setter
	public ArrayList<Integer> getTakenCourseIds() {
		return takenCourseIds;
	}

	public void setTakenCourseIds(ArrayList<Integer> takenCourseIds) {
		this.takenCourseIds = takenCourseIds;
	}
	
}
