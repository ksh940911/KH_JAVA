package kh.java.gui.swing.container;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//컴포넌트들끼리 묶어줄수 있는것 : JPanel
//패널도 컨테이너이다.
public class JPanelTest extends JFrame{

	public JPanelTest() {
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame의 기본 LayoutManager객체는 BorderLayout이다
		//배치담당 매니져 : 레이아웃 매니져가 있음 -> 그것을 고려해서 추가해야함
//		setLayout(new borderLayout()); 생략되어있음
		//null layout : layout maneger객체를 사용하지 않고 직접 좌표를 지정
		setLayout(null);
		
		//자식 컴포넌트 추가
		JPanel panel1 = new JPanel();
		//색상명 입력하기
//		panel1.setBackground(Color.MAGENTA); // magenta
		//색상에 맞는 rgb넘버를 찾아서 대입하기
//		panel1.setBackground(new Color(255,0,0)); //red
		panel1.setBackground(new Color(0,255,0)); //green
		JLabel label1 = new JLabel("panel1");
		panel1.setBounds(100, 100, 300, 400);
		//add메서드 필요
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(400, 100, 300, 400);
		panel2.add(label2);
		
		//프레임에 패널 추가
//		add(panel1, BorderLayout.NORTH);
		add(panel1);
		add(panel2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanelTest();
	}
}
