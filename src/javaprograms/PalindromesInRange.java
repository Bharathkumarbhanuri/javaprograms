package javaprograms;

import java.util.Scanner;

public class PalindromesInRange {
	public static void main(String[] args) {
		System.out.println("enter range: ");
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		sc.close();
		solution(start,end);
	}
	
	public static void solution(int start,int end) {
		if(!(start>0 && end<1000)) {
			System.out.println("enter range between 1 and 1000 only");
		}
		for(int i=start;i<end;i++) {
			if(i==intRev.solution(i)) {
				System.out.println(i);
			}
		}
	}

}
