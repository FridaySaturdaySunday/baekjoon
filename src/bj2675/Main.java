package bj2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int r = Integer.parseInt(st.nextToken());
			
			String str = st.nextToken();
			
			// getBytes() : 입력 문자열을 byte 단위의 '배열'로 반환시켜주는 메소드
			for(byte a : str.getBytes()) {
				
				for(int j=0; j<r; j++) {
					sb.append((char)a);
				} // getBytes()는 byte형이므로 (char)로 강제형변환 하면됨.
				
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
