package javaprograms;


import java.util.Scanner;

public class time {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter time in seconds:");
		int t_sec=sc.nextInt();
		solution(t_sec);
	}
	public static void solution(int t) {
		System.out.println(t/3600+"h "+ (t%3600)/60+"m "+ ((t%3600)%60)+"s");
	}	
}
