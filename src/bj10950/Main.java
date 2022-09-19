package bj10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		// String : 할당된 공간이 변하지 않는 특성인 불변(Immutable)성
		// StringBuilder, StringBuffer : 할당된 공간이 변하는 특성인 가변(mutable)성
		
		// StringBuilder, StringBuffer : 클래스의 문자열을 수정하고 싶으면 append()
		
		// StringBuilder : 동기화 지원X -> 속도 빠름 (문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우 유리)
		// StringBuffer : 동기화 지원 -> 멀티 스레드 환경에서도 안전하게 동작
		
		StringBuilder sb = new StringBuilder(); 
		
		for(int i=0; i<a; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
			
		}
		System.out.println(sb);
		
	}

}
