package bj2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// StringBuilder에서는 reverse() 라는 아주 좋은 메소드를 포함하고 있다.
		// reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다. 
		// 그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써줘야함
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println((a > b) ? a : b);

	}

}