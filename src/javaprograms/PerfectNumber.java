package javaprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		sc.close();
		if(num>=1 && num<=1000) {
			solution(num);
		}
		else {
			System.out.println("enter num within range 1-1000 ");
		}
	}
	public static void solution(int num) {
		int sum = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
	}
}
