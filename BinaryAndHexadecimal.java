/*
 5 Binary and hexadecimal (*)
Binary numbers can be quite long. A 32-bit memory address looks like 1001 0101 0110 1010 1011 0010 1001
1010, which is difficult to handle. That is why memory addresses and other binary numbers are usually written as
hexadecimal numbers. An hexadecimal number is a base-16 number, with digits between 0 and f (f is equivalent to
decimal 15, e is equivalent to decimal 14, and so on). An hexadecimal number is equivalent to a four-digit binary
number, which makes them quite compact. The former address reads 956ab29a, which is easier to read and write.
To prevent confusion with decimal numbers, hexadecimal numbers are usually prefixed by “0x”, as in 0x95 (which
is 149) or 0xff (which is 255).
Write a program that takes a String. The string can be a decimal or a hexadecimal number (starting by “0x”).
Your program must recognise the number as what it is and convert it to the other base. Use two methods for
conversion as in the former exercise
 */

package day4;

import java.util.Scanner;

public class BinaryAndHexadecimal {

	
public static void main (String [] args0) {

	Scanner sc = new Scanner(System.in);
	String userInputStr = sc.next();
	double userInputDouble = Double.parseDouble(userInputStr);
	
	
	if (userInputStr.substring(0, 1).equals("0x")) {
		hexToDecimal(userInputStr);
	} else {
		decimalToHex(userInputDouble);
	}
	
	
}
	
static double hexToDecimal (String hex) {
	
	
	
	return 0.0;
}


static String decimalToHex (double decimal) {
	
	
	return null;
}
	
}
