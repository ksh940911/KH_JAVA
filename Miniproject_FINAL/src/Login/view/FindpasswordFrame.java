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

public class FindpasswordFrame extends JFrame {

	private JTextField id;
	private JTextField email;
	private JTextField name;
	private BufferedImage image;
	private ImagePanel panel = new ImagePanel("images/Findid.png");
	private Font font1 = new Font("HY견고딕", Font.BOLD, 22);

	// 기본생성자로 첫화면 구성
	public FindpasswordFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		panel.setBounds(0, 0, 700, 400);
		add(panel);
		setLayout(null);
		setResizable(false);
		inToppanel();
		inIdPanel();
		innamePanel();
		ineamilPanel();
		infindButton();
		setResizable(false);

	}

	// 폰트 사이즈 정하기
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

	// 비밀번호찾기 라벨
	public void inToppanel() {

		JLabel welcome = new JLabel("Find Password");
		welcome.setBounds(200, 10,  310, 70);
		Font title = new Font("Wendy One", Font.BOLD, 40);
		welcome.setForeground(new Color(11, 58, 110));
		welcome.setFont(title);
		panel.add(welcome);
	}
	// 아이디  라벨 + 택스트필드
	private void inIdPanel() {

		JLabel IdPanel = new JLabel("ID");
		IdPanel.setBounds(100, 100, 60, 50);
		IdPanel.setFont(setmyfont(22));
		panel.add(IdPanel);

		id = new JTextField();
		id.setBounds(200, 105, 260, 40);
		panel.add(id);
	}

	// 이름  라벨 + 택스트필드
	private void innamePanel() {

		JLabel innamePanel = new JLabel("Name");
		innamePanel.setBounds(88, 180, 130, 50);
		innamePanel.setFont(setmyfont(19));
		panel.add(innamePanel);

		name = new JTextField();
		name.setBounds(200, 185, 260, 40);
		panel.add(name);
	}
	
	// Email 라벨 + 택스트필드
	private void ineamilPanel() {

		JLabel PasswordPanel = new JLabel("Email");
		PasswordPanel.setBounds(85, 260, 130, 50);
		PasswordPanel.setFont(setmyfont(19));
		panel.add(PasswordPanel);

		email = new JTextField();
		email.setBounds(200, 265, 260, 40);
		panel.add(email);
	}

	// 찾기 버튼 + 클릭시 활성화
	private void infindButton() {

		JButton btn = new JButton("찾기");
		btn.setBounds(500, 150, 110, 120);
		btn.setFont(setmyfont(17));
		panel.add(btn);

		//클릭시  name과 email과 id를 userid 파일에 쓰여진 값을 저장된 회원목록과 비교
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
				
				// 이름과, 이메일과 아이디 찾으면 실행됨.
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
