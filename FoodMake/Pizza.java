package FoodMake;

import java.util.Scanner;

public class Pizza extends Food
{
	@Override
	public int selectIngredients()
	{
		int Point = 2000;
		
		Scanner pizza = new Scanner(System.in);
	    int correctIngredients = 0;
	    int incorrectIngredients = 0;
	    
	    while(true)
	    {
	    	System.out.println("도우 선택");
		    System.out.println
		    ("(1)밀가루 도우 (2)또띠아 (3)식빵 (4)라이스페이퍼 (5)라면 (6)김치 (7)부추 (8)계란지단");
		    System.out.print("입력: ");
		    int PizzaDough= pizza.nextInt();
		    
		    if (PizzaDough == 1)
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (PizzaDough == 2 || PizzaDough == 3 || PizzaDough == 4 || PizzaDough == 5 || PizzaDough == 6 ||
		    		PizzaDough == 7 || PizzaDough == 8)
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();		    	
	    }
	    	    
//------------------------------------------------------------------------------------------------	
	    while(true)
	    {
	    	System.out.println("소스 선택");
		    System.out.println
		    ("(1)바베큐 소스 (2)딸기쨈 (3)토마토 소스 (4)올리브 오일 (5)짜장 소스 (6)비빔면 소스 (7)화이트소스");
		    System.out.print("입력: ");
		    int Pizzsoseu = pizza.nextInt();
		    
		    if (Pizzsoseu  == 3 || Pizzsoseu  == 7)  
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (Pizzsoseu  == 1 || Pizzsoseu  == 2 || Pizzsoseu  == 4 || Pizzsoseu  == 5 || Pizzsoseu  == 6)
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();    	
	    }
	    
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("토핑 선택");
	 	    System.out.println
	 	    ("(1)페퍼로니 (2)베이컨 (3)감자칩 (4)모짜렐라 치즈 (5)젤리 (6)취두부 (7)두리안 (8)미역 (9)올리브 (10)갈메기");
	 	    System.out.print("입력: ");
	 	    int Topping = pizza.nextInt();
	 	    
	 	    if (Topping == 1 || Topping  == 2 || Topping == 4 ||  Topping == 9)
	 	    {
	 	    	Point += 200; break;
	 	    }	 	    	
	 	    else if(Topping == 3 || Topping  == 5 || Topping == 6 ||  Topping == 7 || Topping == 8 || Topping  == 10)
	 	    {
	 	    	Point -= 100; break;
	 	    }
	 	    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println(); 	 	    	
	    }	   
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("치즈엣지 선택");
		    System.out.println
		    ("(1)고구마 무스 (2)순대 (3)오이 (4)건포도 (5)체다치즈 (6)쌈장 (7)고추장");
		    System.out.print("입력: ");
		    int PizzaEdge = pizza.nextInt();
		    
		    if (PizzaEdge == 1 || PizzaEdge == 5)  
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (PizzaEdge == 2 || PizzaEdge == 3 || PizzaEdge == 4 || PizzaEdge == 6 || PizzaEdge == 7)
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println(); 	    	
	    }
	    
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("오븐온도 선택");
		    System.out.println
		    ("(1)170도 (2)190도 (3)180도 (4)200도 (6)160도 (7)150도");
		    System.out.print("입력: ");
		    int Oven_Temperature = pizza.nextInt();
		    
		    if (Oven_Temperature == 3)
		    {
		    	Point += 200; break;
		    }    	
		    else if (Oven_Temperature == 1 || Oven_Temperature == 2 || Oven_Temperature == 4 ||
		    		Oven_Temperature == 5 || Oven_Temperature == 6 || Oven_Temperature == 7)
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println(); 	
	    }
	    
	    return Point;
	}
}