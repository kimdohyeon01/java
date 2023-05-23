package chap10;

public class StudentExample {

	public static void main(String[] args) 
	{
		Student student  = new Student ("KimDoHyeon","010-2545-3257",1);
		
		System.out.println("name: "+student.name);
		System.out.println("ssn: "+student.ssn);
		System.out.println("student: "+student.studentNo);

	}

}
