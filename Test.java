package project;

import java.util.*;

public class Test {
	
	static int count=0;
	
	void m1() {
		
	
	Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NAME: ");
    String a1 = sc.next();
    System.out.println("******ALL THE BEST******");

	}
	void m2(){
		 System.out.println("1.HOW MANY HANDS DO YOU HAVE ? ");
		 System.out.println("OPTION A  : TWO");
		 System.out.println("OPTION B  : THREE");
		 System.out.println("OPTION C  : TEN");
		 System.out.println("OPTION D  : FOUR");
		 
		
		 Scanner sc = new Scanner(System.in);
		  System.out.println("PLEASE CHOOSE YOUR OPTION: " );
		 String a1 = sc.next();
	
		 
		 if(a1.equals("B"))	 
		 {
			 System.out.println("***YOUR ANSWER IS CORRECT*** ");
			 count++;
		 }
		 else
		 {
			 System.out.println("***YOUR ANSWER IS INCORRECT*** ");
		 }
		
		
		
	}
	void m3(){
		
		 
		 
		 System.out.println("2.WHAT IS THE COLOR OF BANANA ? ");
		 System.out.println("OPTION A  : GREEN/YELLOW");
		 System.out.println("OPTION B  : RED");
		 System.out.println("OPTION C  : BLUE");
		 System.out.println("OPTION D  : ORANGE");
		 
		
		 Scanner sc = new Scanner(System.in);
		  System.out.println("PLEASE CHOOSE YOUR OPTION: " );
		 String a1 = sc.next();
	
		 
		 if(a1.equals("A"))	 
		 {
			 System.out.println("***YOUR ANSWER IS CORRECT*** ");
			 count++;
		 }
		 else
		 {
			 System.out.println("***YOUR ANSWER IS INCORRECT*** ");
		 }
		
	}	
	
	void m4(){
		
		 
		 
		 System.out.println("3.WHAT IS THE COLOR OF APPLE ? ");
		 System.out.println("OPTION A  : GREEN/YELLOW");
		 System.out.println("OPTION B  : RED");
		 System.out.println("OPTION C  : BLUE");
		 System.out.println("OPTION D  : ORANGE");
		 
		
		 Scanner sc = new Scanner(System.in);
		  System.out.println("PLEASE CHOOSE YOUR OPTION: " );
		 String a1 = sc.next();
	
		 
		 if(a1.equals("B"))	 
		 {
			 System.out.println("***YOUR ANSWER IS CORRECT*** ");
			 count++;
		 }
		 else
		 {
			 System.out.println("***YOUR ANSWER IS INCORRECT*** ");
		 }
		 
		 System.out.println("YOUR TOTAL SCORE IS : "+count);
	}
	
}
