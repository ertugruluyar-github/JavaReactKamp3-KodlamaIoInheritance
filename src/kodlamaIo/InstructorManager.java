package kodlamaIo;

public class InstructorManager {
	
	public void addCourse(Instructor ınstructor, int courseId) {
		ınstructor.getCourseIds().add(courseId);
		System.out.println(ınstructor.getFirstName() + " yeni bir kursa oluşturuldu: " + courseId);
	}
	
	public void exitCourse(Instructor ınstructor, int courseId) {
		ınstructor.getCourseIds().remove(courseId);
		System.out.println(ınstructor.getFirstName() + " bir kurs kaldırıldı: " + courseId);
	}
}
