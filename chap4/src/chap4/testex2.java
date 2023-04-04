package chap4;
import java.util.Scanner;
public class testex2 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number");
		int num = stdin.nextInt();
		
		if (num == 0)
		{
			System.out.print("0");
		}
		else if (num%2 == 1)
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("2");
		}

	}

}
