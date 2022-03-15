package Pune_Act;
import java.util.Scanner;
public class Circle_Rectangle {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc =new Scanner(System.in);
		
		System.out.println("enter the width:-");
		int width=sc.nextInt();
		
		System.out.println("enter the height:-");
		int height=sc.nextInt();
		
		
		
		System.out.println("enter the radius:-");
		int radius1=sc.nextInt();
		double PI=  3.21;
		
		 double Area = width * height;
		 double Perimeter = 2 * ( width + height);
		 System.out.println("area of rectangular:-"+Area);
		 System.out.println("perimeter of rectangular:-"+Perimeter );
		
		 double Area1 = PI * (radius1 * radius1) ;
		 double Perimeter1 = 2* PI* radius1;
		 System.out.println("area of circle:-"+Area1);
		 System.out.println("perimeter of circle:-"+Perimeter1 );
		 System.out.println("all answers in MM");

		
		
		
		
		

	}

}
