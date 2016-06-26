package CalcStats;

import java.text.DecimalFormat;
import java.util.*;
public class CalcStats {


	public static ArrayList take(int[] numberArray) {
		ArrayList min_max_sequence_average = new ArrayList();
		Arrays.sort(numberArray);
		int summember = 0;
		int minimum = numberArray[0];
		int maximum = numberArray[numberArray.length - 1];
		int sequence = numberArray.length;
		for(int loopNum = 0; loopNum < sequence; loopNum++)
		{
			summember += numberArray[loopNum];
		}
		DecimalFormat df = new DecimalFormat(".###");
		min_max_sequence_average = new ArrayList();
		min_max_sequence_average.add(minimum);
		min_max_sequence_average.add(maximum);
		min_max_sequence_average.add(sequence);
		double average = (double)summember / sequence;
		min_max_sequence_average.add(df.format((double)average));
		return min_max_sequence_average;
	}

}
