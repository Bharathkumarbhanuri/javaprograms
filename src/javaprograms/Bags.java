package javaprograms;

import java.util.Scanner;

public class Bags {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter count of big bags: ");
		int big=sc.nextInt();
		System.out.println("enter count of small bags: ");
		int small=sc.nextInt();
		System.out.println("enter kilos of material: ");
		int kilos = sc.nextInt();
		sc.close();
		solution(big,small,kilos);
	}
	public static void solution(int big,int small,int targetkilos) {
		int bigused = targetkilos/5;
		if(bigused>big) {
			bigused=big;
		}
		int remainingkilos = targetkilos - (bigused*5);
		int smallused = remainingkilos;
		if(smallused>small) {
			smallused = small;
		}
		if(bigused>0) {
			System.out.println("Big bags "+bigused+" can be packed");
		}
		if(smallused>0) {
			System.out.println("Small bags "+smallused+" can be packed");
		}
		if(big>bigused) {
			System.out.println("Big bags "+ (big-bigused) +" cannot be packed");
		}
		if(small>smallused) {
			System.out.println("Small bags "+ (small-smallused) +" cannot be packed");
		}
	}
}
