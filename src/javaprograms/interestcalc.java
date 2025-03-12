package javaprograms;

import java.util.Scanner;

public class interestcalc {
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("enter p value:");
		int p=ob.nextInt();
		if(p<=0) {
			System.out.println("should be greater than 0");
			ob.close();
			return;
		}
		System.out.println("enter r value:");
		float r=ob.nextFloat();
		System.out.println("enter time in years:");
		int y=ob.nextInt();
		System.out.println("enter time in months:");
		int m=ob.nextInt();
		ob.close();
		int t=y+m/12;
		System.out.println(solution(p,r,t));
	}
	static float solution(int p,float r,int t) {
		if(t<=0 || r<=0 || p<=0) {
			System.out.println("should be greater than 0");
			return -1;
		}
		float interest=(p*r*t)/100;
		return interest;
	}
}
