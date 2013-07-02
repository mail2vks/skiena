package org.vivek.skiena.ch1;

import com.google.caliper.Benchmark;
import com.google.caliper.runner.CaliperMain;

import java.util.Scanner;

public class Answer28 extends Benchmark{

	private static long dividend = 1;
	private static long divisor = 1;


	public static int divideOne(long dividend, long divisor) {

		int quotient = 0;

		while (dividend > divisor) {
			dividend -= divisor;
			quotient++;
		}
		System.out.println("(divideOne): Answer: " + quotient);
		return quotient;
	}

	public static int divideTwo(long dividend, long divisor) {

		int quotient = 0;

		while (dividend > divisor * 2) {
			dividend -= 2 * divisor;
			quotient += 2;
		}

		dividend -= divisor;
		quotient++;

		System.out.println("(divideTwo): Answer: " + quotient);
		return quotient;
	}

	public static void divideThree(long dividend, long divisor)
	{


		System.out.println("(divideThree): Answer: " );
	}

	public void timeDivideOne(int repeats)
	{
		for(int i = 0; i < repeats; i++)
		{
			divideOne(dividend,divisor);
		}
	}

	public void timeDivideTwo(int reps)
	{
		for(int i = 0; i < reps; i++)
		{
			divideTwo(dividend, divisor);
		}
	}

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dividend:");
		dividend = 23344555;//scanner.nextLong();
		System.out.println("Enter divisor:");
		divisor = 17;//scanner.nextLong();

		//CaliperMain.main(Answer28.class, new String[]{"-i","micro"});
	  	divideThree(dividend,divisor);

	}
}
