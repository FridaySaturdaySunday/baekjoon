package bj10998;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// StringTokenizer( "문자열" , 구분자 ); -> 구분자 단위로 문자열을 토큰으로 자름
		StringTokenizer st = new StringTokenizer(str, " "); 
		
		// nextToken(); -> 문자열 반환
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
	
		System.out.println(a*b);
	}

}
