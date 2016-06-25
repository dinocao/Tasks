package PrimeFactor;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PrimefactorTest extends Primefactor {
	
	@Test
	public void test_all()
	{
		test_order();
		test_category();
	}

	@Test
	public void test_order() {
		/*
		 * For example
		 * 2 -> [2]
		 * 3 -> [3]
		 * 4 -> [2, 2]
		 * 5 -> [5]
		 * 6 -> [2, 3]
		 * 7 -> [7]
		 * 8 -> [2, 2, 2]
		 * 9 -> [3, 3]
		 * 10 -> [2, 5]
		 * 11 -> [11]
		 * 12 -> [2, 2, 3]
		 * 13 -> [13]
		 * 14 -> [2, 7]
		 * 15 -> [3, 5]
		 * 2*2*3*5*7*11 -> [2, 2, 3, 5, 7, 11]
		 */
		assertEquals(Arrays.asList(2), Primefactor.factorizeByOrder(2));
		assertEquals(Arrays.asList(3), Primefactor.factorizeByOrder(3));
		assertEquals(Arrays.asList(2, 2), Primefactor.factorizeByOrder(4));
		assertEquals(Arrays.asList(5), Primefactor.factorizeByOrder(5));
		assertEquals(Arrays.asList(2, 3), Primefactor.factorizeByOrder(6));
		assertEquals(Arrays.asList(7), Primefactor.factorizeByOrder(7));
		assertEquals(Arrays.asList(2, 2, 2), Primefactor.factorizeByOrder(8));
		assertEquals(Arrays.asList(3, 3), Primefactor.factorizeByOrder(9));
		assertEquals(Arrays.asList(2, 2, 3), Primefactor.factorizeByOrder(12));
		assertEquals(Arrays.asList(3, 5), Primefactor.factorizeByOrder(15));
		assertEquals(Arrays.asList(2, 2, 3, 5, 7, 11, 13, 17), Primefactor.factorizeByOrder(2*2*3*5*7*11*13*17));
		
		
	}
	@Test
	public void test_category() {
		/*
		 * For example
		 * 2 -> [2]
		 * 3 -> [3]
		 * 5 -> [5]
		 * 7 -> [7]
		 * 11 -> [11]
		 * 13 -> [13]
		 * 4 -> [2, 2]
		 * 6 -> [2, 3]
		 * 10 -> [2, 5]
		 * 14 -> [2, 7]
		 * 9 -> [3, 3]
		 * 15 -> [3, 5]
		 * 8 -> [2, 2, 2]
		 * 12 -> [2, 2, 3]
		 * 2*2*3*5*7*11 -> [2, 2, 3, 5, 7, 11]
		 */
		assertEquals(Arrays.asList(2), Primefactor.factorizeByCategory(2));
		assertEquals(Arrays.asList(3), Primefactor.factorizeByCategory(3));
		assertEquals(Arrays.asList(5), Primefactor.factorizeByCategory(5));
		assertEquals(Arrays.asList(7), Primefactor.factorizeByCategory(7));
		assertEquals(Arrays.asList(11), Primefactor.factorizeByCategory(11));
		assertEquals(Arrays.asList(13), Primefactor.factorizeByCategory(13));
		assertEquals(Arrays.asList(17), Primefactor.factorizeByCategory(17));
		assertEquals(Arrays.asList(2, 2), Primefactor.factorizeByCategory(4));
		assertEquals(Arrays.asList(2, 3), Primefactor.factorizeByCategory(6));
		assertEquals(Arrays.asList(2, 5), Primefactor.factorizeByCategory(10));
		assertEquals(Arrays.asList(2, 7), Primefactor.factorizeByCategory(14));
		assertEquals(Arrays.asList(3, 3), Primefactor.factorizeByCategory(9));
		assertEquals(Arrays.asList(3, 5), Primefactor.factorizeByCategory(15));
		assertEquals(Arrays.asList(2, 2, 2), Primefactor.factorizeByCategory(8));
		assertEquals(Arrays.asList(2, 2, 3), Primefactor.factorizeByCategory(12));
		assertEquals(Arrays.asList(2, 2, 3, 5, 7, 11, 17), Primefactor.factorizeByCategory(2*2*3*5*7*11*17));
		
		
	}
	
	

}
