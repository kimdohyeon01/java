package star;
import java.util.Scanner;
public class star2 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int num = stdin.nextInt();
		
	
		for (int i=0; i <num; i++)
		{
			for (int j=0; j<num-i; j++)
			{
				System.out.print("*");
			}
			System.out.print("");
			System.out.println();
		}

	}

}
