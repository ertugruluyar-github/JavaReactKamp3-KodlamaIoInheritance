package kodlamaIo;

public class InstructorManager {
	
	public void addCourse(Instructor �nstructor, int courseId) {
		�nstructor.getCourseIds().add(courseId);
		System.out.println(�nstructor.getFirstName() + " yeni bir kursa olu�turuldu: " + courseId);
	}
	
	public void exitCourse(Instructor �nstructor, int courseId) {
		�nstructor.getCourseIds().remove(courseId);
		System.out.println(�nstructor.getFirstName() + " bir kurs kald�r�ld�: " + courseId);
	}
}
