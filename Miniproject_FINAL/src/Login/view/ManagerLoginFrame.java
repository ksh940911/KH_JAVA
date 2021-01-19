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

public class ManagerLoginFrame extends JFrame {

	private JTextField id;
	private JPasswordField pwd;
	private Font font1 = new Font("HY견고딕", Font.BOLD, 22);
	private ImagePanel panel = new ImagePanel("images/Findid.png");

	//관리자 로그인 눌렀을 때 실행되는 프레임.
	public ManagerLoginFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		panel.setBounds(0, 0, 700, 400);
		add(panel);
		setResizable(false);
		setLayout(null);
		inToppanel();
		inManagerId();
		inManagerPsw();
		inLoginPanel();
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

	// Manager Mode 상단 라벨
	private void inToppanel() {

		JLabel ManagerFrame = new JLabel("Manager Mode");
		ManagerFrame.setBounds(200, 20,  310, 70);
		Font title = new Font("Wendy One", Font.BOLD, 37);
		ManagerFrame.setForeground(new Color(11, 58, 110));
		ManagerFrame.setFont(title);

		panel.add(ManagerFrame);
	}

	//ID 라벨 + 텍스트필드
	private void inManagerId() {

		JLabel IdLabel = new JLabel("ID");
		IdLabel.setBounds(100, 130, 50, 50);
		IdLabel.setFont(setmyfont(17));
		panel.add(IdLabel);

		id = new JTextField();
		id.setBounds(200, 140, 240, 30);
		panel.add(id);
	}

	//Password 라벨 + 페스워드필드
	private void inManagerPsw() {

		// 라벨
		JLabel PawLabel = new JLabel("Password");
		PawLabel.setBounds(70, 180, 90, 50);
		PawLabel.setFont(setmyfont(15));
		panel.add(PawLabel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 190, 240, 30);
		panel.add(pwd);
	}

	//로그인 버튼 + 클릭시 활성화
	private void inLoginPanel() {

		JButton btn = new JButton("로그인");
		btn.setBounds(470, 140, 100, 80);
		btn.setFont(setmyfont(17));

		panel.add(btn);

		//클릭시 Managerloginid과 Managerloginpassword를 ManagerList 파일에 쓰여진 값을 저장된 회원목록과 비교
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String Managerloginid = id.getText();
				String Managerloginpassword = new String(pwd.getPassword());
				Set<Login> set = new LoginController().loadManagerId();
				if (set.contains(new Login(Managerloginid, Managerloginpassword))) {
					setVisible(false);
					new LoginTable(500, 200, "회원가입한 회원목록").setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "매니져 계정이 아닙니다");
				}
			}
		});
	}
}
