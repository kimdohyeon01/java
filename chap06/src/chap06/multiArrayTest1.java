package chap06;
import java.util.Random;
public class multiArrayTest1 {

	private static String value;

	public static void main(String[] args) 
	{
		Random ran = new Random(); //난수발생
		int [][] score = new int[4][4]; //2차원 배열 생성
		for (int i=0; i<4; i++) //행
		{
			for(int j=0; j<4; j++) //열
				score[i][j] = ran.nextInt(10); //0~9까지의 난수 발생
		}
		
		for (int k=0; k<4; k++)
		{
			int sum=0;
			for (int value : score[k])
			{
				System.out.print(value+" ");
				sum = sum + value;
			}
			System.out.println("total number "+sum);
		}
		
	}

}
