package javaprograms;

import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num= sc.nextInt();
		sc.close();
		solution(num);
	}
	public static void solution(int num) {
		int digit=0;
		while(num>9) {
			int sum=0;
			while(num>0) {
				digit=num%10;
				sum=sum+digit;
				num=num/10;
			}
			num=sum;
		}
		if(num==1) {
			System.out.println("magic number ===> reduced to "+num);
		}
		else {
			System.out.println("not magic number ===> reduced to "+num);
		}
	}
}
