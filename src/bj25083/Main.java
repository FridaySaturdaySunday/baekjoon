package bj25083;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

//		BufferedWriter - OutputStreamWriter
//		각 라인마다 bw.newLine(); 으로 개행을 해준다. (또는 각 write 마다 \n 을 붙여줘도 된다.)
//		이후 bw.flush() 로 스트림에 들어있는 데이터를 비운다.
//		그리고 bw.close() 로 스트림을 종료해준다.
		
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		
		br.write("         ,r\'\"7");
		br.newLine();
		
		br.write("r`-_   ,\'  ,/");
		br.newLine();

		br.write(" \\. \". L_r\'");
		br.newLine();

		br.write("   `~\\/");
		br.newLine();

		br.write("      |");
		br.newLine();
		
		br.write("      |");
		
		
		br.flush();
		br.close();
		
	}

}
