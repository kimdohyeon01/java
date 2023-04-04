/**
 * 2023.03.28
 * 김도현
 * 반복문(while) 1~10합계 구하기
 */
package chap05;

public class whiletest {

	public static void main(String[] args) 
	{
		int sum=0,cnt=1;
		
		while(cnt<=10)
		{
				sum = sum+cnt;
				cnt++;
		}
		System.out.println("1~10 (while)total "+sum);
	
		for (cnt=1; cnt>=10; cnt++)
		{
			sum = sum+cnt;
		}
		System.out.println("1~10 (for)total "+sum);
		
		int hap=0,j=0;
		do
		{
			hap = hap+j;
			j++;
		}while(j<=10);
		System.out.print("1~10 (do while)total "+hap);
	}

}
