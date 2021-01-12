package kh.java.gui.swing.container.layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class BorderLayoutTest extends JFrame {

	public BorderLayoutTest(int w, int h, String title) {
		// 현재객체, 인자로 전달받은 너비, 높이, 제목까지 전달함
		MyUtil.init(this, w, h, title);

		//JFrame객체의 기본layout은 BorderLayout이다.
		
		// 패널도 커스터마이징 가능
		// 스윙에서 제공하는 클래스를 내 입맛대로 만들기
		JPanel north = new BorderPanel("북", Color.CYAN);
		JPanel south = new BorderPanel("남", Color.blue);
		JPanel east = new BorderPanel("동", Color.gray);
		JPanel west = new BorderPanel("서", Color.orange);
		JPanel center = new BorderPanel("가운데", Color.green);
		//사이즈 지정은 따로하지 않음. 패널 내 컴포넌트 크게에 따라서 패널 크기 정해짐
		//-> 크기 지정을 해도 적용이 되지 않음
		
		//add는 container의 메서드
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
		//but 동서남북을 무조건 다 써줄 필요 없음
		//-> 떼어주거나 추가하여 본인입맛대로 해주면 됨
	}

	/**
	 * 내부클래스(클래스 안의 클래스)
	 * 외부클래스에서 자유롭게 가져다 사용할 수 있다.
	 */
	public class BorderPanel extends JPanel {

		public BorderPanel(String title, Color c) {
			setBackground(c); //배경색 지정
			JLabel label = new JLabel(title);
			add(label); // 현재 JPanel 객체에 추가
		}
	}

	public static void main(String[] args) {
		// 중요 : setVisible을 맨 마지막에 넣어줌
		new BorderLayoutTest(500, 500, "Border LayoutTest").setVisible(true);
	}
}
