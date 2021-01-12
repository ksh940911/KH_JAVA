package kh.java.gui.swing.container.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class FlowLayoutTest extends JFrame{
	
	public FlowLayoutTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//JPanel의 기본 Layout객체
		JPanel panel = new JPanel();
		//레이아웃 객체에 flowlayout을 새로줌
		//정렬기준 제시 LEFT, RIGHT, CENTER(기본으로 가운데 정렬 되있음)
		/*
         * 기본적으로는 JFrame -> BorderLayout
         *             JPanel -> FlowLayout
         * 필요하다면 짝이 아니더라도, border와 flow를 바꿔쓸 수 있음
		 */
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		for(int i=0; i<15; i++) {
			panel.add(new JButton((i + 1) +"번"));
		}
		
		add(panel);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest(500, 500, "FlowLayoutTest").setVisible(true);
	}
}
