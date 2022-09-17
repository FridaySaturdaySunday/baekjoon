package bj2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m < 45) {
			h--;
			m = 60 - (45 - m);
			if(h == -1) {
				h = 23;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}
		
	}

}
