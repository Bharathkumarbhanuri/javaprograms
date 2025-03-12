package javaprograms;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year between 1 and 9999");
		int number= sc.nextInt();
		sc.close();
		System.out.println(solution(number));
	}
	public static Boolean solution(int number) {
		if(number<1 || number>9999) {
			System.out.println("error occured");
			return false;
		}
		return number%4==0  && number!=100 || number%400==0;
	}
}

