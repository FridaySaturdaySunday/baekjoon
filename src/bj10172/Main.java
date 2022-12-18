package bj10172;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
//		자바에서는 몇몇 문자는 단독으로 써서 출력할 수 없다. ( 대표적으로 백슬래시(\)와 따옴표(')(")가 있다.)
//		그래서 문자를 출력하기 위해 조합을 만들어서 출력할 수 있도록 하는데 이를 Escape Sequence 라고 한다.
//		이스케이프 시퀀스는 백슬래시(\) + 문자 의 조합으로 쓰인다.
		
//		BufferedWriter - OutputStreamWriter
//		각 라인마다 bw.newLine(); 으로 개행을 해준다. (또는 각 write 마다 \n 을 붙여줘도 된다.)
//		이후 bw.flush() 로 스트림에 들어있는 데이터를 비운다.
//		그리고 bw.close() 로 스트림을 종료해준다.
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("|\\_/|");
		bw.newLine();
		
		bw.write("|q p|   /}");
		bw.newLine();
		
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
		
		bw.write("|\"^\"`    |");
		bw.newLine();

		bw.write("||_/=\\\\__|");
		
		bw.flush(); // 버퍼 비우기
		bw.close(); // 스트림 종료
	}

}
