package bj1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 'A'는 아스키 코드로 65
		// 대문자 : 65 ~ 90
		// 소문자 : 97 ~ 122
		// 예) C(=67) 를 입력받았을 때, arr[2] 를 도출해내려면 arr[C - 65] 해주면 된다.
		
		int[] arr = new int[26]; // 영문자 개수 26개. A,a가 arr[0]에 들어감
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				System.out.println(s.charAt(i));
				arr[s.charAt(i) - 65]++; // 해당 인덱스의 값 1 증가
//				arr[s.charAt(i) - 'A']++; // 이 방법도 가능
			} else { // 소문자 범위
				arr[s.charAt(i) - 97]++;
//				arr[s.charAt(i) - 'a']++;
			}
		}
		// 배열의 원소들의 값을 비교하여 가장 큰 값을 갖고있는 인덱스의 문자를 출력하기
		int max = -1; // 최댓값을 저장
		char ch = '?'; // 출력할 문자
		
		for(int i=0; i<26; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65); // 대문자로 출력해야하므로 65 더해줌
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
