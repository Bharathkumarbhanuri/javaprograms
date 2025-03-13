package javaprograms;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num= sc.nextInt();
		sc.close();
		solution(num);
		countTotalPrimes();
		
	}
	public static void solution(int num) {
		if(num>=1 && num<=100000) {
			System.out.println("number is "+ num); 
		}
		else {
			System.out.println("number is invalid, re run the program and enter a valid number :) ");
			return;
		}
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" is prime");
			System.out.println("number of factors of "+num+" is "+count);
		}
		else {
			System.out.println(num+" is not prime");
			System.out.println("number of factors of "+num+" is "+count);
		}
	}
	
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void countTotalPrimes() {
        int primeCount = 0;
        for (int i = 1; i <= 100000; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        System.out.println("total primes in range are "+ primeCount);
	}
}
