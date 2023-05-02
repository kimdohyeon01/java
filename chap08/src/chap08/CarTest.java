package chap08;

public class CarTest {

	public static void main(String[] args) 
	{
		car myCar=new car();
		
		System.out.println("제작회사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("현재속도:" + myCar.speed);
		
		myCar.speed=60;
		System.out.println("수정된속도:"+myCar.speed);
		

	}

}
