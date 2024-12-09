package math;

import java.io.*;

public class baekjoon_11720_숫자의합 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫 줄은 무시
		br.readLine();

		// 문자열을 배열로 쪼갬
		String[] arr = br.readLine().split("");

		// 전체 합을 위한 변수
		int sum = 0;

		// 반복을 통한 합산
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}

		System.out.println(sum);
		br.close();
	}

	// 개선 버젼
	public void main2() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫 줄은 무시 (숫자의 길이는 중요하지 않음)
		br.readLine();

		// 두 번째 줄의 숫자를 읽어서 자릿수 합산
		String input = br.readLine();

		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			sum += input.charAt(i) - '0'; // ASCII 값을 숫자로 변환
		}

		System.out.println(sum);
		br.close();
	}

}
