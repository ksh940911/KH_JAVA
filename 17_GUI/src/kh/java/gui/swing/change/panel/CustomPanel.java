package kh.java.gui.swing.change.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CustomPanel extends JPanel {
	
	private JFrame parent;
	
	public CustomPanel(JFrame parent, Color c, String title) {
		this.parent = parent;//부모객체에 접근하기 위해 미리 필드로 지정
		
		setBackground(c);
		setLayout(new BorderLayout());
		add(new JLabel(title), BorderLayout.NORTH);
		
		JPanel linkPanel = new JPanel();
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		linkPanel.add(btn0);
		linkPanel.add(btn1);
		linkPanel.add(btn2);
		add(linkPanel, BorderLayout.SOUTH);
		
		//각 버튼별 패널교체하기
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Integer.parseInt(((JButton)e.getSource()).getText());
				System.out.println(index);
				JPanel nextPanel = MainFrame.panels[index];
				MyUtil.changePanel(parent, CustomPanel.this, nextPanel);
			}
		};
		
		btn0.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
	}
}
