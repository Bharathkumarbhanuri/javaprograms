package javaprograms;

import java.util.Scanner;

public class numtoWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number= sc.nextInt();
		sc.close();
		converter(number);
	}
	
	public static void converter(int number) {
		if(number==0) {
			return;
		}
		if(number<10) {
			print(number);
		}
		converter(number/10);
		print(number%10);
	}
	public static void print(int number) {
		String[] units = {"zero","one","two","three","four","five","six","seven",
				"eight","nine"};
		System.out.print(units[number]+" ");
	}
}
