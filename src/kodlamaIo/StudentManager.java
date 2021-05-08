package kodlamaIo;

public class StudentManager {
	
	public void joinCourse(Student student ,int courseId) {
		student.getTakenCourseIds().add(courseId);
		System.out.println(student.getFirstName() + " yeni bir kursa katıldı: " + courseId);
	}
	
	public void exitCourse(Student student ,int courseId) {
		student.getTakenCourseIds().remove(courseId);
		System.out.println(student.getFirstName() + " bir kurstan çıktı: " + courseId);
	}
	
}
