package practice;

import java.util.Scanner;

public class HouseRent {

	public static void main(String[] args) {

		float total;
		int m,d;
		float t;
		float r;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the month: ");
		m=sc.nextInt();
		
		System.out.println("Enter the number of days: ");
		d=sc.nextInt();
		
		System.out.println("Enter the rent: ");
		r=sc.nextInt();
		t=d*r;
		r=(float) ((r+(r*0.2))*d);
		
		switch(m)
		{
		case 1: total(t);
		break;
		case 2: total(t);
		break;
		case 3: total(t);
		break;
		case 4: total(t);
		break;
		case 5: total(t);
		break;
		case 6: total(t);
		break;
		case 7: total(t);
		break;
		case 8: total(t);
		break;
		case 9: total(t);
		break;
		case 10: total(t);
		break;
		case 11: total(t);
		break;
		case 12: total(t);
		break;
		default:System.out.println("Invalid input");
		break;
		
		}
		
		
	}

	private static void total(float t) {
		
		System.out.println("House tariff: Rs:" + t);
	}

}

