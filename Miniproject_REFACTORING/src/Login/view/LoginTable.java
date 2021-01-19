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

public class LoginTable extends JFrame {

	public LoginTable(int w, int h, String title) {

		MyUtil.init(this, w, h, title);

		List<Login> list = new ArrayList<Login>(new LoginController().loadId());

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