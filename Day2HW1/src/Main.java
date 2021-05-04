
public class Main {
	
	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Programlama Kurslarý");

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.selectCategory(category1);
		
		Courses course1 = new Courses(1,"C# + ANGULAR Kampý", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.", "Engin DEMÝROÐ",0);
		Courses course2 = new Courses(2,"JAVA + REACT Kampý", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.", "Engin DEMÝROÐ",0);
		Courses course3 = new Courses(3,"Programlamaya Giriþ için Temel Kurs", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.", "Engin DEMÝROÐ",0);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.updateToCourse(course1);
	
		Courses course[] = {course1,course2,course3};
		
		for(int i = 0;i<4;i++) {
			
			System.out.println(course[i].id + "- Kursun adý : "+course[i].courseName);
			System.out.println(course[i].courseDetails + " Eðitmen : "+course[i].instructor);
			
			
		}
		
	
	
	
	}



}
