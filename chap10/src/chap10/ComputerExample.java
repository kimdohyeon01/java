package chap10;

public class ComputerExample {

	public static void main(String[] args) 
	{
		int r=10;
		Calculator calculator = new Calculator();
		//calculator 객채의 원의 넓이
		System.out.println("calculator circle area: "+calculator.areaCircle(r));
		
		//computer 객채의 원의 넓이
		Conputer computer = new Conputer();
		System.out.println("computer circle area: "+computer.areaCircle(r));
		
	}

}
