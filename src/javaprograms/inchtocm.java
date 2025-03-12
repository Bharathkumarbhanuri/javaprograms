package javaprograms;

import java.util.Scanner;

public class inchtocm {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter height in inch:");
		double ininch=sc.nextDouble();
		sc.close();
		System.out.println(convert(ininch)+"CM");
	}
	static double convert(double ininch) {
		return ininch*2.4;
	}

}
