/**
 * 객체 참조 배열
 * ;참조타입(클래스,인터페이스)배열은 각 항목에 객체의 번지를 가짐
 * String은 클래스이므로
 * String[]배열은 각 항목에 문자열이 아닌, String 객체의 번지를 가짐
 * String[]배열간 문자 비교는 ==연산자 대신 equlas()메소드 사용
 */
package chap06;

public class ArraysReference {

	public static void main(String[] args) 
	{
		String[] strArray = new String[3]; //배열 생성
		strArray[0] = " java";
		strArray[1] = " java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0]==strArray[1]);
		//0번과 1번은 가르키고 있는 주소가 같기때문에 true가 출력
		System.out.println(strArray[0]==strArray[2]);
		//0번과 2번은 가르키고 있는 주소가 다르기때문에 false가 출력
		System.out.println(strArray[0].equals(strArray[2])); 
		//0번주소와 3번 주소의 문자열 자체가 같으니깐 true가 출력
		

	}

}
