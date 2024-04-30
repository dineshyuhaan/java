package practice;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("The swapeed value is a=" + a + " b=" + b);

	}

}
