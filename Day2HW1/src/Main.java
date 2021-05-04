
public class Main {
	
	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Programlama Kurslar�");

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.selectCategory(category1);
		
		Courses course1 = new Courses(1,"C# + ANGULAR Kamp�", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.", "Engin DEM�RO�",0);
		Courses course2 = new Courses(2,"JAVA + REACT Kamp�", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.", "Engin DEM�RO�",0);
		Courses course3 = new Courses(3,"Programlamaya Giri� i�in Temel Kurs", "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.", "Engin DEM�RO�",0);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.updateToCourse(course1);
	
		Courses course[] = {course1,course2,course3};
		
		for(int i = 0;i<4;i++) {
			
			System.out.println(course[i].id + "- Kursun ad� : "+course[i].courseName);
			System.out.println(course[i].courseDetails + " E�itmen : "+course[i].instructor);
			
			
		}
		
	
	
	
	}



}
