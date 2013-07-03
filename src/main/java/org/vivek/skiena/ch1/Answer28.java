package org.vivek.skiena.ch1;

import com.google.caliper.Benchmark;
import com.google.caliper.runner.CaliperMain;

import java.util.Scanner;

public class Answer28 extends Benchmark{

	private static long dividend = 1;
	private static long divisor = 1;


	public static long divideOne(long dividend, long divisor) {

		long quotient = 0;

		if(dividend <= 0 || divisor <= 0 || dividend < divisor)
			return 0;

		while (dividend >= divisor) {
			dividend -= divisor;
			quotient++;
		}
		System.out.println("(divideOne): Answer: " + quotient);
		return quotient;
	}
	//http://www.dragonwins.com/domains/getteched/de248/binary_division.htm
	public static long divideTwo(long dividend, long divisor) {

		long quotient = 0;

		if(dividend <= 0 || divisor <= 0 || dividend < divisor)
			return 0;

		// term * divisor should be close to dividend
		long term = 1;
		//System.out.println(dividend + " " + divisor + " " + term + " " + quotient);

		while((term < Math.pow(2,64 - 1)) && (divisor < dividend))
		{
			divisor =  divisor << 1;
			term = term << 1;
			//System.out.println(dividend + " " + divisor + " " + term + " " + quotient);
		}

		while(term >= 1)
		{
			if(divisor <= dividend)
			{
				//System.out.println(dividend + " " + divisor + " " + term + " " + quotient);
				quotient += term;
				dividend = dividend - divisor;
			}
			//System.out.println(dividend + " " + divisor + " " + term + " " + quotient);
			divisor = divisor >> 1;
			term = term >> 1;
		}

		System.out.println("(divideTwo): Answer: " + quotient);
		return quotient;
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

	public static void getCaliperBenchMarking(){

		//System.out.println("Enter dividend:");
		dividend = 23344555;//scanner.nextLong();
		//System.out.println("Enter divisor:");
		divisor = 17;//scanner.nextLong();

		CaliperMain.main(Answer28.class, new String[]{"-i","micro"});

	}
}
