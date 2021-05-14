
public class Student extends User{
	
	private String school;
	private String department;
	
	public Student(int id, String nameSurname, String email, String password, 
			String courseId, String courseName, String school, String department) {
		super(id, nameSurname, email, password, courseId, courseName);
		this.school = school;
		this.department = department;

	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
