package string;

import java.io.*;
import java.util.*;

public class baekjoon_2675_문자열반복 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫 줄: 테스트 케이스 개수 T
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder(); // 결과를 한 번에 출력하기 위해 사용
		for (int i = 0; i < T; i++) {
			// 각 줄 입력: R과 S
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken()); // 반복 횟수
			String S = st.nextToken(); // 문자열

			// 문자열 처리
			for (char c : S.toCharArray()) {
				for (int j = 0; j < R; j++) {
					sb.append(c);
				}
			}
			sb.append("\n"); // 각 테스트 케이스 결과 줄바꿈
		}

		System.out.print(sb.toString()); // 결과 출력
	}

}
