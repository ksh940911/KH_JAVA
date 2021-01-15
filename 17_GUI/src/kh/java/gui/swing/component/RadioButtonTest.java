package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import kh.java.gui.util.MyUtil;

public class RadioButtonTest extends JFrame {
	
	JLabel resultLabel;

	public RadioButtonTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		topPanel();
		sizePanel();
		resultPanel();
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("커피 사이즈를 선택하세요.");
		panel.add(label);
		add(panel, BorderLayout.NORTH);
	}
	
	private void sizePanel() {
		JPanel panel = new JPanel();
		JRadioButton small = new JRadioButton("small"); 
		JRadioButton medium= new JRadioButton("medium"); 
		JRadioButton large = new JRadioButton("large");
		
		//단일선택을 위해 그루핑 필수!
		ButtonGroup group = new ButtonGroup();
		group.add(small); 
		group.add(medium); 
		group.add(large); 
		
		//이벤트핸들러 설치
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트 발생객체
				JRadioButton btn = (JRadioButton)e.getSource();
				resultLabel.setText("[" + btn.getText() +"]를 선택하셨습니다.");
			}
		};
		small.addActionListener(listener);
		medium.addActionListener(listener);
		large.addActionListener(listener);
		
		panel.add(small);
		panel.add(medium);
		panel.add(large);
		add(panel);
		
	}

	private void resultPanel() {
		JPanel panel = new JPanel();
		this.resultLabel = new JLabel("사이즈를 선택하세요.");
		panel.add(resultLabel);
		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new RadioButtonTest(300,200, "라디오 버튼").setVisible(true);
	}

}
