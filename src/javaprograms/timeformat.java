package javaprograms;

import java.util.Scanner;

public class timeformat {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter time in min and sec:");
		int t_min=sc.nextInt();
		int t_sec=sc.nextInt();
		sc.close();
		solution(t_min,t_sec);
	}
	public static void solution(int m,int s) {
		int r=(m*60)+s;
		System.out.printf("%dh %dm %ds",r/3600,(r%3600)/60,r%60);
	}
}
