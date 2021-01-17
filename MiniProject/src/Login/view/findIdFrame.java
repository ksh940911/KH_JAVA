package Login.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Login.controller.LoginController;
import Login.model.vo.Login;
import util.MyUtil;

public class findIdFrame extends JFrame {

	private JTextField email;
	private JTextField name;
	private BufferedImage image;
	private ImagePanel panel = new ImagePanel("images/Findid.png");

	// 기본생성자에 첫화면 구성
	public findIdFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 사이즈 변경불가

		panel.setBounds(0, 0, 700, 400);

		add(panel);
		inToppanel();
		inIdPanel();
		inEmailPanel();
		inFindButton();

	}

	// 폰트 사이즈 정하기용
	public Font setmyfont(int size) {
		return new Font("HY견고딕", Font.BOLD, size);

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

		JLabel welcome = new JLabel("아이디 찾기");
		welcome.setBounds(265, 20, 170, 70);
		welcome.setFont(setmyfont(20));
		panel.add(welcome);
	}

	private void inIdPanel() {

		JLabel IdPanel = new JLabel("Name");
		IdPanel.setBounds(80, 120, 60, 50);
		IdPanel.setFont(setmyfont(17));
		panel.add(IdPanel);

		name = new JTextField();
		name.setBounds(180, 125, 270, 40);
		panel.add(name);
	}

	private void inEmailPanel() {

		JLabel PasswordPanel = new JLabel("Email");
		PasswordPanel.setBounds(80, 190, 60, 50);
		PasswordPanel.setFont(setmyfont(17));
		panel.add(PasswordPanel);

		email = new JTextField();
		email.setBounds(180, 195, 270, 40);
		panel.add(email);
	}

	private void inFindButton() {

		JButton btn = new JButton("찾기");
		btn.setBounds(480, 125, 100, 110);
		btn.setFont(setmyfont(17));
		panel.add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tempname = name.getText();
				String tempemail = new String(email.getText());

				// 아이디 찾기
				Set<Login> set = new LoginController().loadId();// 객체를 다 가져와서 셋에 넣는코드.

				Iterator<Login> it = set.iterator();

				//못찾으면 트루
				boolean notFound = true;
				while (it.hasNext()) {

					Login temp = it.next();

					if (tempname.equals(temp.getName()) && tempemail.equals(temp.getEmailAddress())) {
						JOptionPane.showMessageDialog(null, "아이디 :  " + temp.getId());
						notFound = false;
						break;
					}
				}
				//못찾으면 실행
				if (notFound) {
					JOptionPane.showMessageDialog(null, "가입된 회원이 아닙니다");
				}else {
					setVisible(false);
				}

			}
		});
	}
}
