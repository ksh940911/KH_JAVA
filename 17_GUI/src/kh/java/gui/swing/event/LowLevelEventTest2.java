package kh.java.gui.swing.event;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

public class LowLevelEventTest2 extends JFrame {

	JTextField input;
	JTextArea textArea;

	public LowLevelEventTest2(int w, int h, String title) {
		MyUtil.init(this, w, h, title);

		// topPanel
		initTopPanel();

		// centerPanel
		initCenterPanel();

	}

	private void initTopPanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("사용자 입력 : "));
		input = new JTextField(10);
		panel.add(input);//컬럼수로 너비지정 가능
		add(panel, BorderLayout.NORTH);

		// 이벤트핸들러 추가
		input.addKeyListener(new MyKeyListener());

	}

	private void initCenterPanel() {
		JPanel panel = new JPanel();
		textArea = new JTextArea(5,20);
		panel.add(textArea);
		add(panel);
	}

	public class MyKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
//			System.out.println("typed : " + e.getKeyCode() + " " + e.getKeyChar());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("pressd : " + e.getKeyCode() + " " + e.getKeyChar());
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//				System.out.println("엔터를 입력하셨습니다.");
				//사용자 입력값 전체를 JTextArea에 출력!
				String s = input.getText();//JTextField의 값
				textArea.append(s + "\n");
				//초기화
				input.setText("");
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	}

	public static void main(String[] args) {
		new LowLevelEventTest2(300,200,"키이벤트").setVisible(true);
	}

}