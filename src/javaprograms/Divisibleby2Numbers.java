package javaprograms;

import java.util.Scanner;

public class Divisibleby2Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 2 Numbers: ");
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		solution(num1,num2);
	}
	public static void solution(int num1,int num2) {
		int count=0,i=1,sum=0;
		while(i<=1000) {
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				count++;
				sum=sum+i;
				if(count==5) {
					break;
				}
			}
			i++;
		}
		System.out.println("sum is "+ (num1+num2+sum));
	}

}
