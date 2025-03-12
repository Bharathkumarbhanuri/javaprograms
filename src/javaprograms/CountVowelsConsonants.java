package javaprograms;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		System.out.print("enter a string:");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		sc.close();
		string = string.toLowerCase();
		int count=0,consonants=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)== 'a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u') {
				count++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Total vowels: " + count);
		System.out.println("Total vowels: " + count);
		System.out.println("Total vowels: " + consonants);
	}	
}

