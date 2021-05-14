
public class User {
	
	private int id;
	private String nameSurname;
	private String email;
	private String password;
	private String courseId;
	private String courseName;
	
	public User(int id, String nameSurname, String email, String password,String courseId, String courseName) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.email = email;
		this.password = password;
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

}
