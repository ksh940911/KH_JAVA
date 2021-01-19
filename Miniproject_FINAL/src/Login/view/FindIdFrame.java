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

public class FindIdFrame extends JFrame {

	private JTextField email;
	private JTextField name;
	private BufferedImage image;
	private ImagePanel panel = new ImagePanel("images/Findid.png");

	// 기본생성자로 첫화면 구성
	public FindIdFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		panel.setBounds(0, 0, 700, 400);
		add(panel);
		setLayout(null);
		setResizable(false);
		inToppanel();
		inIdPanel();
		inEmailPanel();
		inFindButton();
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

	// 상단 라벨
	public void inToppanel() {

		JLabel welcome = new JLabel("Find ID");
		welcome.setBounds(255, 20, 200, 70);
		Font title = new Font("Wendy One", Font.BOLD, 50);
		welcome.setForeground(new Color(11, 58, 110));
		welcome.setFont(title);
		panel.add(welcome);
	}

	//Name 라벨 + 텍스트필드
	private void inIdPanel() {

		JLabel IdPanel = new JLabel("Name");
		IdPanel.setBounds(80, 120, 60, 50);
		IdPanel.setFont(setmyfont(17));
		panel.add(IdPanel);

		name = new JTextField();
		name.setBounds(180, 125, 270, 40);
		panel.add(name);
	}
	
	//Email라벨 + 텍스트필드
	private void inEmailPanel() {

		JLabel PasswordPanel = new JLabel("Email");
		PasswordPanel.setBounds(80, 190, 60, 50);
		PasswordPanel.setFont(setmyfont(17));
		panel.add(PasswordPanel);

		email = new JTextField();
		email.setBounds(180, 195, 270, 40);
		panel.add(email);
	}

	//찾기 버튼  + 클릭시 활성화
	private void inFindButton() {

		JButton btn = new JButton("찾기");
		btn.setBounds(480, 125, 100, 110);
		btn.setFont(setmyfont(17));
		panel.add(btn);

		//클릭시  name과 email 칸에 쓰여진 값을 저장된 회원목록과 비교
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tempname = name.getText();
				String tempemail = new String(email.getText());

				// 아이디 찾기
				Set<Login> set = new LoginController().loadId();// 객체를 다 가져와서 셋에 넣는코드.
				Iterator<Login> it = set.iterator();

				//못찾으면 트루로 설정
				boolean notFound = true;
				
				// 이름과, 이메일 찾으면 실행됨.
				while (it.hasNext()) {
					Login temp = it.next();
					if (tempname.equals(temp.getName()) && tempemail.equals(temp.getEmailAddress())) {
						JOptionPane.showMessageDialog(null, "아이디 :  " + temp.getId());
						notFound = false;
						break;
					}
				}
				// 못찾으면 실행됨.
				if (notFound) {
					JOptionPane.showMessageDialog(null, "가입된 회원이 아닙니다");
				} else {
					setVisible(false);
				}
			}
		});
	}
}
