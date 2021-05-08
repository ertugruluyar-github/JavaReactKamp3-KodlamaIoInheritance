package kodlamaIo;

import java.util.ArrayList;

public class Instructor extends User {
	private ArrayList<Integer> courseIds;
	private String[] skills;
	
	public Instructor(int id, String firstName, String lastName, String email, String userName, String password,
			boolean isVerifiedEmail, ArrayList<Integer> courseIds, String[] skills) {
		super(id, firstName, lastName, email, userName, password, isVerifiedEmail);
		this.courseIds = courseIds;
		this.skills = skills;
	}

	public Instructor(String firstName, String lastName, String email, String userName, String password,
			boolean isVerifiedEmail, ArrayList<Integer> courseIds, String[] skills) {
		super(firstName, lastName, email, userName, password, isVerifiedEmail);
		this.courseIds = courseIds;
		this.skills = skills;
	}

	// Getter - Setter
	public ArrayList<Integer> getCourseIds() {
		return courseIds;
	}

	public void setCourseIds(ArrayList<Integer> courseIds) {
		this.courseIds = courseIds;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
}
