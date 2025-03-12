package javaprograms;

import java.util.Scanner;

public class temperature {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("temperature conversion menu");
			System.out.println("enter 1 for celsius to fahrenheit");
			System.out.println("enter 2 for fahrenheit to celsius");
			int choice=sc.nextInt();
			double temp;
			switch(choice){
			case 1:
				System.out.println("enter temp in celsius");
				temp=sc.nextDouble();
				System.out.println("temp in fahrenheit is "+""+CtoF(temp)); 
				break;
			case 2:
				System.out.println("enter 2 for fahrenheit to celsius");
				temp=sc.nextDouble();
				System.out.println("temp in celsius is "+""+FtoC(temp));
				break;
				default:
					System.out.println("invalid choice");
			}
			sc.close();
		}
		public static double CtoF(double temp) {
			return (temp * 9 / 5) + 32;
		}
		public static double FtoC(double temp) {
			return (temp - 32) * 5 / 9;		
		}
}