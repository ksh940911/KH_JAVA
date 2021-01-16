package Login.view;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
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

	public SignUpFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
		inToppanel();
		inIdSignUp();
		inPasswordSignUp();
		inNameSignUp();
		inSecurityNumberSignUp();
		inGendarSignUp();
		inIntroduceSignUp();
		inConfirmSignUp();
		inCancelSignUp();

	}

	private void inToppanel() {

		// 라벨
		Label SignupLabel = new Label("Sign Up");
		SignupLabel.setBounds(250, 0, 100, 100);
		add(SignupLabel);

	}

	private void inIdSignUp() {

		// 라벨
		Label IdLabel = new Label("ID");
		IdLabel.setBounds(100, 100, 50, 50);
		add(IdLabel);

		id = new JTextField();
		id.setBounds(200, 110, 150, 30);
		add(id);

	}

	private void inPasswordSignUp() {

		// 라벨
		Label IdLabel = new Label("Password");
		IdLabel.setBounds(80, 150, 60, 50);
		add(IdLabel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 160, 150, 30);
		add(pwd);

	}

	private void inNameSignUp() {

		// 라벨
		Label IdLabel = new Label("Name");
		IdLabel.setBounds(90, 200, 50, 50);
		add(IdLabel);

		name = new JTextField();
		name.setBounds(200, 210, 150, 30);
		add(name);

	}

	private void inSecurityNumberSignUp() {

		// 라벨
		Label IdLabel = new Label("SecurityNumber");
		IdLabel.setBounds(90, 250, 70, 50);
		add(IdLabel);

		email = new JTextField();
		email.setBounds(200, 260, 70, 30);
		add(email);

	}

	private void inGendarSignUp() {

		// 라벨
		Label GendarLabel = new Label("Gendar");
		GendarLabel.setBounds(90, 290, 50, 50);

		// 패널
		JPanel GendarPanel = new JPanel();
		GendarPanel.setBounds(110, 300, 300, 50);

		// 버튼
		man = new JRadioButton("man");
		woman = new JRadioButton("woman");
		// 버튼 그룹핑
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);

		GendarPanel.add(man);
		GendarPanel.add(woman);
		add(GendarLabel);
		add(GendarPanel);

	}

	private void inIntroduceSignUp() {

		// 라벨
		Label IntroduceLabel = new Label("introduce");
		IntroduceLabel.setBounds(90, 350, 100, 50);

		// 택스트구역
		introduce = new JTextArea();//
		introduce.setBounds(200, 350, 250, 120);

		add(IntroduceLabel);
		add(introduce);

	}

	private void inConfirmSignUp() {

		JPanel ConfirmPanel = new JPanel();
		ConfirmPanel.setBounds(300, 500, 60, 50);

		JButton ConfirmButton = new JButton("확인");
		ConfirmPanel.add(ConfirmButton);

		add(ConfirmPanel);

		// 이벤트 핸들러
		ConfirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 사용자피드백
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다");

				// 입력된 택스트 값 보내줘야함.ex 이름 아이디 비밀번호

				String i = id.getText();
				String p = pwd.getPassword().toString();
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

				Login ID = new Login(i, p, n, ee, g, it);
				LoginController.insertId(ID);

				// 종료
				setVisible(false);
			}
		});

	}

	private void inCancelSignUp() {

		JPanel CancelPanel = new JPanel();
		CancelPanel.setBounds(360, 500, 60, 50);

		JButton CancelButton = new JButton("취소");
		CancelPanel.add(CancelButton);

		add(CancelPanel);

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
