package chap09_1;

public class calculator_Test {

	public static void main(String[] args) 
	{
		double result1=10*10*calculator.pi;
		int result2=calculator.plus(10,5);
		int result3=calculator.minus(10,5);
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
	}

}
