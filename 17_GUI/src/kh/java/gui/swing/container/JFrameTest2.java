package kh.java.gui.swing.container;

import javax.swing.JFrame;
//방법2. jFrame클래스 상속
public class JFrameTest2 extends JFrame {
	
	public JFrameTest2() {
		setTitle("두번째 프레임");
//		setSize(300,200);
//		setLocation(200,200);
		//setLocation(x,y), setSize(width, height) == setBounds
		setBounds(200,200,300,200); //위의 두줄을 똑같이 쓸수있음
		
		//리사이즈 방지
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest2();
	}
}
