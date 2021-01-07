package kh.java.network.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * 
 * ip : 자동으로 server computer의 ip가 할당
 * port : 직접 지정
 *
 */
public class ChatServer {
	
	public static final int PORT = 7777; 
	
	public static void main(String[] args) {
		new ChatServer().init();
	}

	private void init() {
		
		try {
			//1. Server Socket생성
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while(true) {
			
				try {
					System.out.println("[" + InetAddress.getLocalHost().getHostAddress() 
									 + ":" + PORT + "]에서 연결대기중...");
					
					//2. Client 연결요청이 있을때, 소켓을 새로 생성해 통신
					Socket socket = serverSocket.accept();
					
					//3. 소켓용 입출력스트림 준비
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					
					//4. welcome message
					pw.println("환영합니다.");
					pw.flush();//버퍼내용을 즉시 쓰기. 버퍼가 가득 차지 않아도 전송하기
					
					//5. 채팅
					String data = "";
					Scanner sc = new Scanner(System.in);//서버쪽 사용자 키보드 입력
					while((data = br.readLine()) != null) {
						if("exit".equals(data)) {
							System.out.println("클라이언트가 채팅방을 나갔습니다.");
							break;
						}
						
						System.out.println("클라이언트 : " + data);
						System.out.print("서버 : ");
						String msg = sc.nextLine();
						pw.println(msg);
						pw.flush();
					}
					
				} catch(SocketException e) {
					System.err.println(e.getMessage());
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
