package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class btnTest extends JFrame {
	
	public btnTest() {
		
		setLayout(null); //레이아웃종류를 null로 만듦
		
		setTitle("버튼테스트"); //프레임 제목정해주기
		
		setSize(400,300); //프레임 크기정해주기
		
		setLocationRelativeTo(null); //프레임을 중앙에 띄우기
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼누를경우 -> 프로그램종료 처리
														//이걸 해주지 않으면 프로그램은 꺼진거처럼 보여도 콘솔에서 계속 돌아가고있다.
		JPanel panel = new JPanel(); //패널 생성
		
		panel.setBounds(125,50,150,150); //패널 위치 크기 설정
		
		panel.setBackground(Color.white); //패널 배경 설정
		
		panel.setLayout(null); //패널 레이아웃종류를 null로 만듦
		
		JButton btn = new JButton("클릭"); //버튼 생성
		
		btn.setBounds(25, 25, 100, 100); //버튼 위치 크기 설정
		
		btn.addActionListener(new ActionListener() { //익명클래스활용(일회성) : 버튼에 이벤트리스너 장착 후 어떤 작업을 시킬지
		//btn.addActionListener(new MyActionListener() //내부클래스활용(프라이빗 필드에 접근용이) : 버튼에 이벤트리스너 장착 후 어떤 작업을 시킬지
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click!!!!!!!!!!!!!"); //작업시킬 내용
			}
		});
		
		panel.add(btn); //패널에 버튼달아주기
		
		add(panel); //프레임에 패널달아주기
		
		setVisible(true); //프레임을 보여주기
	}
	
	class MyActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Click!!!!!!!!!!!!!");
		}
	}

	public static void main(String[] args) {
		
		btnTest b = new btnTest(); //객채생성을 통해 생성자 호출을 위함
	}
}
