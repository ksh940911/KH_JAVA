package Login.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Login.controller.LoginController;
import Login.model.vo.Login;
import util.MyUtil;

public class LoginFrame extends JFrame {

	private JTextField id;
	private JPasswordField pwd;
	private ImagePanel panel = new ImagePanel("images/Findid.png");

	// 기본생성자로 첫화면 구성
	public LoginFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		panel.setBounds(0, 0, 700, 400);
		add(panel);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		inToppanel();
		inIdPanel();
		inPasswordPanel();
		inLoginPanel();
		findIdFrame();
		findpasswordFrame();
		inSignupPanel();
		inManagerLoginPanel();
	}

	// 폰트 사이즈 정하기
	public Font setmyfont(int size) {
		return new Font("휴먼옛체", Font.BOLD, size);
	}

	// 이미지 클래스 구현
	public class ImagePanel extends JPanel {

		private BufferedImage image;
		private int width;
		private int height;

		public ImagePanel(String fileName) {
			setLayout(null);

			try {
				image = ImageIO.read(new File(fileName));
				width = image.getWidth();
				height = image.getHeight();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(width, height);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, null);
		}

	}

	// 상단 라벨
	public void inToppanel() {

		JLabel welcome = new JLabel("Puppy Vote");
		
		Font title = new Font("Wendy One", Font.BOLD, 50);
		welcome.setForeground(new Color(11, 58, 110));
		welcome.setBounds(200, 20, 320, 50);
		welcome.setFont(title);
		panel.add(welcome);
	}

	// ID 라벨 + 택스트필드
	private void inIdPanel() {

		JLabel IdPanel = new JLabel("ID");
		IdPanel.setBounds(100, 105, 60, 50);
		IdPanel.setFont(setmyfont(20));
		panel.add(IdPanel);

		id = new JTextField();
		id.setBounds(200, 110, 260, 40);
		panel.add(id);
	}

	//Password 라벨 + 페스워드필드
	private void inPasswordPanel() {

		JLabel PasswordPanel = new JLabel("PASSWORD");
		PasswordPanel.setBounds(60, 180, 120, 50);
		PasswordPanel.setFont(setmyfont(17));
		panel.add(PasswordPanel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 185, 260, 40);
		panel.add(pwd);
	}

	// 로그인 버튼 + 클릭시 활성화
	private void inLoginPanel() {

		JButton btn = new JButton("로그인");
		btn.setBounds(480, 110, 120, 110);
		btn.setFont(setmyfont(20));

		panel.add(btn);

		// 클릭시 정보 맞으면 MainFrame으로 이동 (io에 저장되어 있는 아이디와 비밀번호 확인)
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String loginid = id.getText();
				String loginpassword = new String(pwd.getPassword());
				Set<Login> set = new LoginController().loadId();

				if (set.contains(new Login(loginid, loginpassword))) {
					setVisible(false);
					new MainFrame();
				} else {
					JOptionPane.showMessageDialog(null, "가입된 회원이 아닙니다");
				}
			}
		});
	}

	//아이디 찾기 버튼  + 클릭시 활성화
	private void findIdFrame() {

		JButton btn = new JButton("아이디 찾기");
		btn.setBounds(60, 270, 120, 40);
		btn.setFont(setmyfont(13));
		panel.add(btn);

		// 클릭시 아이디 찾기 프레임 생성
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FindIdFrame(700, 400, "아이디 찾기").setVisible(true);
			}
		});
	}

	//비밀번호 찾기 버튼  + 클릭시 활성화
	private void findpasswordFrame() {

		JButton btn = new JButton("비밀번호 찾기");
		btn.setBounds(200, 270, 120, 40);
		btn.setFont(setmyfont(12));
		panel.add(btn);

		// 클릭시 비밀번호 찾기 프레임 생성
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FindpasswordFrame(700, 400, "비밀번호 찾기").setVisible(true);
			}
		});
	}
	
	//비밀번호 찾기 버튼  + 클릭시 활성화
	private void inSignupPanel() {

		JButton btn = new JButton("회원가입");
		btn.setBounds(340, 270, 120, 40);
		btn.setFont(setmyfont(14));

		panel.add(btn);

		// 클릭시 회원가입 찾기 프레임 생성
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame(540, 600, "회원가입").setVisible(true);
			}
		});
	}

	//관리자 로그인 버튼  + 클릭시 활성화
	private void inManagerLoginPanel() {

		JButton btn = new JButton("관리자로그인");
		btn.setBounds(480, 270, 120, 40);
		btn.setFont(setmyfont(11));
		panel.add(btn);

		// 관리자모드  프레임 생성
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ManagerLoginFrame(700, 400, "관리자모드").setVisible(true);
			}
		});
	}
}