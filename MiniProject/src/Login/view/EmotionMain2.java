package Login.view;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EmotionMain2 extends JFrame {
	
	public EmotionMain2() {
		
		setTitle("이모티콘");
		setSize(700, 600);
		
		//리사이즈 방지
		setResizable(false);
		//가운데 위치
		setLocationRelativeTo(null);
		//x누르면 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 패널 위치 지정
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.MAGENTA);
		JLabel label1 = new JLabel("panel1");
		panel1.setBounds(50, 80, 300, 400);
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(350, 80, 300, 400);
		panel2.add(label2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.blue);
		JLabel label3 = new JLabel("panel3");
		panel3.setBounds(50, 480, 300, 400);
		panel3.add(label3);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.cyan);
		JLabel label4 = new JLabel("panel4");
		panel4.setBounds(350, 480, 300, 400);
		panel4.add(label4);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.cyan);
		JLabel label5 = new JLabel("panel5");
		panel5.setBounds(350, 480, 300, 400);
		panel5.add(label4);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.cyan);
		JLabel label6 = new JLabel("panel6");
		panel6.setBounds(350, 480, 300, 400);
		panel6.add(label4);
		
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.cyan);
		JLabel label7 = new JLabel("panel7");
		panel7.setBounds(350, 480, 300, 400);
		panel7.add(label7);
		
		JScrollPane scroll = new JScrollPane(panel1);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
//		panel1.add(scroll);
//		add(panel1);
		add(scroll);
		
		setVisible(true);
	}
		
	public static void main(String[] args) {
		EmotionMain2 emot = new EmotionMain2();
		
	}
}
