
public class CourseManager{
	
	public void addToCourse(Courses courses) {
		System.out.println("Kurs eklendi : " + courses.courseName);
	}
	
	public void deleteToCourse(Courses courses) {
		System.out.println("Kurs silindi : " + courses.courseName);
	}
	public void updateToCourse(Courses courses) {
		System.out.println("Kurs güncellendi : " + courses.courseName);
	}

}
