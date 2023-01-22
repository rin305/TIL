package j1221;

import java.sql.*;//DB에 관련된 클래스,인터페이스

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.DB에 접속을 성공한 상태=>Connection객체를 얻어왔다 표현
		Connection con=null;
		//2.형식)jdbc:oracle:thin:@원격ip주소(=localhost):포트번호:sid(orcl)
		
		//접속하고자 하는 컴퓨터의 위치
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			//1.접속할 드라이버를 메모리에 올리기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.접속하기위해서 getConnection(1.접속할위치,2.계정명,3.암호)
			con=DriverManager.getConnection(url,"scott", "tiger");
			System.out.println("con=>"+con);
		}catch(Exception e) {
			System.out.println("DB연결실패=>"+e);//이유?
		}
		
	}

}
