package javaprograms;

import java.util.Scanner;

public class currentbill {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter usc number:");
		int usc=sc.nextInt();
		System.out.println("enter units:");
		double units=sc.nextDouble();
		sc.close();
		System.out.println("usc:"+ "" + usc);
		System.out.println("units:"+""+ units);
		System.out.println("Bill Amount is" + " " + solution(usc,units));
	}
	public static double solution(int usc,double units) {
		double amount=0;
		if(units<=100) {
			amount=units*3;
			return amount;
		}
		return (100*3)+(units-100)*4;
	}
}
