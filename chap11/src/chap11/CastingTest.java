package chap11;
class Parent
{
	public void method1()
	{
		System.out.printf("Patent-method");
	}
	public void method2()
	{
		System.out.printf("Patent-method2");
	}
	
}
class Child extends Parent
{
	@Override
	public void method2()
	{
		System.out.printf("Chi-method");
	}
	public void method3()
	{
		System.out.printf("Child-method");
	}
}

	public class CastingTest 
	{
		public static void main(String[] args)
		{
			Child child = new Child(); //자동 타입 변환
			
			Parent parent=child;
			parent.method1();
			parent.method2(); //재정의된 메소드 호출
			//parent.method3(); //호출 불가능
		}
	}
	

	
	

