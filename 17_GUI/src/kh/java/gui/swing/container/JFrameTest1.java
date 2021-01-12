package kh.java.gui.swing.container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 1. JFrama객체 생성1
 * 		new JFrame() 직접 객체 생성하기
 * 2. JFrame객체 생성2
 * 		JFrame을 상속한 커스텀 클래스 작성후 객체 생성하기
 */
public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//제목지정
		f.setTitle("Hello Swing");
		
		//윈도우 크기 위치 지정
		f.setSize(300, 200);
		//기준을 어디로 삼아서 위치시킬지 기준점 설정(x,y)
		//음수일수도 있으나, 화면 밖에 위치하게 될 것
//		f.setLocation(500, 300);
		//프로그램은 직접 종료시키기 전까지 x버튼을 눌러도 돌아가고 있음
		
		f.setLocationRelativeTo(null);
		//스크린 가운데 띄우기
		
		//x버튼 -> 프로그램 종료 처리 -> x버튼 누를 시 프로그램이 함께 꺼지도록
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식 컴포넌트 : 컨테이너에 포함된 컴포넌트
		f.add(new JLabel("안녕"));
		
		//시각화처리(무조건 맨 마지막에 작성!)
		f.setVisible(true);
	}

}
