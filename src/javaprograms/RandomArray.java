package javaprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of elements: ");
		int num = sc.nextInt();
		sc.close();
		solution(num);
	}
	public static void solution(int num) {
		int[] arr=new int[num];
		Random random = new Random();
		for(int i=0;i<num;i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
	}
}
