package javaprograms;

import java.util.Scanner;

public class intRev {
	public static void main(String[] args) {
		System.out.println("enter a inter: ");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		System.out.println("reversed integer is: "+ "" + solution(number));
	}
	public static int solution(int number) {
		int reverse=0;
		while(number!=0) {
			int digit=number%10;
			reverse=(reverse*10)+digit;
			number=number/10;
		}
		return reverse;
	}
}
