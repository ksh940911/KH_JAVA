package Login.run;

import Login.controller.LoginController;
import Login.view.LoginFrame;

public class Run {

	public static void main(String[] args) {
		new LoginFrame(700, 400, "Puppy World").setVisible(true);
		System.out.println("매니저 계정 : "+new LoginController().loadManagerId());
		System.out.println(new LoginController().loadId());
	}
}
