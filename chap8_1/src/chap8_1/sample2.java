package chap8_1;

public class sample2 {

	public static void main(String[] args) 
	{
		//매개변수 값 직접 더하기
		System.out.println("매개 변수로 받은 두 수의 합:"+(args[0]+args[1]) ); 
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("sum is "+(num1+num2));
	}

}
