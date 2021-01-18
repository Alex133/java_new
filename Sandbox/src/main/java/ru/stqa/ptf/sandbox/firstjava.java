package ru.stqa.ptf.sandbox;

public class firstjava {
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("A");

		Square s = new Square (5);
		///s.l = 5;
		System.out.println("Ploshad kvadrata so storonoi " + s.l +" = " + s.area ());

		Rectangle  r = new Rectangle (4, 6);

		System.out.println("Ploshad rectangle so storonoi " + r.a +" = " + r.area ());


		//double l =5 ;
		//double a =4 ;
		//double  b =6;
		//System.out.println("area of " + a + " and " + b + " = " + area (a,b));
		//System.out.println("square area " + l + " = " + area(l));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}



	}

