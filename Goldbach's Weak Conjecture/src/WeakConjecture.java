import java.util.ArrayList;
import java.util.List;

public class WeakConjecture {

	List<Integer> primeList = new ArrayList<Integer>();

	public String FindConjecture(int n) {
		if (n%3 == 0 && IsPrime(n/3)) {
			return n + ": " + n/3 + " + " + n/3 + " + " + n/3;
		}
		CreatePrimeList(n);
		int[] subset = FindSubset(n);
		return n + ": " + subset[0] + " + " + subset[1] + " + " + subset[2];
	}
	
	

	private int[] FindSubset(int n) {
		for (int i = 0; i<primeList.size(); i++) {
			int a = primeList.get(i);
			for (int j = i; j<primeList.size(); j++) {
				int b = primeList.get(j);
				if (a+b < n) {
					for (int k = i+1; k<primeList.size(); k++) {
						int c = primeList.get(k);
						if (a+b+c == n) {
							int[] result = {a, b, c};
							return result;
						}
					}
				}
			}
		}
		return null;
	}



	private boolean IsPrime(int n) {
		for (int i = 2; 2 * i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// as the weak conjecture only applies to numbers greater than 5, we can add all
	// primes up to
	// 5 to our list before we begin our loop
	private void CreatePrimeList(int n) {
		primeList.add(1);
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		
		if (n > 7) {		
		//as all prime numbers apart from 2 are odd, the index of this loop should start on an
		//odd number and increase in 2s
			for (int i = 7; i < n; i+=2) {
				if (IsPrime(i)) {
					primeList.add(i);
				}
			}
		}
	}

}
