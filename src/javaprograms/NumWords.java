package javaprograms;

import java.util.Scanner;

public class NumWords {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1-999):");
        int number = sc.nextInt();
        sc.close();

        System.out.println(convertToWords(number));
    }

    public static String convertToWords(int number) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                          "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                          "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number < 20) {
            return units[number]; // Directly return for numbers < 20
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + units[number % 10] : "");
        } else {
            return units[number / 100] + " Hundred" + 
                   (number % 100 != 0 ? " and " + convertToWords(number % 100) : "");
        }
    }

}
