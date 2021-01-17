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

public class findpasswordFrame extends JFrame {

	private JTextField id;
	private JTextField email;
	private JTextField name;
	private BufferedImage image;
	private ImagePanel panel = new ImagePanel("images/Findid.png");
	private Font font1 = new Font("HY견고딕", Font.BOLD, 22);

	// 기본생성자에 첫화면 구성
	public findpasswordFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 사이즈 변경불가

		panel.setBounds(0, 0, 700, 400);
		add(panel);
		inToppanel();
		inIdPanel();
		innamePanel();
		ineamilPanel();
		infindButton();
		setResizable(false);

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

		JLabel welcome = new JLabel("비밀번호 찾기");
		welcome.setBounds(260, 20, 170, 70);
		welcome.setFont(setmyfont(20));
		panel.add(welcome);
	}

	private void inIdPanel() {

		JLabel IdPanel = new JLabel("ID");
		IdPanel.setBounds(100, 100, 60, 50);
		IdPanel.setFont(setmyfont(22));
		panel.add(IdPanel);

		id = new JTextField();
		id.setBounds(200, 105, 260, 40);
		panel.add(id);
	}

	private void innamePanel() {

		JLabel innamePanel = new JLabel("Name");
		innamePanel.setBounds(88, 180, 130, 50);
		innamePanel.setFont(setmyfont(19));
		panel.add(innamePanel);

		name = new JTextField();
		name.setBounds(200, 185, 260, 40);
		panel.add(name);
	}

	private void ineamilPanel() {

		JLabel PasswordPanel = new JLabel("Email");
		PasswordPanel.setBounds(85, 260, 130, 50);
		PasswordPanel.setFont(setmyfont(19));
		panel.add(PasswordPanel);

		email = new JTextField();
		email.setBounds(200, 265, 260, 40);
		panel.add(email);
	}

	private void infindButton() {

		JButton btn = new JButton("찾기");
		btn.setBounds(500, 150, 110, 120);
		btn.setFont(setmyfont(17));
		panel.add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tempname = name.getText();
				String tempemail = new String(email.getText());
				String tempid = id.getText();

				Set<Login> set = new LoginController().loadId();

				Iterator<Login> it = set.iterator();

				// 못찾으면 트루
				boolean notFound = true;
				while (it.hasNext()) {

					Login temp = it.next();

					if (tempname.equals(temp.getName()) && tempemail.equals(temp.getEmailAddress())
							&& tempid.equals(temp.getId())) {
						JOptionPane.showMessageDialog(null, "비밀번호 :  " + temp.getPassword());
						notFound = false;
						break;
					}
				}
				// 못찾으면 실행
				if (notFound) {
					JOptionPane.showMessageDialog(null, "가입된 회원이 아닙니다");
				} else {
					setVisible(false);
				}

			}
		});
	}
}
