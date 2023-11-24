package FoodMake;

import java.util.Scanner;

public class Chicken extends Food
{
	@Override
	public int selectIngredients()
	{
		int Point = 0;
		
		Scanner chicken = new Scanner(System.in);
	    int correctIngredients = 0;
	    int incorrectIngredients = 0;
	    
	    while(true)
	    {
	    	System.out.println("고기 선택");
		    System.out.println
		    ("(1)칠면조 (2)돼지고기 (3)소고기 (4)닭 (5)양고기 (6)말고기 (7)생선 (8)염소 (9)토끼 (10)오리");
		    System.out.print("입력: ");
		    int Maet = chicken.nextInt();
		    
		    if (Maet == 4)
		    {
		    	Point += 200; break;
		    } 	
		    else if(Maet == 1 || Maet == 2 || Maet == 3 || Maet == 5 || Maet == 6 || Maet == 7 || Maet == 8 ||
		    		Maet == 9 || Maet == 10)
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
	    	System.out.println("향신료 선택");
		    System.out.println
		    ("(1)식초 (2)간장 (3)계피 (4)소금 (5)생강 (6)샤프란 (7)산초가루 (8)후추 (9)커민 (10)바닐라");
		    System.out.print("입력: ");
		    int Spice = chicken.nextInt();
		    
		    if (Spice == 4 || Spice == 8)
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (Spice == 1 || Spice == 2 || Spice == 3 || Spice == 5 || 
		    		Spice == 6 || Spice == 7 ||Spice == 9 || Spice == 10)
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
	    	System.out.println("반죽(가루) 선택");
	 	    System.out.println
	 	    ("(1)계란반죽 (2)수제비가루 (3)고구마전분 (4)베이킹파우더 (5)밀가루반죽 (6)박력분"
	 	    		+ "(7)찹쌀가루 (8)땅콩가루 (9)보리가루 (10)호밀가루");
	 	    System.out.print("입력: ");
	 	    int ChickenDough = chicken.nextInt();
	 	    
	 	    if (ChickenDough == 3 || ChickenDough  == 6)
	 	    {
	 	    	Point += 200; break;
	 	    }
	 	    	
	 	    else if (ChickenDough == 1 || ChickenDough  == 2 || ChickenDough == 4 || ChickenDough  == 5 ||
	 	    		ChickenDough == 7 || ChickenDough  == 8 || ChickenDough == 9 || ChickenDough  == 10)
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
	    	System.out.println("양념 선택");
		    System.out.println
		    ("(1)뿌링클 (2)바베큐소스 (3)돈까스소스 (4)간장 (5)초장 (6)새우젓 (7)요거트");
		    System.out.print("입력: ");
		    int Seasoning = chicken.nextInt();
		    
		    if (Seasoning == 1 || Seasoning == 2)
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (Seasoning == 3 || Seasoning == 4 || Seasoning == 5 || Seasoning == 6 || Seasoning == 7)
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
	    	System.out.println("조리방법 선택");
		    System.out.println
		    ("(1)물에 삶기 (2)찜통에 찌기  (3)팬에 굽기 (4)기름에 튀기기");
		    System.out.print("입력: ");
		    int CookingChoice = chicken.nextInt();
		    
		    if (CookingChoice == 2 || CookingChoice == 4) 
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (CookingChoice == 1 || CookingChoice == 3)
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
