package chap8_1;

public class Ractangle_Test {

	public static void main(String[] args) 
	{
		Rectangle myCalcu=new Rectangle();
		
		double result1 = myCalcu.areaRectangle(10); //정사각형 넓이
		
		double result2 = myCalcu.areaRectangle(10, 20); //직사각형 넓이
		
		System.out.println("area of the regular squre="+result1);
		System.out.println("area of the angled squre="+result2);

	}

}
