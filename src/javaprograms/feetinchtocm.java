package javaprograms;

import java.util.Scanner;

public class feetinchtocm {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter height in feet:");
		double feet=sc.nextDouble();
		System.out.print("enter height in inch:");
		double inch=sc.nextDouble();
		sc.close();
		System.out.println(convert(feet,inch)+"CM");
	}
	static double convert(double feet,double inch) {
		return ((feet*12*2.4)+(inch*2.4));
	}
}

