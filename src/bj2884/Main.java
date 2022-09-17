package bj2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(h == 0 && m < 45) {
			System.out.println("23 "+(60-(45-m)));
		} else {
			if(m < 45) {
				System.out.println((h-1)+" "+(60-(45-m)));
			} else {
				System.out.println(h+" "+(m-45));
			}
		}
		
	}

}
