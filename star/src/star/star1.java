package star;
import java.util.Scanner;

public class star1 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int num = stdin.nextInt();
		
	
		for (int i=1; i <=num; i++)
		{
			System.out.print("");
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
