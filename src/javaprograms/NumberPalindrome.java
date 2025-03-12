package javaprograms;
import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		System.out.println(solution(number));
	}
	public static boolean solution(int number) {
		if(number<0) {
			System.out.println("enter a  positive number: ");
		}
		if(number==intRev.solution(number)) {
			return true;
		}
		return false;
	}
}

