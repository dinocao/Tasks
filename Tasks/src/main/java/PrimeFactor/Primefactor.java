package PrimeFactor;

import java.util.ArrayList;

public class Primefactor {

	private static ArrayList primes;
	public static ArrayList factorizeByOrder(int primeNum) {
		primes = new ArrayList();
		for(int loopNum = 2; loopNum < primeNum; loopNum++)
		{
			
			while(primeNum % loopNum == 0 && primeNum > loopNum)
			{
				primes.add(loopNum);
				primeNum /= loopNum;
			}
		
		}
		primes.add(primeNum);
		return primes;
	}
	
	public static ArrayList factorizeByCategory(int primeNum)
	{
		primes = new ArrayList();
		for(int loopNum = 2; loopNum < primeNum; loopNum++)
		{
			while(primeNum % loopNum == 0 && primeNum > loopNum)
			{
				primes.add(loopNum);
				primeNum /= loopNum;
			}
		}

		primes.add(primeNum);
		return primes;
	}
	
	

}
