package Login.view;

import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import util.MyUtil;
//관리자 로그인하는 프레임.
public class ManagerLoginFrame extends JFrame {

	private JTextField id;
	private JPasswordField pwd;

	public ManagerLoginFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		setLayout(null);
		inToppanel();
		inManagerId();
		inManagerPsw();
		inLoginPanel();
		
		
	}

	private void inToppanel() {

		// 라벨
		Label ManagerFrame = new Label("manager mode");
		ManagerFrame.setBounds(125, 0, 100, 100);
		add(ManagerFrame);

	}
	
	private void inManagerId() {

		// 라벨
		Label IdLabel = new Label("ID");
		IdLabel.setBounds(100, 100, 50, 50);
		add(IdLabel);

		id = new JTextField();
		id.setBounds(200, 110, 150, 30);
		add(id);

	}

	private void inManagerPsw() {

		// 라벨
		Label IdLabel = new Label("Password");
		IdLabel.setBounds(80, 150, 60, 50);
		add(IdLabel);

		pwd = new JPasswordField();
		pwd.setBounds(200, 160, 150, 30);
		add(pwd);

	}
	
	
	private void inLoginPanel() {

		JButton btn = new JButton("로그인");
		btn.setBounds(350, 110, 100, 110);
		add(btn);
		
		//로그인 누르면 관리자프레임으로 (아이디 비밀번호 확인 필요)
		
		btn.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				setVisible(false);//현재창 안보이게하고 매니져모드로
				new ManageUsers();
			}
		});

	}
}
