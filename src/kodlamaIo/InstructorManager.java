package kodlamaIo;

public class InstructorManager {
	
	public void addCourse(Instructor ýnstructor, int courseId) {
		ýnstructor.getCourseIds().add(courseId);
		System.out.println(ýnstructor.getFirstName() + " yeni bir kursa oluþturuldu: " + courseId);
	}
	
	public void exitCourse(Instructor ýnstructor, int courseId) {
		ýnstructor.getCourseIds().remove(courseId);
		System.out.println(ýnstructor.getFirstName() + " bir kurs kaldýrýldý: " + courseId);
	}
}
