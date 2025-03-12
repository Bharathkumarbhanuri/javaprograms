package javaprograms;
import java.util.Scanner;
public class daysinMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month and year");
		int month= sc.nextInt();
		int year=sc.nextInt();
		sc.close();
		System.out.println(solution(month,year));
	}
		public static int solution(int month,int year) {
			int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
			boolean leap=leapyear.solution(year);
			if(leap){
				days[1]=29;
			}
			return days[month-1];
		}
}
