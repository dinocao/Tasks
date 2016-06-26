package CalcStats;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CalcStatsTest  {

	@Test
	public void test() {
		assertEquals(Arrays.asList(1), CalcStats.take(new int[]{1}));
	}

}
