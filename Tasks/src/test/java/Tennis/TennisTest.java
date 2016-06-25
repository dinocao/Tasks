package Tennis;

import static org.junit.Assert.*;

import org.junit.Test;

import Tennis.Tennis;

public class TennisTest extends Tennis {

	@Test
	public void scoreBord() {
		/*
		 * 0, 0 -> Love All
		 * 1, 1 -> Fifteen All
		 * 2, 2 -> Thirty All
		 * 3, 3 -> Deuce
		 * 4, 4 -> Deuce
		 * 1, 0 -> Fifteen Love
		 * 2, 0 -> Thirty Love
		 * 3, 0 -> Forty Love
		 * 0, 1 -> Love Fifteen
		 * 0, 2 -> Love Thirty
		 * 0, 3 -> Love Forty
		 * 2, 1 -> Thirty Fifteen
		 * 1, 2 -> Fifteen Thirty
		 * 3, 1 -> Forty Fifteen
		 * 1, 3 -> Fifteen Forty
		 * 3, 2 -> Forty Thirty
		 * 2, 3 -> Thirty Forty
		 * 4, 0 -> A Win
		 * 4, 1 -> A Win
		 * 4, 2 -> A Win
		 * 0, 4 -> B Win
		 * 1, 4 -> B Win
		 * 2, 4 -> B Win
		 * 4, 3 -> A Advantage
		 * 3, 4 -> B Advantage
		 * 5, 4 -> A Win
		 * 4, 5 -> B Win
		 */
		assertEquals("Love All", Tennis.scoreBord(new int[]{ 0, 0 }));
		assertEquals("Fifteen All", Tennis.scoreBord(new int[]{ 1, 1 }));
		assertEquals("Thirty All", Tennis.scoreBord(new int[]{ 2, 2 }));
		assertEquals("Deuce", Tennis.scoreBord(new int[]{ 3, 3 }));
		assertEquals("Deuce", Tennis.scoreBord(new int[]{ 4, 4 }));
		assertEquals("Fifteen Love", Tennis.scoreBord(new int[]{ 1, 0 }));
		assertEquals("Thirty Love", Tennis.scoreBord(new int[]{ 2, 0 }));
		assertEquals("Forty Love", Tennis.scoreBord(new int[]{ 3, 0 }));
		assertEquals("Love Fifteen", Tennis.scoreBord(new int[]{ 0, 1 }));
		assertEquals("Love Thirty", Tennis.scoreBord(new int[]{ 0, 2 }));
		assertEquals("Love Forty", Tennis.scoreBord(new int[]{ 0, 3 }));
		assertEquals("Thirty Fifteen", Tennis.scoreBord(new int[]{ 2, 1 }));
		assertEquals("Fifteen Thirty", Tennis.scoreBord(new int[]{ 1, 2 }));
		assertEquals("Forty Fifteen", Tennis.scoreBord(new int[]{ 3, 1 }));
		assertEquals("Fifteen Forty", Tennis.scoreBord(new int[]{ 1, 3 }));
		assertEquals("Forty Thirty", Tennis.scoreBord(new int[]{ 3, 2 }));
		assertEquals("Thirty Forty", Tennis.scoreBord(new int[]{ 2, 3 }));
		assertEquals("A Win", Tennis.scoreBord(new int[]{ 4, 0 }));
		assertEquals("A Win", Tennis.scoreBord(new int[]{ 4, 1 }));
		assertEquals("A Win", Tennis.scoreBord(new int[]{ 4, 2 }));
		assertEquals("B Win", Tennis.scoreBord(new int[]{ 0, 4 }));
		assertEquals("B Win", Tennis.scoreBord(new int[]{ 1, 4 }));
		assertEquals("B Win", Tennis.scoreBord(new int[]{ 2, 4 }));
		assertEquals("A Advantage", Tennis.scoreBord(new int[]{ 4, 3 }));
		assertEquals("B Advantage", Tennis.scoreBord(new int[]{ 3, 4 }));
		assertEquals("A Win", Tennis.scoreBord(new int[]{ 5, 4 }));
		assertEquals("B Win", Tennis.scoreBord(new int[]{ 4, 5 }));
		
		
	}

}
