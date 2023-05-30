package Test2;
import java.util.Scanner;

abstract class calculate
{
	public abstract int add(int a, int b); //덧셈
	public abstract int sub(int a, int b); //뺄셈
	public abstract int mul(int a, int b); //곱셈
	public abstract int div(int a, int b); //나눗셈
	public abstract double average(int[]a); //배열에 저장된 평균
}

class Goodcalc extends calculate
{
	@Override
	public int add(int a, int b)
	{
		return a+b;
	}
	@Override
	public int sub(int a, int b)
	{
		return a-b;
	}
	@Override
	public int mul(int a, int b)
	{
		return a*b;
	}
	@Override
	public int div(int a, int b)
	{
		return a/b;
	}
	@Override
	public double average(int[]a)
	{
		double sum=0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
}


public class Test {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("input first number : ");
		int num1 = stdin.nextInt();
		
		Scanner stdin2 = new Scanner(System.in);
		System.out.println("input second number : ");
		int num2 = stdin.nextInt();
			
		calculate add = new Goodcalc();
		calculate sub = new Goodcalc();
		calculate mul = new Goodcalc();
		calculate div = new Goodcalc();
		calculate average = new Goodcalc();
		
		System.out.println("add : "+add.add(num1,num2));
		System.out.println("sub : "+sub.sub(num1,num2));
		System.out.println("mul : "+mul.mul(num1,num2));
		System.out.println("div : "+div.div(num1,num2));
//		System.out.println("average : "+average(num1,num2));

		


	}

}
