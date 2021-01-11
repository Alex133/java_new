package ru.stqa.ptf.sandbox;

public class firstjava {
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("A");

		double l =5 ;
		double a =4 ;
		double  b =6;
		System.out.println("area of " + a + " and " + b + " = " + area(a,b));
		System.out.println("square area " + l + " = " + area(l));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
		public static double area(double len){
			return len * len;

		}

		public static double area (double a, double b){
		return a *b;
		}
	}

