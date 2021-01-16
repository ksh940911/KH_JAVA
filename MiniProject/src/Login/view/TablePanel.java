package Login.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Login.model.vo.Login;
import util.MyUtil;

public class TablePanel extends JFrame{
	
	List<Login> list = new ArrayList<>();
	
	{
		list.add(new Login("kchief", "sh2394", "김상흥", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2394", "143fda", "남흥지", "nhj5924@naver.com", "woman", "hi"));
		list.add(new Login("sh2395", "zvcxaf", "갓윤수", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2397", "zfvxdf", "한요한", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2392", "zdsfgv", "천현호", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2396", "sh2394", "김현수", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2362", "sh2394", "박호준", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2393", "sh2394", "최이현", "ksh940911@naver.com", "woman", "hi"));
		list.add(new Login("sh2344", "sh2394", "강나래", "ksh940911@naver.com", "woman", "hi"));
		list.add(new Login("sh3394", "sh2394", "김연수", "ksh940911@naver.com", "woman", "hi"));
		list.add(new Login("sh5394", "sh2394", "이우빈", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh7394", "sh2394", "배기원", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh8394", "sh2394", "송민성", "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh9394", "sh2394", "김연주", "ksh940911@naver.com", "woman", "hi"));
		list.add(new Login("sh3594", "sh2394", "강산" , "ksh940911@naver.com", "man", "hi"));
		list.add(new Login("sh2694", "sh2394", "최유리", "ksh940911@naver.com", "woman", "hi"));
		list.add(new Login("sh2894", "sh2394", "박다현", "ksh940911@naver.com", "woman", "hi"));
		list.add(new Login("sh2994", "sh2394", "강주희", "ksh940911@naver.com", "woman", "hi"));
	}
	
	public TablePanel(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
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
		
		table.setPreferredScrollableViewportSize(new Dimension(500,100));
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		TableModel model = table.getModel();
		model.addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
				int col = e.getColumn();
				Object data = model.getValueAt(row, col);
				System.out.println(data);
			}
		});
		
		JButton btn = new JButton("저장");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int rowLen = model.getRowCount();
				int colLen = model.getColumnCount();
				
				List<Login> newList = new ArrayList<>();
				
				for(int i=0; i<rowLen; i++) {
					Login newLogin = new Login();
					for(int j=0; j<colLen; j++) {
						Object data = model.getValueAt(i, j);
						switch(j) {
						case 0: newLogin.setId((String)data);break;
						case 1: newLogin.setPassword((String)data);break;
						case 2: newLogin.setName((String)data);break;
						case 3: newLogin.setEmilAddress((String)data);break;
						case 4: newLogin.setGender((String)data);break;
						case 5: newLogin.setIntroduce((String)data);break;
						}
						newList.add(newLogin);
					}
				}
				for(Login newLogin : newList)
					System.out.println(newLogin);
			}
		});
		
		add(scrollPane);
		add(btn, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new TablePanel(500, 200, "JTable").setVisible(true);
	}
}