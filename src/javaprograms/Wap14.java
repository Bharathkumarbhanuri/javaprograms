package javaprograms;

import java.util.Scanner;

public class Wap14 {
	public static void main(String[] args) {
		System.out.println("enter 2 numbers: ");
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		solution(num1,num2);
	}
	public static void solution(int num1,int num2) {
		if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
			System.out.println("invalid input");
			return;
		}
		int n1d1=num1/10;
		int n1d2=num1%10;
		int n2d1=num2/10;
		int n2d2=num2%10;
		
		if(n1d1==n2d1 || n1d1==n2d2){
			System.out.println("common digit is "+ n1d1);
		}
		else if(n1d2==n2d1 || n1d2==n2d2) {
			System.out.println("common digit is "+ n1d2);
		}
		else {
			System.out.println("No common digits");
		}
		
	}
}
