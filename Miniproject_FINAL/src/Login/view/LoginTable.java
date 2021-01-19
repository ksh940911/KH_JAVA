package Login.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Login.controller.LoginController;
import Login.model.vo.Login;
import util.MyUtil;

//관리자모드에서 로그인 성공하면 실행되는 테이블.
public class LoginTable extends JFrame {
	public LoginTable(int w, int h, String title) {
		MyUtil.init(this, w, h, title);

		List<Login> list = new ArrayList<Login>(new LoginController().loadId());
		{
			list.add(new Login("kdh972", "kcjiv2142", "김동현", "kdh972@naver.com", "man", "하나둘서이 저만믿고따라오십쇼"));
			list.add(new Login("kym2394", "124dfaj", "김영미", "kym2394@naver.com", "woman", "사실 저는 개냥이 다좋아요~"));
			list.add(new Login("kys2901", "asdffsdr22", "김윤수", "kys2901@naver.com", "man", "KH 갓윤수하면 다알지"));
			list.add(new Login("pyhmedic", "ssdvf", "박요한", "pyhmedic@naver.com", "man", "디자인은 내가 최고"));
			list.add(new Login("hunghung97", "124fds", "남흥지", "hunghung97@naver.com", "woman", "흥ㅡㅡ"));
			list.add(new Login("bkw2312", "23412fr3", "배기원", "bkw2312@naver.com", "man", "안녕하세요~ 형 ㅎㅎ"));
			list.add(new Login("sms1231", "31f421f342", "송민성", "sms1231@naver.com", "man", "구경왔지머얌 ㅎㅇㅎㅇ"));
			list.add(new Login("jyj94", "fadsuer21", "전유진", "jyj94@naver.com", "woman", "안녕하세요~ 저도강아지좋아요"));
			list.add(new Login("cch28", "1243f", "천호현", "cch28@naver.com", "man", "사실 A급중 내가 최고다"));
			list.add(new Login("jhj231", "fvqr132", "장호재", "jhj231@naver.com", "man", "안녕하세요 코딩공부중이에요"));
			list.add(new Login("swlee", "avff2341", "이승우", "swlee@naver.com", "man", "ㅎㅇㅇ"));
			list.add(new Login("junghyunp", "s123412", "박정현", "junghyunp@naver.com", "man", "정현입니다 안녕하세요ㅎ"));
			list.add(new Login("kimhs", "1234fdsx", "김한성", "kimhs@naver.com", "woman", "강아지 투표하러왔어요~"));
			list.add(new Login("jungmj", "1234czx12", "정문주", "jungmj@naver.com", "woman", "다치지마세요ㅜㅜ"));
			list.add(new Login("sominju", "acds13dsaz", "주소민", "sominju@naver.com", "woman", "친해집시당~.~"));
			list.add(new Login("yjhwang", "s14251214123", "황윤진", "yjhwang@naver.com", "woman", "안녕하세요!!!!!"));
		}
		Object[] columnNames = { "id", "password", "name", "emailAddress", "gender", "introduce" };
		Object[][] rowData = new Object[list.size()][columnNames.length];
		for (int i = 0; i < list.size(); i++) {
			Login l = list.get(i);
			rowData[i][0] = l.getId();
			rowData[i][1] = l.getPassword();
			rowData[i][2] = l.getName();
			rowData[i][3] = l.getEmailAddress();
			rowData[i][4] = l.getGender();
			rowData[i][5] = l.getIntroduce();
		}
		JTable table = new JTable(rowData, columnNames);

		table.setAutoCreateRowSorter(true);
		table.setPreferredScrollableViewportSize(new Dimension(840, 260));

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

		JButton btn = new JButton("편집한 내용 저장");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int rowLen = model.getRowCount();
				int colLen = model.getColumnCount();

				List<Login> newList = new ArrayList<>();

				for (int i = 0; i < rowLen; i++) {
					Login newL = new Login();
					for (int j = 0; j < colLen; j++) {
						Object data = model.getValueAt(i, j);

						switch (j) {
						case 0:
							newL.setId((String) data);
							break;
						case 1:
							newL.setPassword((String) data);
							break;
						case 2:
							newL.setName((String) data);
							break;
						case 3:
							newL.setEmailAddress((String) data);
							break;
						case 4:
							newL.setGender((String) data);
							break;
						case 5:
							newL.setIntroduce((String) data);
							break;
						}
					}
					newList.add(newL);
				}
				Set<Login> set = new HashSet<>(newList);
				new LoginController().ManagerUserModify(set);
				JOptionPane.showMessageDialog(null, "편집되었습니다");
			}
		});

		add(scrollPane);
		add(btn, BorderLayout.SOUTH);
		pack();
	}
}