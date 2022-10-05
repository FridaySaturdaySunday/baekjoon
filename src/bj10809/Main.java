package bj10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 알파벳 26자
		
		// 우선 모두 -1로 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i); // 각 문자를 추출한 뒤 ch 라는 변수에 저장
			
			if(arr[ch - 'a'] == -1) { // arr 원소 값이 -1인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
		
		// ch 의 문자의 위치를 우리가 앞서 만든 arr 배열의 값으로 바꿔준다.
		// arr 배열의 인덱스(원소 위치) => ch 가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
		// a 는 10진수로 97 이라는 값에 대응
		// 만약 b 라는 문자가 ch에 담겨있을 경우 b - 'a' 또는 b - 97 을 하면 1 이 되고, arr[1] 은 문자 b를 가리키는 것을 의미
	
		for(int val : arr) {
			System.out.print(val + " ");
		}
	
	}

}
