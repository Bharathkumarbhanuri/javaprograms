package javaprograms;

import java.util.Scanner;

public class arithmeticexcept {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter 2 numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		divide(num1,num2);
	}

public static void divide(int num1,int num2) {
	try {
		int answer= num1/num2;
		System.out.println(answer);
	}
	catch (ArithmeticException e){
		System.out.println("dividing with zero is not allowed!");
	}
}
}

