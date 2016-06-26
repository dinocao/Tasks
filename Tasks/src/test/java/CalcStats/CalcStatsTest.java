package CalcStats;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Arrays;

import org.junit.Test;

public class CalcStatsTest  {

	private DecimalFormat df = new DecimalFormat(".###");
	@Test
	public void test() {
		assertEquals(Arrays.asList(1, 1, 1, df.format(1.0)), CalcStats.take(new int[]{1}));
		assertEquals(Arrays.asList(1, 3, 2, df.format(2.0)), CalcStats.take(new int[]{1,3}));
		assertEquals(Arrays.asList(1, 5, 5, df.format(2.4)), CalcStats.take(new int[]{1,3,2,1,5}));
		assertEquals(Arrays.asList(-2, 92, 6, df.format(21.833)), CalcStats.take(new int[]{6, 9, 15, -2, 92, 11}));
	}

}
