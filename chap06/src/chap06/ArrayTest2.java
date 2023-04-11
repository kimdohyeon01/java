/**
 * 2023.04.11
 * 1차원 정수 배열 생성 후 가장 큰 것 찾기
 */
package chap06;

public class ArrayTest2 {

	public static void main(String[] args) 
	{
		int score[] = {88,97,53,62,92,68,82};
		int max=score[0]; //배열의 첫 번쨰 요소를 max 지정
		for (int i : score) //기존 for문 : for (int i=1; i<score.length; i++)
		{
			if (i>max) //기존의 for 문을 사용할 떄의 if문 : if (score[i] > max)
				max = i;  // max = score[i]
		}
		System.out.println("max number:"+max);
		

	}

}
