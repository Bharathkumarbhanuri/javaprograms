package javaprograms;

import java.util.Scanner;

public class stringpalindrome {
	public static void main(String[] args) {
		System.out.print("enter a string:");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		sc.close();
		System.out.println(ispalindrome(string));
	}
	static boolean ispalindrome(String str) {
		int left = 0, right = str.length()- 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
	}
}
