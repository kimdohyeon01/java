/**
 * final 필드 선언 초기화
 */
package chap09_1;

public class Person 
{
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name)
	{
		this.ssn=ssn;
		this.name=name;
	}
}
