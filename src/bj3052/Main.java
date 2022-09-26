package bj3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		HashSet : Collection 중 Set 의 파생클래스
//		1. 중복 저장 X
//		2. 순서 유지 X (-> Collections.sort() 사용 불가. 정렬을 하고 싶다면 리스트로 변환 후 정렬)
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(h.size());
	}

}
