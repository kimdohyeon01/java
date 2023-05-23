package chap10;

public class SupersonicAirplane extends Airplane
{
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NOMAL;
	
	@Override
	public void fly()
	{
		if(flymode == SUPERSONIC)
		{
			System.out.println("supersonic flight");
		}
		else 
		{
			super.fly(); //Airplane 객채의 fly()메소드 호출
		}
	}
		
}
