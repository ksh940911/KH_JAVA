package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame{
	JTextField javaScore;
	JTextField sqlScore;
	JTextField total;
	JTextField average;
	
	public ScoreFrame() {
		setLayout(null);
		setTitle("문제 7");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jl0 = new JLabel("점수를 입력하세요");
		Font font = new Font("굴림체",Font.BOLD,50);
		JLabel jl1 = new JLabel("자바 :");
		javaScore = new JTextField();
		JLabel jl2 = new JLabel("SQL :");
		sqlScore = new JTextField();
		JButton calcBtn = new JButton("계산하기");
		JLabel jl3 = new JLabel("총점 :");
		total  = new JTextField();
		JLabel jl4 = new JLabel("평균 :");
		average = new JTextField();
		jl0.setBounds(25,0,450,100);
		jl0.setFont(font);
		jl1.setBounds(25,100,50,50);
		javaScore.setBounds(85, 110, 150, 30);
		jl2.setBounds(260,100,50,50);
		sqlScore.setBounds(320, 110, 150, 30);
		calcBtn.setBounds(200, 170, 100, 50);
		jl3.setBounds(25,260,150,50);
		total.setBounds(85, 270, 150, 30);
		jl4.setBounds(260,260,150,50);
		average.setBounds(320, 270, 150, 30);
		calcBtn.addActionListener(new ActionHandler());
		
		add(jl0);
		add(jl1);
		add(javaScore);
		add(jl2);
		add(sqlScore);
		add(jl3);
		add(total);
		add(jl4);
		add(average);
		add(calcBtn);
		
		setVisible(true);
	}
	
	class ActionHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int java = Integer.parseInt(javaScore.getText());
			int sql = Integer.parseInt(sqlScore.getText());
			
			String sum = Integer.toString(java+sql);
			total.setText(sum);
			String avg = Integer.toString((java+sql)/2);
			average.setText(avg);
		}
	}
}
