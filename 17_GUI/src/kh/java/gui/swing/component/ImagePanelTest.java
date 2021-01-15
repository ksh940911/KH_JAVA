package kh.java.gui.swing.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class ImagePanelTest extends JFrame {

	public ImagePanelTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
//		//이미지사용하기
//		JLabel container = new JLabel(new ImageIcon("images/cat.PNG"));
//		add(container);
//		pack();//실제 컴포넌트의 크기에 맞게 컨테이너의 크기를 확대/축소한다.
		
		ImagePanel panel = new ImagePanel("images/background.jpg");
		JButton btn = new JButton("안녕"); 
		panel.add(btn);
		add(panel);
		pack();
	}
	
	public class ImagePanel extends JPanel {

		private BufferedImage image;
		private int w;
		private int h;
		
		public ImagePanel(String fileName) {
			
			try {
				image = ImageIO.read(new File(fileName));
				w = image.getWidth();
				h = image.getHeight();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * 현재 패널크기를 백그라운드 이미지의 크기로 지정 ->외부적으로 호출되어 사용됨
		 */
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w, h);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//image객체를 x,y값만큼 간격으로 떨어뜨려(offset) 그리기
			//image,떨어뜨릴 너비, null
			//boolean java.awt.Graphics.drawImage(Image img, int x, int y, ImageObserver observer)
			g.drawImage(image, 0, 0, null); //offset-> 0,0 left,top부터 꽉차게 그림
		}
	}
	
	public static void main(String[] args) {
		new ImagePanelTest(500,500,"백그라운드 이미지").setVisible(true);
	}
}