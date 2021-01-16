package util;

import javax.swing.JFrame;

import Login.view.TablePanel;


public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) {
		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void init(TablePanel tablePanel, int w, int h, String title) {
		// TODO Auto-generated method stub
		
	}

}
