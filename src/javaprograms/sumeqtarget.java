package javaprograms;

import java.util.Scanner;

//WAP that accepts 2 integers and a target. Validate if the sum of two numbers is equal to given target.
public class sumeqtarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num1,num2 and target:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int target=sc.nextInt();
		sc.close();
		System.out.println(checker(num1,num2,target));
	}
	static boolean checker(int num1, int num2, int target) {
		if(target==num1+num2) {
			return true;
		}
		return false;
	}
}