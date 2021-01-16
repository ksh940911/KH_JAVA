package Login.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Login.model.vo.Login;
import util.MyUtil;

public class LoginTable extends JFrame {

	public LoginTable(int w, int h, String title) {
		
		MyUtil.init(this, w, h, title);
		
		List<Login> list = new ArrayList<>();
		
		{
			list.add(new Login("kchief", "sh2394", "김상흥", "ksh940911@naver.com", "man", "hi"));
			list.add(new Login("sh2394", "143fda", "남흥지", "nhj5924@naver.com", "woman", "hi"));
			list.add(new Login("sh2395", "zvcxaf", "갓윤수", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh2397", "zfvxdf", "한요한", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh2392", "zdsfgv", "천현호", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh2396", "sh2394", "김현수", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh2362", "sh2394", "박호준", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh2393", "sh2394", "최이현", "ksh940911@naver.com", "woman", "hi"));
//			list.add(new Login("sh2344", "sh2394", "강나래", "ksh940911@naver.com", "woman", "hi"));
//			list.add(new Login("sh3394", "sh2394", "김연수", "ksh940911@naver.com", "woman", "hi"));
//			list.add(new Login("sh5394", "sh2394", "이우빈", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh7394", "sh2394", "배기원", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh8394", "sh2394", "송민성", "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh9394", "sh2394", "김연주", "ksh940911@naver.com", "woman", "hi"));
//			list.add(new Login("sh3594", "sh2394", "강산" , "ksh940911@naver.com", "man", "hi"));
//			list.add(new Login("sh2694", "sh2394", "최유리", "ksh940911@naver.com", "woman", "hi"));
//			list.add(new Login("sh2894", "sh2394", "박다현", "ksh940911@naver.com", "woman", "hi"));
//			list.add(new Login("sh2994", "sh2394", "강주희", "ksh940911@naver.com", "woman", "hi"));
		}
		
		Object[] columnNames = {"id" , "password", "name", "emailAddress", "gender", "introduce"};
		Object[][] rowData = new Object[list.size()][columnNames.length];
		for(int i=0; i<list.size(); i++) {
			Login l = list.get(i);
			rowData[i][0] = l.getId();
			rowData[i][1] = l.getPassword();
			rowData[i][2] = l.getName();
			rowData[i][3] = l.getEmilAddress();
			rowData[i][4] = l.getGender();
			rowData[i][5] = l.getIntroduce();
		}
		
		JTable table = new JTable(rowData, columnNames);
		
		table.setAutoCreateRowSorter(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	
	}
	public static void main(String[] args) {
		new LoginTable(500, 200, "회원가입한 회원목록").setVisible(true);
	}
}
