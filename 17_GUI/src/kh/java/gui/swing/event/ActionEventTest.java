package kh.java.gui.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

/**
 * EventListener를 bind하는 방법
 * 1. 내부클래스로 선언해서 객체생성
 * 2. 익명클래스로 선언해서 객체생성(추상클래스, 인터페이스도 new 연산자 사용가능)
 * (익명클래스 : 클래스선언과 동시에 객체생성됨)
 * 3. JFrame 커스텀클래스에서 Listener구현하기
 * 
 *
 */
public class ActionEventTest extends JFrame{
	
	JTextField input;

	public ActionEventTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("사용자 입력 : ");
		JTextField input = new JTextField(10);
		
		//input컴포넌트에 ActionEventHandler 바인딩
//		input.addActionListener(new MyActionListener());
		
		//익명클래스 : 클래스선언 + 객체생성
		//지역내부클래스의 파생형
//		ActionListener listener = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, input.getText());
//				
//				//초기화
//				input.setText("");
//			}
//			
//		};
//		input.addActionListener(listener);
		
		panel.add(label);
		panel.add(input);
		add(panel);
	}	
	
	/**
	 * 
	 * 1. 내부클래스
	 *
	 */
	//내부클래스 작성
	public class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("actionPerformed!");
			JOptionPane.showMessageDialog(null, input.getText());
			
			//초기화
			input.setText("");
//			input.requestFocus();//바로 입력할 수 있도록 focus 가져오기(텍스트필드에 커서가 깜빡이는거)
		}
	}
	
	public static void main(String[] args) {
		new ActionEventTest(300,200, "액션 이벤트").setVisible(true);
	}
	
	/**
	 * 3.JFrame Custom클래스에서 listener구현하기
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		
	}
}
