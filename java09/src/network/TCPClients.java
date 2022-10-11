package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			// 클라이언트가 서버에 접속을 승인받으면
			// 양쪽에 소켓이 생성
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트가 접속함." + i);
		}
	}

}
