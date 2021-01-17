package Login.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Login.controller.LoginController;
import Login.model.vo.Login;
import util.MyUtil;

public class SignUpFrame extends JFrame {

	private LoginController loginController = new LoginController();

	private JTextField id;
	private JPasswordField pwd;
	private JTextField name;
	private JTextField email;
	private JTextArea introduce;
	private JRadioButton man;
	private JRadioButton woman;
	private Font font1 = new Font("HY견고딕", Font.BOLD, 22);
	private ImagePanel panel = new ImagePanel("images/Findid.png");
	
	
	public SignUpFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
		
		panel.setBounds(0, 0, 550, 600);
		add(panel);
		inToppanel();
		inIdSignUp();
		inPasswordSignUp();
		inNameSignUp();
		inEmailSignUp();
		inGendarSignUp();
		inIntroduceSignUp();
		inConfirmSignUp();
		inCancelSignUp();

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

	private void inToppanel() {

		// 라벨
		JLabel SignupLabel = new JLabel("Sign Up");
		SignupLabel.setBounds(230, 0, 120, 120);
		SignupLabel.setFont(setmyfont(25));
		panel.add(SignupLabel);

	}

	private void inIdSignUp() {

		// 라벨
		JLabel IdLabel = new JLabel("ID");
		IdLabel.setBounds(100, 100, 50, 50);
		IdLabel.setFont(setmyfont(17));
		panel.add(IdLabel);

		id = new JTextField();
		id.setBounds(200, 110, 190, 30);
		panel.add(id);

	}

	private void inPasswordSignUp() {

		// 라벨
		JLabel IdLabel = new JLabel("Password");
		IdLabel.setBounds(75, 150, 90, 50);
		IdLabel.setFont(setmyfont(15));
		panel.add(IdLabel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 160, 190, 30);
		panel.add(pwd);

	}

	private void inNameSignUp() {

		// 라벨
		JLabel IdLabel = new JLabel("Name");
		IdLabel.setBounds(85, 200, 70, 50);
		IdLabel.setFont(setmyfont(17));
		panel.add(IdLabel);

		name = new JTextField();
		name.setBounds(200, 210, 190, 30);
		panel.add(name);

	}

	private void inEmailSignUp() {

		// 라벨
		JLabel IdLabel = new JLabel("Email");
		IdLabel.setBounds(85, 250, 70, 50);
		IdLabel.setFont(setmyfont(17));
		panel.add(IdLabel);

		email = new JTextField();
		email.setBounds(200, 260, 190, 30);
		panel.add(email);

	}

	private void inGendarSignUp() {

		// 라벨
		JLabel GendarLabel = new JLabel("Gendar");
		GendarLabel.setBounds(80, 290, 120, 60);
		GendarLabel.setFont(setmyfont(15));


		// 패널
		JPanel GendarPanel = new JPanel();
		GendarPanel.setBounds(220, 305, 140, 30);
		GendarPanel.setFont(setmyfont(17));

		// 버튼
		man = new JRadioButton("man");
		woman = new JRadioButton("woman");
		// 버튼 그룹핑
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);

		GendarPanel.add(man);
		GendarPanel.add(woman);
		panel.add(GendarLabel);
		panel.add(GendarPanel);

	}

	private void inIntroduceSignUp() {

		// 라벨
		JLabel IntroduceLabel = new JLabel("introduce");
		IntroduceLabel.setBounds(75, 350, 100, 50);
		IntroduceLabel.setFont(setmyfont(17));


		// 택스트구역
		introduce = new JTextArea();//
		introduce.setBounds(200, 350, 190, 100);

		panel.add(IntroduceLabel);
		panel.add(introduce);

	}

	private void inConfirmSignUp() {

		JPanel ConfirmPanel = new JPanel();
		ConfirmPanel.setBounds(300, 500, 60, 50);
		ConfirmPanel.setFont(setmyfont(17));


		JButton ConfirmButton = new JButton("확인");
		ConfirmPanel.setFont(setmyfont(17));
		ConfirmPanel.add(ConfirmButton);

		panel.add(ConfirmPanel);

		// 이벤트 핸들러
		ConfirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 사용자피드백
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다");

				// 입력된 택스트 값 보내줘야함.ex 이름 아이디 비밀번호

				String i = id.getText();
				String p = new String(pwd.getPassword());
				String n = name.getText();
				String ee = email.getText();
				String g = "";// gendar
				String it = introduce.getText();

				// gendar 체크되었을 때 선언
				if (man.isSelected() == true) {
					g = man.getText();
				}

				else if (woman.isSelected() == true) {
					g = man.getText();
				}

				Login id = new Login(i, p, n, ee, g, it);
				loginController.insertId(id);

				// 종료
				setVisible(false);
			}
		});

	}
	private void inCancelSignUp() {

		JPanel CancelPanel = new JPanel();
		CancelPanel.setBounds(360, 500, 60, 50);
		CancelPanel.setFont(setmyfont(17));


		JButton CancelButton = new JButton("취소");
		CancelPanel.add(CancelButton);
		CancelPanel.setFont(setmyfont(17));


		panel.add(CancelPanel);

		// 이벤트 핸들러
		CancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 사용자피드백
				JOptionPane.showMessageDialog(null, "취소되었습니다");

				// 이전으로 가는 이벤트
				setVisible(false);
			}
		});

	}
}
