import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeakConjectureTest {

	WeakConjecture wc = new WeakConjecture();

	@Test
	public void test() {
		int n = 111;
		System.out.println(wc.FindConjecture(n));
		n = 17;
		System.out.println(wc.FindConjecture(n));
		n = 199;
		System.out.println(wc.FindConjecture(n));
		n = 287;
		System.out.println(wc.FindConjecture(n));
		n = 53;
		System.out.println(wc.FindConjecture(n));
	}

}
