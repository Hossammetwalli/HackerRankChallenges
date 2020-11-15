

import java.util.Scanner;

public class LittleGirl {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long left = sc.nextLong();
		long right = sc.nextLong();
		System.out.println(solve(left, right));

		sc.close();
	}

	static long solve(long left, long right) {
		if (left == right) {
			return 0;
		}

		for (long mask = 1L << 62;; mask >>= 1) {
			if ((left & mask) != (right & mask)) {
				return (mask << 1) - 1;
			}
		}
	}
}
