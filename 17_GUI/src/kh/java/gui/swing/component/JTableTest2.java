package kh.java.gui.swing.component;


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

import kh.java.gui.util.MyUtil;
/**
 * 테이블모델을 만들거고, 그 안에 데이터가 저장됨
 * JTable(TableModel)
 * - TableModel 데이터가 저장되는 객체, 이벤트핸들링  
 * JScrollPane(JTable)을 추가
 * - 헤더부 노출(표 각각 부분의 항목), 스크롤 기능을 위한 목적
 *
 */
public class JTableTest2 extends JFrame {
	
	//List : 중복허용 -> 쌓여서 들어감!
	List<Member> list = new ArrayList<>();
	{
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list .add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
		list.add(new Member("홍길동", "서울", 24, false));
		list.add(new Member("신사임당", "부산", 48, true));
		list.add(new Member("세종", "서울", 67, true));
	}

	public JTableTest2(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//컬럼정보 - 1차원 배열
		Object[] columnNames = {
				"이름", "주소", "나이", " 결혼여부"	
		};
		//행정보(실제데이터가 해당) - 2차원배열
//		Object[][] rowData = {
//				{"홍길동", "서울", 24, false},	
//				{"신사임당", "부산", 48, true},	
//				{"세종", "서울", 67, true},	
//		};
		//2차원 배열의 공간을 만들어줌 / 이 사이즈, 이 길이만큼의 공간을 만들어줌
		Object[][] rowData = new Object[list.size()][columnNames.length];
		for (int i = 0; i < list.size(); i++) {
			Member m = list.get(i);
			rowData[i][0] = m.getName();
			rowData[i][1] = m.getAddress();
			rowData[i][2] = m.getAge();
			//boolean형의 getter는 not get, but is
			rowData[i][3] = m.isMarried();
			
		}
		
		//테이블 생성
		JTable table = new JTable(rowData, columnNames);
		
		//스크롤페인에 추가
		JScrollPane scrollPane = new JScrollPane(table);
		
		//헤더 클릭시 정렬기능
		table.setAutoCreateRowSorter(true);
		
		//viewport 지정 / dimension은 너비높이 객체가 있는 객체
		//viewport는 보여지는 부분을 정해놓음
		//데이터가 많을때, 보여지는 부분이 정해져있다면, 스크롤이 생김
		table.setPreferredScrollableViewportSize(new Dimension(500,100));
		
		//셀 편집 시 이벤트 처리하기
		TableModel model = table.getModel();
		model.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				//몇행 몇열의 데이터가 변경되었는지 알아보기
				//꼭 변경되지 않아도, 포커스를가졌다가 잃을때, 콘솔창에 행,열 정보(몇행 몇행이 바뀌었는지)가 출력됨
				int row = e.getFirstRow();
				int col = e.getColumn();
//				System.out.println(row + ", " + col);
				//실제 값의 변경을 알아보기
				//꼭 변경되지 않아도, 포커스를가졌다가 잃을때, 콘솔창에 바뀐 데이터가 출력됨
				Object data = model.getValueAt(row, col);
				System.out.println(data);
			}
		});
		
		//하단 저장 버튼
		JButton btn = new JButton("저장");
		//버튼은 actionlistener!
		btn.addActionListener(new ActionListener() {
			//데이터를 다 읽어와야하고
			//실제 데이터가 저장되어있는 모델에 접근해야 함
			@Override
			public void actionPerformed(ActionEvent e) {
									//행과 열의 길이
				int rowLen = model.getRowCount();
				int colLen = model.getColumnCount();
				
				//행, 열의 정보를 알아냈으면, 중첩반복문을 이용해서
				List<Member> newList = new ArrayList<Member>();
				for (int i = 0; i < rowLen; i++) {
					Member newMember = new Member();
					for (int j = 0; j <colLen ; j++) {
						Object data = model.getValueAt(i, j);
						System.out.println(data);
						switch (j) {
						case 0 : newMember.setName((String)data); break;
						case 1 : newMember.setAddress((String)data); break;
						case 2 : newMember.setAge(Integer.parseInt(data.toString())); break;
						case 3 : newMember.setMarried((boolean)data); break;
						}
					
				}
					newList.add(newMember);
				}
				
				for (Member newMember : newList) {
					System.out.println(newMember);
				}
			}
		});
		add(scrollPane);
		add(btn, BorderLayout.SOUTH);
		pack();
	}

	public static void main(String[] args) {
			new JTableTest2(500, 200, "JTable").setVisible(true);
	}

}