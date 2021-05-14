
public class Instructor extends User{
	
	String givenCourses;
	
	public Instructor(int id,String nameSurname, String email, String givenCourses) {
		super(id, givenCourses, nameSurname, email, givenCourses, givenCourses);
		this.givenCourses = givenCourses;
		
		
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	

}
