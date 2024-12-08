package math;

import java.io.*;
import java.util.*;

public class baekjoon_11653_소인수분해 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력값 n
		int n = Integer.parseInt(br.readLine());

		// 2 이상의 소수로 n을 나누어 출력
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n /= i;
			}
		}

		// 남은 수가 1보다 크다면 그 자체가 소수이므로 출력
		if (n > 1) {
			System.out.println(n);
		}

		br.close();
	}

}