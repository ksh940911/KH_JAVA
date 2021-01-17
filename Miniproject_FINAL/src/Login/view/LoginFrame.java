package Login.view;

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

	// 기본생성자에 첫화면 구성
	public LoginFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		panel.setBounds(0, 0, 700, 400);
		add(panel);

		inToppanel();
		inIdPanel();
		inPasswordPanel();
		inLoginPanel();
		findIdFrame();
		findpasswordFrame();
		inSignupPanel();
		inManagerLoginPanel();

	}

	// 폰트 사이즈 정하기용
	public Font setmyfont(int size) {
		return new Font("휴먼옛체", Font.BOLD, size);
	}

	// 이미지 클래스
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

	// 상단 패널
	public void inToppanel() {

		JLabel welcome = new JLabel("강아지 인기투표");
		welcome.setBounds(220, 30, 300, 50);
		welcome.setFont(setmyfont(40));
		panel.add(welcome);
	}

	private void inIdPanel() {

		JLabel IdPanel = new JLabel("ID");
		IdPanel.setBounds(100, 100, 60, 50);
		IdPanel.setFont(setmyfont(20));
		panel.add(IdPanel);

		id = new JTextField();
		id.setBounds(200, 110, 260, 40);
		panel.add(id);
	}

	private void inPasswordPanel() {

		JLabel PasswordPanel = new JLabel("PASSWORD");
		PasswordPanel.setBounds(60, 180, 120, 50);
		PasswordPanel.setFont(setmyfont(17));
		panel.add(PasswordPanel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 185, 260, 40);
		panel.add(pwd);
	}

	private void inLoginPanel() {

		JButton btn = new JButton("로그인");
		btn.setBounds(480, 110, 120, 110);
		btn.setFont(setmyfont(20));

		panel.add(btn);
		
		// 로그인 누르면 캘린더화면으로 (아이디 비밀번호 확인 필요)
		btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String loginid = id.getText();
                String loginpassword = new String(pwd.getPassword());
                Set<Login> set = new LoginController().loadId();
                
                
                if(set.contains(new Login(loginid, loginpassword))) {
                    setVisible(false);
                    new EmotionFrame();
                }else {
                    JOptionPane.showMessageDialog(null, "가입된 회원이 아닙니다");
                }
            }
        });
	}

	private void findIdFrame() {

		JButton btn = new JButton("아이디 찾기");
		btn.setBounds(60, 270, 120, 40);
		btn.setFont(setmyfont(13));
		panel.add(btn);

		// 회원가입 창으로 연결되는 리스너
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new findIdFrame(700, 400, "아이디 찾기").setVisible(true);
			}
		});
	}

	private void findpasswordFrame() {

		JButton btn = new JButton("비밀번호 찾기");
		btn.setBounds(200, 270, 120, 40);
		btn.setFont(setmyfont(12));
		panel.add(btn);

		// 회원가입 창으로 연결되는 리스너
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new findpasswordFrame(700, 400, "비밀번호 찾기").setVisible(true);
			}
		});
	}

	private void inSignupPanel() {

		JButton btn = new JButton("회원가입");
		btn.setBounds(340, 270, 120, 40);
		btn.setFont(setmyfont(14));

		panel.add(btn);

		// 회원가입 창으로 연결되는 리스너
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame(550, 600, "회원가입").setVisible(true);
			}
		});
	}

	private void inManagerLoginPanel() {

		JButton btn = new JButton("관리자로그인");
		btn.setBounds(480, 270, 120, 40);
		btn.setFont(setmyfont(11));
		panel.add(btn);

		// 회원가입 창으로 연결되는 리스너
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ManagerLoginFrame(700, 400, "관리자모드").setVisible(true);
			}
		});
	}
}