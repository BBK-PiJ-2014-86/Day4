package day4;

import java.util.Scanner;

public class BinaryAndDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		binary2decimal(input);

	
	}

	static int binary2decimal (String string) {
		int number=0;
		int length;
		
		length = string.length();
		int pow = length - 1;
		
		for (int i = 0; i<length; i++) {
			
			int m = Character.getNumericValue(string.charAt(i));
			
			number = (int) (number+ (m* Math.pow(2,pow)));
			pow--;
			
		}
		
		System.out.println(number);
		return number;
	}
}