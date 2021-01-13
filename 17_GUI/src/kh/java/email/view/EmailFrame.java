package kh.java.email.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kh.java.email.controller.EmailController;
import kh.java.email.model.vo.Email;
import kh.java.gui.util.MyUtil;

public class EmailFrame extends JFrame {
	
	private JTextArea textArea;
	private EmailController emailController = new EmailController();
	//view -> controller -> io ->file
	public EmailFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		JPanel inputPanel = new JPanel();
		JTextField inputEmail = new JTextField(10);
		JButton submitBtn = new JButton("등록");
		inputPanel.add(inputEmail);
		inputPanel.add(submitBtn);
		
		//제출 이벤트 핸들러
		submitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = inputEmail.getText();
				Email email = new Email(s);
				emailController.insertEmail(email);
				//사용자피드백
				JOptionPane.showMessageDialog(null, "정상등록되었습니다.");
				//inputEmail 초기화
				inputEmail.setText("");
				//입력된 목록 불러오기
				loadEmailList();
				
			}

		});
		
		JPanel listPanel = new JPanel();
		textArea = new JTextArea(5,20);//rows, cols
		listPanel.add(textArea);
		
		add(inputPanel, BorderLayout.NORTH);
		add(listPanel);
	}
	//여기서 다시 controller에 요청을 해서, email목록을 가져옴
	protected void loadEmailList() {
		List<Email> list = emailController.loadEmailist();
		
		textArea.setText("");//초기화
		
		for(Email email : list)
			textArea.append(email.getEmail() + "\n");
	}
}
