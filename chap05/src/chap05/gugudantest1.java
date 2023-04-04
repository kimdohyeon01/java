package chap05;
import java.util.Scanner;
public class gugudantest1 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input gugudan");
		
		int num = stdin.nextInt();
		
		System.out.println(num+"DAN");
		for (int i=1; i<=9; i++)
		{
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

}
