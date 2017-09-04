package calendar;

import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		System.out.println("월화수목금토");
		int a,b;
		Scanner scannera=new Scanner(System.in);
		a=scannera.nextInt();
		b=scannera.nextInt();
		System.out.println(a+b);
		scannera.close();
	}

}
