package Login.view;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import util.MyUtil;

public class LoginFrame extends JFrame {

	private JTextField id;
	private JPasswordField pwd;

	// 기본생성자에 첫화면 구성
	public LoginFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inToppanel();
		inIdPanel();
		inPasswordPanel();
		inLoginPanel();
		inFindIDPanel();
		inFindPasswordPanel();
		inSignupPanel();
		inNonmemberLoginPanel();

	}

	// 상단 패널
	public void inToppanel() {

		Label welcome = new Label("Calendar");
		welcome.setBounds(300, 10, 60, 50);
		add(welcome);
	}

	private void inIdPanel() {

		Label IdPanel = new Label("ID");
		IdPanel.setBounds(100, 100, 60, 50);
		add(IdPanel);

		id = new JTextField();
		id.setBounds(200, 110, 260, 40);
		add(id);
	}

	private void inPasswordPanel() {

		Label PasswordPanel = new Label("PASSWORD");
		PasswordPanel.setBounds(80, 180, 60, 50);
		add(PasswordPanel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 180, 260, 40);
		add(pwd);
	}

	private void inLoginPanel() {

		JButton btn = new JButton("로그인");
		btn.setBounds(500, 110, 100, 110);
		add(btn);
		//로그인 누르면 캘린더화면으로 (아이디 비밀번호 확인 필요)
		
		btn.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				setVisible(false);//현재창 안보이게하고 캘린더 뜨게
				new MainFrame();
				
			}
		});

	}

	private void inFindIDPanel() {

		JButton btn = new JButton("ID찾기");
		btn.setBounds(80, 240, 120, 40);
		add(btn);

	}

	private void inFindPasswordPanel() {

		JButton btn = new JButton("PASSWORD찾기");
		btn.setBounds(215, 240, 120, 40);
		add(btn);

	}

	private void inSignupPanel() {

		JButton btn = new JButton("회원가입");
		btn.setBounds(350, 240, 120, 40);
		add(btn);

		// 회원가입 창으로 연결되는 리스너
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame(550, 600, "회원가입").setVisible(true);
			}

		});

	}

	private void inNonmemberLoginPanel() {

		JButton btn = new JButton("관리자로그인");
		btn.setBounds(480, 240, 120, 40);
		add(btn);
		
		// 회원가입 창으로 연결되는 리스너
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ManagerLoginFrame(500, 600, "관리자모드").setVisible(true);
			}

		});

	}

}
