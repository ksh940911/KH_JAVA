package Login.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EmotionFrame extends JFrame {

	
	int count1 =  6132;
	int count2 =  450;
	int count3 =  732;
	int count4 =  240;
	int count5 =  421;
	int count6 =  6112;
	int count7 =  4237;
	int count8 =  7412;
	int count9 =  343;
	int max = 0;//최고값
	String name = "";
	
	
	public EmotionFrame() {
		
		
		if(count1>max) {
			name="뭉치";
			max=count1;
		}
		if(count2>max) {
			name="방글이";
			max=count2;
		}
		if(count3>max) {
			name="안경이";
			max=count3;
		}
		if(count4>max) {
			name="바둑이";
			max=count4;
		}
		if(count5>max) {
			name="똑똑이";
			max=count5;
		}
		if(count6>max) {
			name="쓱싹이";
			max=count6;
		}
		if(count7>max) {
			name="반성이";
			max=count7;
		}
		if(count8>max) {
			name="몽실이";
			max=count8;
		}
		if(count9>max) {
			name="흰둥이";
			max=count9;
		}
		
		// 프레임
		setTitle("Puppy world");
		setSize(700, 700);

		// 리사이즈 방지
		setResizable(false);
		// 가운데 위치
		setLocationRelativeTo(null);
		// x누르면 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 패널 위치 지정
		setLayout(null);
		
		
		// 첫번째
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.MAGENTA);
		JLabel label1 = new JLabel("뭉치");
		panel1.setBounds(50, 50, 200, 200);
		panel1.add(label1);
		JButton btn1 = new JButton();
		btn1.setIcon(new ImageIcon("images/dog (3).gif"));
		panel1.add(btn1);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		JLabel label2 = new JLabel("방글이");

		panel2.setBounds(250, 50, 200, 200);
		panel2.add(label2);
		JButton btn2 = new JButton();
		btn2.setIcon(new ImageIcon("images/dog1.gif"));
		panel2.add(btn2);

		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.blue);
		JLabel label3 = new JLabel("안경이");
		panel3.setBounds(450, 50, 200, 200);
		panel3.add(label3);
		JButton btn3 = new JButton();
		btn3.setIcon(new ImageIcon("images/dog9.gif"));
		panel3.add(btn3);

		// 두번째
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.cyan);
		JLabel label4 = new JLabel("바둑이");
		panel4.setBounds(50, 250, 200, 200);
		panel4.add(label4);
		JButton btn4 = new JButton();
		btn4.setIcon(new ImageIcon("images/dog3.gif"));
		panel4.add(btn4);

		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.darkGray);
		JLabel label5 = new JLabel("똑똑이");
		panel5.setBounds(250, 250, 200, 200);
		panel5.add(label5);
		JButton btn5 = new JButton();
		btn5.setIcon(new ImageIcon("images/dog4.gif"));
		panel5.add(btn5);

		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.green);
		JLabel label6 = new JLabel("쓱싹이");
		panel6.setBounds(450, 250, 200, 200);
		panel6.add(label6);
		JButton btn6 = new JButton();
		btn6.setIcon(new ImageIcon("images/dog5.gif"));
		panel6.add(btn6);

		// 세번째
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.LIGHT_GRAY);
		JLabel label7 = new JLabel("반성이");
		panel7.setBounds(50, 450, 200, 200);
		panel7.add(label7);
		JButton btn7 = new JButton();
		btn7.setIcon(new ImageIcon("images/dog6.gif"));
		panel7.add(btn7);

		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.orange);
		JLabel label8 = new JLabel("몽실이");
		panel8.setBounds(250, 450, 200, 200);
		panel8.add(label8);
		JButton btn8 = new JButton();
		btn8.setIcon(new ImageIcon("images/Dog (2).gif"));
		panel8.add(btn8);

		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.pink);
		JLabel label9 = new JLabel("흰둥이?");
		panel9.setBounds(450, 450, 200, 200);
		panel9.add(label9);
		JButton btn9 = new JButton();
		btn9.setIcon(new ImageIcon("images/dog8.gif"));
		panel9.add(btn9);

		JLabel quiz =new JLabel("당신의 마음을 사로잡은 강아지를 클릭하세요");
		quiz.setBounds(180,20,600,20);
		add(quiz);
		
		quiz.setFont(setmyfont(18));
		label1.setFont(setmyfont(13));
		label2.setFont(setmyfont(13));
		label3.setFont(setmyfont(13));
		label4.setFont(setmyfont(13));
		label5.setFont(setmyfont(13));
		label6.setFont(setmyfont(13));
		label7.setFont(setmyfont(13));
		label8.setFont(setmyfont(13));
		label9.setFont(setmyfont(13));
		
		btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	count1++;
                    JOptionPane.showMessageDialog(null, "뭉치를 선택하셨습니다. \n뭉치 현재 인기 점수"+ count1+"\n\t이달의 강아지 인기점수 : "+ name + max);
            }
        });
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count2++;
				JOptionPane.showMessageDialog(null, "방글이를 선택하셨습니다. \n방글이 현재 인기 점수"+ count2+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count3++;
				JOptionPane.showMessageDialog(null, "안경이를 선택하셨습니다. \n안경이 현재 인기 점수"+ count3+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count4++;
				JOptionPane.showMessageDialog(null, "바둑이를 선택하셨습니다. \n바둑이 현재 인기 점수"+ count4+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count5++;
				JOptionPane.showMessageDialog(null, "똑똑이를 선택하셨습니다. \n똑똑이 현재 인기 점수"+ count5+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count6++;
				JOptionPane.showMessageDialog(null, "쓱싹이를 선택하셨습니다. \n쓱싹이 현재 인기 점수"+ count6+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count7++;
				JOptionPane.showMessageDialog(null, "반성이를 선택하셨습니다. \n반성이 현재 인기 점수"+ count7+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count8++;
				JOptionPane.showMessageDialog(null, "몽실이를 선택하셨습니다. \n몽실이 현재 인기 점수"+ count8+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	          	count9++;
				JOptionPane.showMessageDialog(null, "흰둥이를 선택하셨습니다. \n흰둥이 현재 인기 점수"+ count9+"\n\t이달의 강아지 인기점수 : "+ name + max);
			}
		});
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
		add(panel9);
		setVisible(true);
	}
	
	public Font setmyfont(int size) {
		return new Font("휴먼옛체", Font.BOLD, size);
	}
	
}
