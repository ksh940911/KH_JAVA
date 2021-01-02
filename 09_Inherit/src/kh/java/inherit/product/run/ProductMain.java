package kh.java.inherit.product.run;

import kh.java.inherit.product.model.vo.Desktop;
import kh.java.inherit.product.model.vo.SmartPhone;
import kh.java.inherit.product.model.vo.TV;

public class ProductMain {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "삼성대땅", 1_000_000, "windows10", "UHD 커브드", "기계식키보드");
		System.out.println(d.getDesktopInfo());
		System.out.println(d);
		
		SmartPhone s = new SmartPhone("애플", "iPhone", 500_000, "ios14", "KT"); 
		System.out.println(s.getSmartPhoneInfo());
		
		TV tv = new TV("LG", "LG 롤러블 TV", 1_000_000_000, 100 , 30);
		System.out.println(tv.getTVInfo());
	}
 
}
