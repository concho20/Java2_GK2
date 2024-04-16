
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.LineBorder;



public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton QL_Order;
	private JButton QL_Kho;
	private JButton QL_NV;
	
	private JTable table_bill ;
	
	private JPanel panel_tang;
	private JPanel cardPanel_2;
	private JPanel cardPanel_TrangOder;
	private JPanel cardPanel_Kho;
	private JPanel cardPanel_QLNV;
	private JPanel cardPanel_tang;
	private JPanel panel_tang1;
	private JButton butonban1;
	private JButton butonban2;
	private JButton butonban3;
	private JButton butonban4;
	private JButton butonban5;
	private JButton butonban6;
	private JButton butonban7;
	private JButton butonban9;
	private JButton butonban8;
	private JButton butonban10;
	private JPanel panel_Mon;
	private JButton bt_Nuoc;
	private JPanel cardPanel_mon;
	private JPanel panel_Nuong;
	private JPanel panel_Lau;
	private JPanel panel_MonChinh;
	private JPanel panel_TrangMieng;
	private JPanel card_Panel_bill;
	private JButton bt_Nuong;
	private JButton bt_Lau;
	private JButton bt_MonChinh;
	private JButton bt_TrangMieng;
	private JPanel panel_Nuoc;
	private JLabel lblban;
	private JButton bt_Tang1;
	private JButton bt_Tang2;
	private JPanel panel_tang2;
	private JButton butonban1_2;
	private JButton butonban2_2;
	private JButton butonban3_2;
	private JButton butonban4_2;
	private JButton butonban5_2;
	private JButton butonban6_2;
	private JButton butonban7_2;
	private JButton butonban9_2;
	private JButton butonban8_2;
	private JButton butonban10_2;
	private JTable table_MucLuong;
	private JTable table_BangLuong;
	private JButton bt_Nuoc1;
	private JButton bt_Nuoc2;
	private JButton bt_Nuoc3;
	private JButton bt_Nuoc4;
	private JButton bt_Nuoc5;
	private JButton bt_Nuoc6;
	private JButton bt_Nuoc7;
	private JButton bt_Nuoc8;
	private JButton bt_TrangMieng1;
	private JButton bt_TrangMieng2;
	private JButton bt_TrangMieng3;
	private JButton bt_TrangMieng4;
	private JButton bt_TrangMieng5;
	private JButton bt_TrangMieng6;
	private JButton bt_TrangMieng7;
	private JButton bt_TrangMieng8;
	private JTextField tf_VTCV;
	private JTextField tf_ML;
	private JButton bt_TinhLuong;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton bt_Tim;
	private JButton bt_ChinSua;
	private JButton bt_Xoa2;
	private JButton bt_Chinh1;
	private JButton bt_Chinh2;
	private JButton bt_Chinh3;
	private JButton bt_Chinh4;
	private JButton bt_Chinh5;
	private JButton bt_Chinh6;
	private JButton bt_Chinh7;
	private JButton bt_Chinh8;
	private JButton bt_Lau1;
	private JButton bt_Lau2;
	private JButton bt_Lau3;
	private JButton bt_Lau4;
	private JButton bt_Lau5;
	private JButton bt_Lau6;
	private JButton bt_Lau7;
	private JButton bt_Lau8;
	private JButton bt_Nuong1;
	private JButton bt_Nuong2;
	private JButton bt_Nuong3;
	private JButton bt_Nuong4;
	private JButton bt_Nuong5;
	private JButton bt_Nuong6;
	private JButton bt_Nuong7;
	private JButton bt_Nuong8;
	private JPanel panel;
	private JButton bt_In;
	private JScrollPane scrollPane_bill;
	private JLabel lbl2_Ban12;
	private JLabel lbl2_Ban13;
	private JLabel lbl2_Ban14;
	private JLabel lbl2_Ban15;
	private JLabel lbl2_Ban16;
	private JLabel lbl2_Ban17;
	private JLabel lbl2_Ban18;
	private JLabel lbl2_Ban19;
	private JLabel lbl2_Ban20;
	private JPanel pannel_logo;
	static JLabel lblthanhtien;
	
	String tablebill;
	private JLabel lbl_Nuoc5;
	private JLabel lbl_Nuoc6;
	private JLabel lbl_Nuoc7;
	private JLabel lbl_TenNuoc2;
	private JLabel lbl_TenNuoc3;
	private JLabel lbl_TenNuoc4;
	private JLabel lbl_TenNuoc5;
	private JLabel lbl_TenNuoc6;
	private JLabel lbl_TenNuoc7;
	private JLabel lbl_TenNuoc8;
	private JLabel lbl_Nuoc8;
	private JScrollPane spBL;
	private JLabel lbl_BangLuong;
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1574, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 124, 217));
		panel_1.setBounds(0, 0, 1560, 50);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		QL_Order = new JButton("ORDERS");
		QL_Order.setFont(new Font("Tahoma", Font.BOLD, 15));
		QL_Order.setForeground(Color.WHITE);
		QL_Order.setBackground(new Color(0, 124, 217));
		QL_Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(true);
				cardPanel_Kho.setVisible(false);
				cardPanel_QLNV.setVisible(false);
			}
		});
		QL_Order.setBounds(0, 0, 192, 50);
		panel_1.add(QL_Order);
		
		QL_Kho = new JButton("QL KHO");
		QL_Kho.setFont(new Font("Tahoma", Font.BOLD, 15));
		QL_Kho.setForeground(Color.WHITE);
		QL_Kho.setBackground(new Color(0, 124, 217));
		QL_Kho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(false);
				cardPanel_Kho.setVisible(true);
				cardPanel_QLNV.setVisible(false);				
			}
		});
		QL_Kho.setBounds(192, 0, 192, 50);
		panel_1.add(QL_Kho);
		
		QL_NV = new JButton("QL NHÂN VIÊN");
		QL_NV.setFont(new Font("Tahoma", Font.BOLD, 15));
		QL_NV.setForeground(Color.WHITE);
		QL_NV.setBackground(new Color(0, 124, 217));
		QL_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(false);
				cardPanel_Kho.setVisible(false);
				cardPanel_QLNV.setVisible(true);
			}
		});
		QL_NV.setBounds(384, 0, 192, 50);
		panel_1.add(QL_NV);
		
		cardPanel_2 = new JPanel();
		cardPanel_2.setBounds(0, 50, 1558, 733);
		contentPane.add(cardPanel_2);
		cardPanel_2.setLayout(new CardLayout(0, 0));
		
		cardPanel_TrangOder = new JPanel();
		cardPanel_TrangOder.setBackground(new Color(30, 144, 255));
		cardPanel_TrangOder.setLayout(null);
		cardPanel_2.add(cardPanel_TrangOder, "name_1003617356376700");
		cardPanel_TrangOder.setVisible(true);
		
		cardPanel_tang = new JPanel();
		cardPanel_tang.setBounds(0, 47, 1070, 334);
		cardPanel_TrangOder.add(cardPanel_tang);
		cardPanel_tang.setLayout(new CardLayout(0, 0));
		
		panel_tang1 = new JPanel();
		panel_tang1.setLayout(null);
		panel_tang1.setBackground(Color.WHITE);
		cardPanel_tang.add(panel_tang1, "name_1003797966362000");
		panel_tang1.setVisible(true);
		
		butonban1 = new JButton("Bàn 1");
		butonban1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 1");
				card_Panel_bill.setVisible(true);
				tablebill = "bill_ban1";
				DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
		        table_bill.setModel(modelk);
			}
		});
		butonban1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1.setBounds(60, 24, 94, 86);
		panel_tang1.add(butonban1);
		
		butonban2 = new JButton("Bàn 2");
		butonban2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 2");
				card_Panel_bill.setVisible(true);
				tablebill = "bill_ban2";
				DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
		        table_bill.setModel(modelk);
				
			}
		});
		butonban2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2.setBounds(274, 24, 94, 86);
		panel_tang1.add(butonban2);
		
		butonban3 = new JButton("Bàn 3");
		butonban3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 3");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3.setBounds(488, 24, 94, 86);
		panel_tang1.add(butonban3);
		
		butonban4 = new JButton("Bàn 4");
		butonban4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 4");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4.setBounds(702, 24, 94, 86);
		panel_tang1.add(butonban4);
		
		butonban5 = new JButton("Bàn 5");
		butonban5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 5");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5.setBounds(916, 24, 94, 86);
		panel_tang1.add(butonban5);
		
		butonban6 = new JButton("Bàn 6");
		butonban6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 6");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6.setBounds(60, 176, 94, 86);
		panel_tang1.add(butonban6);
		
		butonban7 = new JButton("Bàn 7");
		butonban7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 7");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7.setBounds(274, 176, 94, 86);
		panel_tang1.add(butonban7);
		
		butonban9 = new JButton("Bàn 9");
		butonban9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 9");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9.setBounds(702, 176, 94, 86);
		panel_tang1.add(butonban9);
		
		butonban8 = new JButton("Bàn 8");
		butonban8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 8");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8.setBounds(488, 176, 94, 86);
		panel_tang1.add(butonban8);
		
		butonban10 = new JButton("Bàn 10");
		butonban10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 10");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10.setBounds(916, 176, 96, 86);
		panel_tang1.add(butonban10);
		
		JLabel lbl1_Ban1 = new JLabel("Bàn 1");
		lbl1_Ban1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban1.setBounds(60, 111, 96, 30);
		panel_tang1.add(lbl1_Ban1);
		
		JLabel lbl1_Ban2 = new JLabel("Bàn 2");
		lbl1_Ban2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban2.setBounds(274, 111, 96, 30);
		panel_tang1.add(lbl1_Ban2);
		
		JLabel lbl1_Ban3 = new JLabel("Bàn 3");
		lbl1_Ban3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban3.setBounds(488, 111, 96, 30);
		panel_tang1.add(lbl1_Ban3);
		
		JLabel lbl1_Ban4 = new JLabel("Bàn 4");
		lbl1_Ban4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban4.setBounds(702, 111, 96, 30);
		panel_tang1.add(lbl1_Ban4);
		
		JLabel lbl1_Ban5 = new JLabel("Bàn 5");
		lbl1_Ban5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban5.setBounds(916, 111, 96, 30);
		panel_tang1.add(lbl1_Ban5);
		
		JLabel lbl1_Ban6 = new JLabel("Bàn 6");
		lbl1_Ban6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban6.setBounds(60, 262, 96, 30);
		panel_tang1.add(lbl1_Ban6);
		
		JLabel lbl1_Ban7 = new JLabel("Bàn 7");
		lbl1_Ban7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban7.setBounds(274, 262, 96, 30);
		panel_tang1.add(lbl1_Ban7);
		
		JLabel lbl1_Ban8 = new JLabel("Bàn 8");
		lbl1_Ban8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban8.setBounds(488, 262, 96, 30);
		panel_tang1.add(lbl1_Ban8);
		
		JLabel lbl1_Ban9 = new JLabel("Bàn 9");
		lbl1_Ban9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban9.setBounds(702, 262, 96, 30);
		panel_tang1.add(lbl1_Ban9);
		
		JLabel lbl1_Ban10 = new JLabel("Bàn 10");
		lbl1_Ban10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1_Ban10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_Ban10.setBounds(916, 262, 96, 30);
		panel_tang1.add(lbl1_Ban10);
		
		panel_tang2 = new JPanel();
		panel_tang2.setLayout(null);
		panel_tang2.setBackground(Color.WHITE);
		cardPanel_tang.add(panel_tang2, "name_1003797975289700");
		panel_tang2.setVisible(false);
		
		butonban1_2 = new JButton("Bàn 11");
		butonban1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 11");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1_2.setBounds(60, 24, 96, 86);
		panel_tang2.add(butonban1_2);
		
		butonban2_2 = new JButton("Bàn 12");
		butonban2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 12");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2_2.setBounds(274, 24, 96, 86);
		panel_tang2.add(butonban2_2);
		
		butonban3_2 = new JButton("Bàn 13");
		butonban3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 13");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3_2.setBounds(488, 24, 96, 86);
		panel_tang2.add(butonban3_2);
		
		butonban4_2 = new JButton("Bàn 14");
		butonban4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 14");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4_2.setBounds(702, 24, 96, 86);
		panel_tang2.add(butonban4_2);
		
		butonban5_2 = new JButton("Bàn 15");
		butonban5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 15");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban5_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5_2.setBounds(916, 24, 96, 86);
		panel_tang2.add(butonban5_2);
		
		butonban6_2 = new JButton("Bàn 16");
		butonban6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 16");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6_2.setBounds(60, 176, 96, 86);
		panel_tang2.add(butonban6_2);
		
		butonban7_2 = new JButton("Bàn 17");
		butonban7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 17");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban7_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7_2.setBounds(274, 176, 96, 86);
		panel_tang2.add(butonban7_2);
		
		butonban9_2 = new JButton("Bàn 19");
		butonban9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 19");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban9_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9_2.setBounds(702, 176, 96, 86);
		panel_tang2.add(butonban9_2);
		
		butonban8_2 = new JButton("Bàn 18");
		butonban8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 18");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8_2.setBounds(488, 176, 96, 86);
		panel_tang2.add(butonban8_2);
		
		butonban10_2 = new JButton("Bàn 20");
		butonban10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblban.setText("Bàn 20");
				card_Panel_bill.setVisible(true);
			}
		});
		butonban10_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10_2.setBounds(916, 176, 96, 86);
		panel_tang2.add(butonban10_2);
		
		JLabel lbl2_Ban11 = new JLabel("Bàn 11");
		lbl2_Ban11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban11.setBounds(60, 110, 96, 30);
		panel_tang2.add(lbl2_Ban11);
		
		lbl2_Ban12 = new JLabel("Bàn 12");
		lbl2_Ban12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban12.setBounds(274, 110, 96, 30);
		panel_tang2.add(lbl2_Ban12);
		
		lbl2_Ban13 = new JLabel("Bàn 13");
		lbl2_Ban13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban13.setBounds(488, 110, 96, 30);
		panel_tang2.add(lbl2_Ban13);
		
		lbl2_Ban14 = new JLabel("Bàn 14");
		lbl2_Ban14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban14.setBounds(702, 110, 96, 30);
		panel_tang2.add(lbl2_Ban14);
		
		lbl2_Ban15 = new JLabel("Bàn 15");
		lbl2_Ban15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban15.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban15.setBounds(916, 110, 96, 30);
		panel_tang2.add(lbl2_Ban15);
		
		lbl2_Ban16 = new JLabel("Bàn 16");
		lbl2_Ban16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban16.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban16.setBounds(60, 263, 96, 30);
		panel_tang2.add(lbl2_Ban16);
		
		lbl2_Ban17 = new JLabel("Bàn 17");
		lbl2_Ban17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban17.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban17.setBounds(274, 263, 96, 30);
		panel_tang2.add(lbl2_Ban17);
		
		lbl2_Ban18 = new JLabel("Bàn 18");
		lbl2_Ban18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban18.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban18.setBounds(488, 263, 96, 30);
		panel_tang2.add(lbl2_Ban18);
		
		lbl2_Ban19 = new JLabel("Bàn 19");
		lbl2_Ban19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban19.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban19.setBounds(702, 263, 96, 30);
		panel_tang2.add(lbl2_Ban19);
		
		lbl2_Ban20 = new JLabel("Bàn 20");
		lbl2_Ban20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2_Ban20.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2_Ban20.setBounds(916, 263, 96, 30);
		panel_tang2.add(lbl2_Ban20);
		
		panel_tang = new JPanel();
		panel_tang.setBounds(0, 0, 1070, 48);
		cardPanel_TrangOder.add(panel_tang);
		panel_tang.setBackground(new Color(30, 144, 255));
		panel_tang.setLayout(null);
		
		bt_Tang1 = new JButton("TẦNG 1");
		bt_Tang1.setForeground(Color.WHITE);
		bt_Tang1.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt_Tang1.setBackground(new Color(30, 144, 255));
		bt_Tang1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_tang1.setVisible(true);
				panel_tang2.setVisible(false);
			}
		});
		bt_Tang1.setBounds(0, 0, 151, 48);
		panel_tang.add(bt_Tang1);
		
		bt_Tang2 = new JButton("TẦNG 2");
		bt_Tang2.setForeground(Color.WHITE);
		bt_Tang2.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt_Tang2.setBackground(new Color(30, 144, 255));
		bt_Tang2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_tang1.setVisible(false);
				panel_tang2.setVisible(true);
			}
		});
		bt_Tang2.setBounds(151, 0, 151, 48);
		panel_tang.add(bt_Tang2);
		
		panel_Mon = new JPanel();
		panel_Mon.setBackground(new Color(30, 144, 255));
		panel_Mon.setLayout(null);
		panel_Mon.setBounds(0, 381, 1070, 48);
		cardPanel_TrangOder.add(panel_Mon);
		
		bt_Nuoc = new JButton("NƯỚC");
		bt_Nuoc.setForeground(Color.WHITE);
		bt_Nuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(true);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Nuoc.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_Nuoc.setBackground(new Color(30, 144, 255));
		bt_Nuoc.setBounds(0, 0, 152, 48);
		panel_Mon.add(bt_Nuoc);
		
		bt_Nuong = new JButton("NƯỚNG");
		bt_Nuong.setForeground(Color.WHITE);
		bt_Nuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(true);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Nuong.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_Nuong.setBackground(new Color(30, 144, 255));
		bt_Nuong.setBounds(152, 0, 152, 48);
		panel_Mon.add(bt_Nuong);
		
		bt_Lau = new JButton("LẨU");
		bt_Lau.setForeground(Color.WHITE);
		bt_Lau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(true);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Lau.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_Lau.setBackground(new Color(30, 144, 255));
		bt_Lau.setBounds(304, 0, 152, 48);
		panel_Mon.add(bt_Lau);
		
		bt_MonChinh = new JButton("MÓN CHÍNH");
		bt_MonChinh.setForeground(Color.WHITE);
		bt_MonChinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(true);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_MonChinh.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_MonChinh.setBackground(new Color(30, 144, 255));
		bt_MonChinh.setBounds(456, 0, 152, 48);
		panel_Mon.add(bt_MonChinh);
		
		bt_TrangMieng = new JButton("TRÁNG MIỆNG");
		bt_TrangMieng.setForeground(Color.WHITE);
		bt_TrangMieng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(true);
			}
		});
		bt_TrangMieng.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_TrangMieng.setBackground(new Color(30, 144, 255));
		bt_TrangMieng.setBounds(608, 0, 180, 48);
		panel_Mon.add(bt_TrangMieng);
		
		cardPanel_mon = new JPanel();
		cardPanel_mon.setBounds(0, 427, 1070, 306);
		cardPanel_TrangOder.add(cardPanel_mon);
		cardPanel_mon.setLayout(new CardLayout(0, 0));
		
		panel_Nuong = new JPanel();
		panel_Nuong.setBackground(Color.WHITE);
		cardPanel_mon.add(panel_Nuong, "name_1003838081420800");
		panel_Nuong.setLayout(null);
		
		bt_Nuong1 = new JButton("beer");
		
		bt_Nuong1.addActionListener(new ActionListener() {
		int a;
			public void actionPerformed(ActionEvent e) {
				a = 1;
			    String tenhang = "Beer";
			    int dongia = 15000;
			    int soluong = 1;
			    int thanhtien = dongia * soluong;
			    model md = new model(tenhang, dongia, soluong, thanhtien);

			    try {
			    	for (int i = 1; i < 21; i++) {
						if(lblban.getText() == "Bàn " + i) {
							tablebill = "bill_ban" + i;
						}
					}
			    	
			        controller.insert(md,tablebill); // Thêm mục mới vào cơ sở dữ liệu

			        DefaultTableModel modelk = AddTable.AddTable_bill(tablebill);
			        table_bill.setModel(modelk); // Cập nhật dữ liệu trên bảng sau khi thêm vào cơ sở dữ liệu
			    } catch (SQLException e1) {
			        e1.printStackTrace();
			    }	   
		    
			}
		});
		bt_Nuong1.setBounds(132, 11, 89, 70);
		panel_Nuong.add(bt_Nuong1);
		
		bt_Nuong2 = new JButton("New button");
		bt_Nuong2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Nuong2.setBounds(371, 11, 89, 70);
		panel_Nuong.add(bt_Nuong2);
		
		bt_Nuong3 = new JButton("New button");
		bt_Nuong3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Nuong3.setBounds(610, 11, 89, 70);
		panel_Nuong.add(bt_Nuong3);
		
		bt_Nuong4 = new JButton("New button");
		bt_Nuong4.setBounds(849, 11, 89, 70);
		panel_Nuong.add(bt_Nuong4);
		
		bt_Nuong5 = new JButton("New button");
		bt_Nuong5.setBounds(132, 168, 89, 70);
		panel_Nuong.add(bt_Nuong5);
		
		bt_Nuong6 = new JButton("New button");
		bt_Nuong6.setBounds(371, 168, 89, 70);
		panel_Nuong.add(bt_Nuong6);
		
		bt_Nuong7 = new JButton("New button");
		bt_Nuong7.setBounds(610, 168, 89, 70);
		panel_Nuong.add(bt_Nuong7);
		
		bt_Nuong8 = new JButton("New button");
		bt_Nuong8.setBounds(849, 168, 89, 70);
		panel_Nuong.add(bt_Nuong8);
		
		JLabel lbl_TenNuoc1 = new JLabel("Bàn 6");
		lbl_TenNuoc1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc1.setBounds(88, 106, 173, 25);
		panel_Nuong.add(lbl_TenNuoc1);
		
		JLabel lbl_Nuoc1 = new JLabel("Bàn 6");
		lbl_Nuoc1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc1.setBounds(88, 81, 173, 25);
		panel_Nuong.add(lbl_Nuoc1);
		
		JLabel lbl_Nuoc2 = new JLabel("Bàn 6");
		lbl_Nuoc2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc2.setBounds(326, 81, 173, 25);
		panel_Nuong.add(lbl_Nuoc2);
		
		JLabel lbl_Nuoc3 = new JLabel("Bàn 6");
		lbl_Nuoc3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc3.setBounds(567, 81, 173, 25);
		panel_Nuong.add(lbl_Nuoc3);
		
		JLabel lbl_Nuoc4 = new JLabel("Bàn 6");
		lbl_Nuoc4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc4.setBounds(810, 81, 173, 25);
		panel_Nuong.add(lbl_Nuoc4);
		
		lbl_Nuoc5 = new JLabel("Bàn 6");
		lbl_Nuoc5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc5.setBounds(88, 237, 173, 25);
		panel_Nuong.add(lbl_Nuoc5);
		
		lbl_Nuoc6 = new JLabel("Bàn 6");
		lbl_Nuoc6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc6.setBounds(326, 237, 173, 25);
		panel_Nuong.add(lbl_Nuoc6);
		
		lbl_Nuoc7 = new JLabel("Bàn 6");
		lbl_Nuoc7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc7.setBounds(567, 237, 173, 25);
		panel_Nuong.add(lbl_Nuoc7);
		
		lbl_TenNuoc2 = new JLabel("Bàn 6");
		lbl_TenNuoc2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc2.setBounds(326, 106, 173, 25);
		panel_Nuong.add(lbl_TenNuoc2);
		
		lbl_TenNuoc3 = new JLabel("Bàn 6");
		lbl_TenNuoc3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc3.setBounds(567, 106, 173, 25);
		panel_Nuong.add(lbl_TenNuoc3);
		
		lbl_TenNuoc4 = new JLabel("Bàn 6");
		lbl_TenNuoc4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc4.setBounds(810, 106, 173, 25);
		panel_Nuong.add(lbl_TenNuoc4);
		
		lbl_TenNuoc5 = new JLabel("Bàn 6");
		lbl_TenNuoc5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc5.setBounds(88, 263, 173, 25);
		panel_Nuong.add(lbl_TenNuoc5);
		
		lbl_TenNuoc6 = new JLabel("Bàn 6");
		lbl_TenNuoc6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc6.setBounds(326, 263, 173, 25);
		panel_Nuong.add(lbl_TenNuoc6);
		
		lbl_TenNuoc7 = new JLabel("Bàn 6");
		lbl_TenNuoc7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc7.setBounds(567, 263, 173, 25);
		panel_Nuong.add(lbl_TenNuoc7);
		
		lbl_TenNuoc8 = new JLabel("Bàn 6");
		lbl_TenNuoc8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TenNuoc8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_TenNuoc8.setBounds(810, 263, 173, 25);
		panel_Nuong.add(lbl_TenNuoc8);
		
		lbl_Nuoc8 = new JLabel("Bàn 6");
		lbl_Nuoc8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nuoc8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Nuoc8.setBounds(810, 237, 173, 25);
		panel_Nuong.add(lbl_Nuoc8);
		panel_Nuong.setVisible(false);
		
		panel_Lau = new JPanel();
		panel_Lau.setBackground(Color.WHITE);
		cardPanel_mon.add(panel_Lau, "name_1003838090254500");
		panel_Lau.setLayout(null);
		
		bt_Lau1 = new JButton("New button");
		bt_Lau1.setBounds(132, 11, 89, 70);
		panel_Lau.add(bt_Lau1);
		
		bt_Lau2 = new JButton("New button");
		bt_Lau2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Lau2.setBounds(371, 11, 89, 70);
		panel_Lau.add(bt_Lau2);
		
		bt_Lau3 = new JButton("New button");
		bt_Lau3.setBounds(610, 11, 89, 70);
		panel_Lau.add(bt_Lau3);
		
		bt_Lau4 = new JButton("New button");
		bt_Lau4.setBounds(849, 11, 89, 70);
		panel_Lau.add(bt_Lau4);
		
		bt_Lau5 = new JButton("New button");
		bt_Lau5.setBounds(132, 168, 89, 70);
		panel_Lau.add(bt_Lau5);
		
		bt_Lau6 = new JButton("New button");
		bt_Lau6.setBounds(371, 168, 89, 70);
		panel_Lau.add(bt_Lau6);
		
		bt_Lau7 = new JButton("New button");
		bt_Lau7.setBounds(610, 168, 89, 70);
		panel_Lau.add(bt_Lau7);
		
		bt_Lau8 = new JButton("New button");
		bt_Lau8.setBounds(849, 168, 89, 70);
		panel_Lau.add(bt_Lau8);
		panel_Lau.setVisible(false);
		
		
		panel_MonChinh = new JPanel();
		panel_MonChinh.setBackground(Color.WHITE);
		cardPanel_mon.add(panel_MonChinh, "name_1003838098481500");
		panel_MonChinh.setLayout(null);
		
		bt_Chinh1 = new JButton("New button");
		bt_Chinh1.setBounds(132, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh1);
		
		bt_Chinh2 = new JButton("New button");
		bt_Chinh2.setBounds(371, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh2);
		
		bt_Chinh3 = new JButton("New button");
		bt_Chinh3.setBounds(610, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh3);
		
		bt_Chinh4 = new JButton("New button");
		bt_Chinh4.setBounds(849, 11, 89, 70);
		panel_MonChinh.add(bt_Chinh4);
		
		bt_Chinh5 = new JButton("New button");
		bt_Chinh5.setBounds(132, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh5);
		
		bt_Chinh6 = new JButton("New button");
		bt_Chinh6.setBounds(371, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh6);
		
		bt_Chinh7 = new JButton("New button");
		bt_Chinh7.setBounds(610, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh7);
		
		bt_Chinh8 = new JButton("New button");
		bt_Chinh8.setBounds(849, 168, 89, 70);
		panel_MonChinh.add(bt_Chinh8);
		panel_MonChinh.setVisible(false);
		
		panel_TrangMieng = new JPanel();
		panel_TrangMieng.setBackground(Color.WHITE);
		cardPanel_mon.add(panel_TrangMieng, "name_1003838108290000");
		panel_TrangMieng.setLayout(null);
		
		bt_TrangMieng1 = new JButton("New button");
		bt_TrangMieng1.setIcon(new ImageIcon("D:\\StudyAtSchool\\Downloads\\Picture\\1.jpg"));
		bt_TrangMieng1.setBounds(132, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng1);
		
		bt_TrangMieng2 = new JButton("New button");
		bt_TrangMieng2.setBounds(371, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng2);
		
		bt_TrangMieng3 = new JButton("New button");
		bt_TrangMieng3.setBounds(610, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng3);
		
		bt_TrangMieng4 = new JButton("New button");
		bt_TrangMieng4.setBounds(849, 11, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng4);
		
		bt_TrangMieng5 = new JButton("New button");
		bt_TrangMieng5.setBounds(132, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng5);
		
		bt_TrangMieng6 = new JButton("New button");
		bt_TrangMieng6.setBounds(371, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng6);
		
		bt_TrangMieng7 = new JButton("New button");
		bt_TrangMieng7.setBounds(610, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng7);
		
		bt_TrangMieng8 = new JButton("New button");
		bt_TrangMieng8.setBounds(849, 168, 89, 70);
		panel_TrangMieng.add(bt_TrangMieng8);
		panel_TrangMieng.setVisible(false);
		
		panel_Nuoc = new JPanel();
		panel_Nuoc.setBackground(Color.WHITE);
		cardPanel_mon.add(panel_Nuoc, "name_1003838116760100");
		
		bt_Nuoc1 = new JButton("New button");
		bt_Nuoc1.setBounds(132, 11, 89, 70);
		bt_Nuoc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Nuoc.setLayout(null);
		panel_Nuoc.add(bt_Nuoc1);
		
		bt_Nuoc2 = new JButton("New button");
		bt_Nuoc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_Nuoc2.setBounds(371, 11, 89, 70);
		panel_Nuoc.add(bt_Nuoc2);
		
		bt_Nuoc3 = new JButton("New button");
		bt_Nuoc3.setBounds(610, 11, 89, 70);
		bt_Nuoc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Nuoc.add(bt_Nuoc3);
		
		bt_Nuoc4 = new JButton("New button");
		bt_Nuoc4.setBounds(849, 11, 89, 70);
		panel_Nuoc.add(bt_Nuoc4);
		
		bt_Nuoc5 = new JButton("New button");
		bt_Nuoc5.setBounds(132, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc5);
		
		bt_Nuoc6 = new JButton("New button");
		bt_Nuoc6.setBounds(371, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc6);
		
		bt_Nuoc7 = new JButton("New button");
		bt_Nuoc7.setBounds(610, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc7);
		
		bt_Nuoc8 = new JButton("New button");
		bt_Nuoc8.setBounds(849, 168, 89, 70);
		panel_Nuoc.add(bt_Nuoc8);
		
		card_Panel_bill = new JPanel();
		card_Panel_bill.setBorder(new LineBorder(new Color(0, 90, 180), 5));
		card_Panel_bill.setBackground(Color.WHITE);
		card_Panel_bill.setBounds(1070, 0, 490, 655);
		cardPanel_TrangOder.add(card_Panel_bill);
		card_Panel_bill.setLayout(null);
		card_Panel_bill.setVisible(false);
		
		lblban = new JLabel("");
		lblban.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblban.setHorizontalAlignment(SwingConstants.CENTER);
		lblban.setBounds(0, 145, 100, 45);
		card_Panel_bill.add(lblban);
		
		JPanel panel_tong = new JPanel();
		panel_tong.setBackground(new Color(192, 192, 192));
		panel_tong.setBounds(153, 190, 337, 60);
		card_Panel_bill.add(panel_tong);
		panel_tong.setLayout(null);
		
		JLabel lbltong = new JLabel("Tong:");
		lbltong.setBounds(0, 0, 93, 60);
		panel_tong.add(lbltong);
		lbltong.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		lblthanhtien = new JLabel("0");
		lblthanhtien.setBounds(119, 0, 214, 60);
		panel_tong.add(lblthanhtien);
		lblthanhtien.setHorizontalAlignment(SwingConstants.RIGHT);
		lblthanhtien.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lbl_tenNhaHang = new JLabel("New label");
		lbl_tenNhaHang.setBounds(102, 67, 258, 60);
		card_Panel_bill.add(lbl_tenNhaHang);
		
		scrollPane_bill = new JScrollPane();
		scrollPane_bill.setBounds(5, 261, 490, 404);
		card_Panel_bill.add(scrollPane_bill);
		
		table_bill = new JTable();
		scrollPane_bill.setViewportView(table_bill);
		

		pannel_logo = new JPanel();
		pannel_logo.setLayout(null);
		pannel_logo.setBounds(228, 0, 65, 65);
		card_Panel_bill.add(pannel_logo);
		
		
		panel = new JPanel();
		panel.setBounds(1070, 655, 490, 78);
		cardPanel_TrangOder.add(panel);
		
		JButton bt_ChinhSua = new JButton("Chỉnh sủa");
		bt_ChinhSua.setBackground(new Color(15, 135, 255));
		bt_ChinhSua.setBounds(0, 0, 161, 78);
		bt_ChinhSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CaculatorJrame c = new CaculatorJrame();
				c.setVisible(true);
			}
		});
		panel.setLayout(null);
		bt_ChinhSua.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_ChinhSua);
		
		JButton bt_xoa = new JButton("Xóa");
		bt_xoa.setBackground(new Color(255, 150, 45));
		bt_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_xoa.setBounds(159, 0, 111, 78);
		bt_xoa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_xoa);
		
		JButton bt_in = new JButton("In");
		bt_in.setBackground(new Color(0, 215, 55));
		bt_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedImage image = new BufferedImage(card_Panel_bill.getWidth(), card_Panel_bill.getHeight(), BufferedImage.TYPE_INT_ARGB);

		        // Lấy đối tượng Graphics2D từ BufferedImage
		        Graphics2D g2d = image.createGraphics();

		        // Vẽ panel lên BufferedImage
		        card_Panel_bill.paint(g2d);

		        // Giải phóng đối tượng Graphics2D
		        g2d.dispose();
		        // them dong ho se la moi filr khac nhau
		        String filenamebill = "bill" + lblban.getText() + ".png";
		        controller.saveImage(image, filenamebill);
		        
		        controller.openFile(filenamebill);
		        
			}
		});
		bt_in.setBounds(267, 0, 111, 78);
		bt_in.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_in);
		
		JButton bt_KetThuc = new JButton("Kêt thúc");
		bt_KetThuc.setBackground(new Color(255, 50, 50));
		bt_KetThuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bt_KetThuc.setBounds(375, 0, 115, 78);
		bt_KetThuc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(bt_KetThuc);
		panel_Nuoc.setVisible(true);
		panel_tang.setVisible(true);
		
		cardPanel_Kho = new JPanel();
		cardPanel_Kho.setBackground(new Color(64, 128, 128));
		cardPanel_Kho.setLayout(null);
		cardPanel_2.add(cardPanel_Kho, "name_1003617367221200");
		cardPanel_Kho.setVisible(false);
		
		cardPanel_QLNV = new JPanel();
		cardPanel_QLNV.setBackground(Color.WHITE);
		cardPanel_QLNV.setLayout(null);
		cardPanel_2.add(cardPanel_QLNV, "name_1003617377031400");
		cardPanel_QLNV.setVisible(false);
        
        JLabel lbl_MucLuong = new JLabel("MỨC LƯƠNG");
        lbl_MucLuong.setForeground(Color.BLUE);
        lbl_MucLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl_MucLuong.setBounds(1194, 36, 164, 56);
        cardPanel_QLNV.add(lbl_MucLuong);
        
        table_MucLuong = new JTable();
        table_MucLuong.setForeground(new Color(0, 0, 0));
        table_MucLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JScrollPane spML = new JScrollPane(table_MucLuong);
        spML.setBounds(1026, 103, 446, 277);
        cardPanel_QLNV.add(spML);
        
        JLabel lbl_VTCV = new JLabel("Nhập vị trí công việc");
        lbl_VTCV.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl_VTCV.setForeground(new Color(0, 90, 180));
        lbl_VTCV.setBounds(1026, 430, 203, 32);
        cardPanel_QLNV.add(lbl_VTCV);
        
        tf_VTCV = new JTextField();
        tf_VTCV.setBackground(new Color(180, 215, 255));
        tf_VTCV.setBounds(1026, 462, 203, 32);
        cardPanel_QLNV.add(tf_VTCV);
        tf_VTCV.setColumns(10);
        
        JLabel lbl_ML = new JLabel("Nhập mức lương");
        lbl_ML.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl_ML.setForeground(new Color(0, 90, 180));
        lbl_ML.setBounds(1026, 528, 203, 32);
        cardPanel_QLNV.add(lbl_ML);
        
        tf_ML = new JTextField();
        tf_ML.setBackground(new Color(180, 215, 255));
        tf_ML.setColumns(10);
        tf_ML.setBounds(1026, 561, 203, 32);
        cardPanel_QLNV.add(tf_ML);
        
        JButton bt_Them = new JButton("Thêm");
        bt_Them.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_Them.setBackground(new Color(15, 135, 255));
        bt_Them.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		insertRow1();
        	}
        });
        bt_Them.setBounds(1313, 462, 129, 32);
        cardPanel_QLNV.add(bt_Them);
        
        JButton bt_Sua = new JButton("Sửa");
        bt_Sua.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_Sua.setBackground(new Color(255, 150, 45));
        bt_Sua.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateRow1();
        	}
        });
        bt_Sua.setBounds(1313, 561, 129, 32);
        cardPanel_QLNV.add(bt_Sua);
        
        JButton bt_Xoa = new JButton("Xóa");
        bt_Xoa.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_Xoa.setBackground(new Color(240, 240, 240));
        bt_Xoa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		deleteRow();
        	}
        });
        bt_Xoa.setBounds(1313, 650, 129, 32);
        cardPanel_QLNV.add(bt_Xoa);
        
        bt_TinhLuong = new JButton("Tính Lương");
        bt_TinhLuong.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_TinhLuong.setBackground(new Color(0, 215, 55));
        bt_TinhLuong.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TinhLuong();
        	}
        });
        bt_TinhLuong.setBounds(559, 440, 129, 32);
        cardPanel_QLNV.add(bt_TinhLuong);
        
        textField_2 = new JTextField();
        textField_2.setBackground(new Color(180, 215, 255));
        textField_2.setColumns(10);
        textField_2.setBounds(52, 546, 203, 32);
        cardPanel_QLNV.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setBackground(new Color(180, 215, 255));
        textField_3.setColumns(10);
        textField_3.setBounds(310, 546, 203, 32);
        cardPanel_QLNV.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setBackground(new Color(180, 215, 255));
        textField_4.setColumns(10);
        textField_4.setBounds(553, 546, 203, 32);
        cardPanel_QLNV.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setBackground(new Color(180, 215, 255));
        textField_5.setColumns(10);
        textField_5.setBounds(310, 624, 203, 32);
        cardPanel_QLNV.add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setBackground(new Color(180, 215, 255));
        textField_6.setColumns(10);
        textField_6.setBounds(553, 624, 203, 32);
        cardPanel_QLNV.add(textField_6);
        
        bt_Tim = new JButton("Tìm");
        bt_Tim.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_Tim.setBackground(new Color(0, 215, 55));
        bt_Tim.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		searchInfo();
        	}
        });
        bt_Tim.setBounds(52, 613, 129, 32);
        cardPanel_QLNV.add(bt_Tim);
        
        bt_ChinSua = new JButton("Chỉnh sửa");
        bt_ChinSua.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_ChinSua.setBackground(new Color(255, 150, 45));
        bt_ChinSua.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateRow();
        	}
        });
        bt_ChinSua.setBounds(449, 677, 129, 32);
        cardPanel_QLNV.add(bt_ChinSua);
        
        bt_Xoa2 = new JButton("Xóa");
        bt_Xoa2.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_Xoa2.setBackground(new Color(255, 50, 50));
        bt_Xoa2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		deleteRowByID();
        	}
        });
        bt_Xoa2.setBounds(627, 677, 129, 32);
        cardPanel_QLNV.add(bt_Xoa2);
        
        bt_In = new JButton("In");
        bt_In.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_In.setBackground(new Color(255, 50, 50));
        bt_In.setBounds(698, 440, 53, 32);
        cardPanel_QLNV.add(bt_In);
        
        JButton bt_Them_2_1 = new JButton("Thêm");
        bt_Them_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt_Them_2_1.setBackground(new Color(15, 135, 255));
        bt_Them_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		insertRow();
        	}
        });
        bt_Them_2_1.setBounds(266, 677, 129, 32);
        cardPanel_QLNV.add(bt_Them_2_1);
        
        JLabel lbl1 = new JLabel("Nhập ID");
        lbl1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl1.setForeground(new Color(0, 90, 180));
        lbl1.setBounds(52, 515, 203, 32);
        cardPanel_QLNV.add(lbl1);
        
        JLabel lbl2 = new JLabel("Họ và Tên");
        lbl2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl2.setForeground(new Color(0, 90, 180));
        lbl2.setBounds(310, 515, 203, 32);
        cardPanel_QLNV.add(lbl2);
        
        JLabel lbl3 = new JLabel("Vị trí công việc");
        lbl3.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl3.setForeground(new Color(0, 90, 180));
        lbl3.setBounds(553, 515, 203, 32);
        cardPanel_QLNV.add(lbl3);
        
        JLabel lbl4 = new JLabel("Số ngày công");
        lbl4.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl4.setForeground(new Color(0, 90, 180));
        lbl4.setBounds(310, 593, 203, 32);
        cardPanel_QLNV.add(lbl4);
        
        JLabel lbl5 = new JLabel("Tiền lương");
        lbl5.setFont(new Font("Tahoma", Font.BOLD, 13));
        lbl5.setForeground(new Color(0, 90, 180));
        lbl5.setBounds(553, 593, 203, 32);
        cardPanel_QLNV.add(lbl5);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(15, 135, 255));
        panel_2.setBounds(37, 21, 737, 418);
        cardPanel_QLNV.add(panel_2);
        panel_2.setLayout(null);
        
        table_BangLuong = new JTable();
        table_BangLuong.setForeground(new Color(0, 0, 0));
        table_BangLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
        spBL = new JScrollPane(table_BangLuong);
        spBL.setBounds(10, 73, 717, 334);
        panel_2.add(spBL);

        
        lbl_BangLuong = new JLabel("BẢNG LƯƠNG");
        lbl_BangLuong.setForeground(Color.WHITE);
        lbl_BangLuong.setBounds(289, 11, 172, 51);
        lbl_BangLuong.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_2.add(lbl_BangLuong);
        
        JButton bt_COng = new JButton("+\r\n");
        bt_COng.setForeground(Color.WHITE);
        bt_COng.setFont(new Font("Tahoma", Font.BOLD, 20));
        bt_COng.setBackground(new Color(0, 90, 180));
        bt_COng.setBounds(674, 38, 53, 32);
        panel_2.add(bt_COng);
        bt_COng.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateCong();
        	}
        });
	}
	
	public JTable getTable_BangLuong() {
	    return table_BangLuong;
	}
	
	public JTable getTable_MucLuong() {
	    return table_MucLuong;
	}
	
	public void setTable_BangLuong(JTable table_BangLuong) {
	    this.table_BangLuong = table_BangLuong;
	}

	public void setTable_MucLuong(JTable table_MucLuong) {
	    this.table_MucLuong = table_MucLuong;
	}
	
	private void searchInfo() {
        try {
            Connection connection = ConnectionDatabase.connect();
            if (connection != null) {
                String id = textField_2.getText();
                String sql = "SELECT * FROM BangLuong WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    textField_3.setText(resultSet.getString("Họ và tên"));
                    textField_4.setText(resultSet.getString("Vị trí công việc"));
                    textField_5.setText(resultSet.getString("Số ngày công"));                   
                    textField_6.setText(resultSet.getString("Tiền lương"));
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn đã nhập sai ID");
                }
                ConnectionDatabase.disconnect(connection);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
	
	private void insertRow() {
        String value1 = textField_2.getText();
        String value2 = textField_3.getText();
        String value3 = textField_4.getText();
        String value4 = textField_5.getText();
        String value5 = textField_6.getText();
        
        if (value1.isEmpty() || value2.isEmpty() || value3.isEmpty() || value4.isEmpty() 
        		|| value5.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá trị cho tất cả các trường.");
            return;
        }

        try {
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            DefaultTableModel model = (DefaultTableModel) table_BangLuong.getModel();
       
            String updateQuery ="INSERT INTO BangLuong (ID, \"Họ và tên\", \"Vị trí công việc\", \"Số ngày công\", \"Tiền lương\") " + "VALUES ( '" + value1 + 
            					"', '" + value2 + "', '" + value3 + "', '" + value4 + "', '" + value5 + "')" ;
            model.addRow(new Object[]{value1, value2, value3, value4, value5});
            statement.executeUpdate(updateQuery);	
	        statement.close();
	        connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	private void deleteRowByID() {
        String idToDelete = textField_2.getText();

        if (idToDelete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ID cần xóa.");
            return;
        }

        try {
            DefaultTableModel model = (DefaultTableModel) table_BangLuong.getModel();
            
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            
            int rowCount = model.getRowCount();
            int rowIndexToDelete = -1;
            for (int i = 0; i < rowCount; i++) {
                int idInTable = (int) model.getValueAt(i, 0);
                if (idInTable == Integer.parseInt(idToDelete)) {
                    rowIndexToDelete = i;
                    break;
                }
            }
            if (rowIndexToDelete == -1) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy ID trong bảng.");
                return;
            }
            model.removeRow(rowIndexToDelete);
            String deleteQuery = "DELETE FROM BangLuong WHERE ID = " + idToDelete;
            statement.executeUpdate(deleteQuery);        
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa hàng: " + ex.getMessage());
        }
    }
    
	private void updateRow() {
    	String newValue1 = textField_2.getText();
        String newValue2 = textField_3.getText();
        String newValue3 = textField_4.getText();
        String newValue4 = textField_5.getText();
        String newValue5 = textField_6.getText();

        if (newValue1.isEmpty() || newValue2.isEmpty() || newValue3.isEmpty() || newValue4.isEmpty() 
        		|| newValue5.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá trị cho tất cả các trường.");
            return;
        }

        try {
            DefaultTableModel model = (DefaultTableModel) table_BangLuong.getModel();
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            int rowCount = model.getRowCount();
            int rowIndexToUpdate = -1;
            for (int i = 0; i < rowCount; i++) {
                int idInTable = (int) model.getValueAt(i, 0);
                if (idInTable == Integer.parseInt(newValue1)) {
                    rowIndexToUpdate = i;
                    break;
                }
            }
            if (rowIndexToUpdate == -1) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy ID trong bảng.");
                return;
            }

            model.setValueAt(newValue1, rowIndexToUpdate, 0); 
            model.setValueAt(newValue2, rowIndexToUpdate, 1);  
            model.setValueAt(newValue3, rowIndexToUpdate, 2); 
            model.setValueAt(newValue4, rowIndexToUpdate, 3);
            model.setValueAt(newValue5, rowIndexToUpdate, 4);

            String updateQuery ="UPDATE BangLuong SET ID = '" + newValue1 + "', \"Họ và tên\" = '" 
                    + newValue2 + "', \"Vị trí công việc\" = '" + newValue3 + "', \"Số ngày công\" = '" + newValue4 
                    + "', \"Tiền lương\" = '" + newValue5 + "' WHERE ID = '" + newValue1 + "'";
            statement.executeUpdate(updateQuery);
            
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + ex.getMessage());
        }
    }
	
	private void insertRow1() {
        String value1 =tf_VTCV.getText();
        String value2 = tf_ML.getText();
        
        if (value1.isEmpty() || value2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá trị cho tất cả các trường.");
            return;
        }

        try {
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            DefaultTableModel model = (DefaultTableModel) table_MucLuong.getModel();
       
            String updateQuery ="INSERT INTO MucLuong (\"Vị trí công việc\", \"Mức lương\") " + "VALUES ( '" + value1 + 
            					"', '" + value2  + "')" ;
            model.addRow(new Object[]{value1, value2});
            statement.executeUpdate(updateQuery);	
	        statement.close();
	        connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	private void updateRow1() {
    	String newValue1 = tf_VTCV.getText();
        String newValue2 =tf_ML.getText();

        if (newValue1.isEmpty() || newValue2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá trị cho tất cả các trường.");
            return;
        }

        try {
            DefaultTableModel model = (DefaultTableModel) table_MucLuong.getModel();
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            int rowCount = model.getRowCount();
            int rowIndexToUpdate = -1;
            for (int i = 0; i < rowCount; i++) {
                String idInTable = (String) model.getValueAt(i, 0);
                if (idInTable.equals(newValue1)) {
                    rowIndexToUpdate = i;
                    break;
                }
            }
            if (rowIndexToUpdate == -1) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy Vị trí công việc trong bảng.");
                return;
            }

            model.setValueAt(newValue1, rowIndexToUpdate, 0); 
            model.setValueAt(newValue2, rowIndexToUpdate, 1);  

            String updateQuery = "UPDATE MucLuong SET \"Vị trí công việc\" = '" + newValue1 + "', \"Mức lương\" = '" 
                    + newValue2 + "' WHERE \"Vị trí công việc\" = '" + newValue1 + "'";
            statement.executeUpdate(updateQuery);
            
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + ex.getMessage());
        }
    }
	private void deleteRow() {
        String a = tf_VTCV.getText();

        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Vị trí công việc cần xóa.");
            return;
        }

        try {
            DefaultTableModel model = (DefaultTableModel) table_MucLuong.getModel();
            
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            
            int rowCount = model.getRowCount();
            int rowIndexToDelete = -1;
            for (int i = 0; i < rowCount; i++) {
                String idInTable = (String) model.getValueAt(i, 0);
                if (idInTable.equals(a)) {
                	rowIndexToDelete = i;
                    break;
                }
            }
            if (rowIndexToDelete == -1) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy Vị trí công việc trong bảng.");
                return;
            }
            model.removeRow(rowIndexToDelete);
            String deleteQuery = "DELETE FROM MucLuong WHERE \"Vị trí công việc\" = '" + a + "'";
            statement.executeUpdate(deleteQuery);        
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa hàng: " + ex.getMessage());
        }
    }
	
	private void updateCong() {
        try {
            DefaultTableModel model = (DefaultTableModel) table_BangLuong.getModel();
            Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            int rowCount = model.getRowCount();
            for (int i = 0; i < rowCount; i++) {
            	int getID = (int) model.getValueAt(i, 0);
                int oldvalue = (int) model.getValueAt(i, 3);
                int newValue = oldvalue + 1; 
                model.setValueAt(newValue, i, 3); 
                String updateQuery = "UPDATE BangLuong SET \"Số ngày công\" = '" 
                        + newValue + "' WHERE ID = '" + getID + "'";
                statement.executeUpdate(updateQuery);
            }  
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + ex.getMessage());
        }
    }
	
	private void TinhLuong() {
    	try {
    		DefaultTableModel model = (DefaultTableModel) table_BangLuong.getModel();
    		DefaultTableModel model1 = (DefaultTableModel) table_MucLuong.getModel();
    		Connection connection = ConnectionDatabase.connect();
            java.sql.Statement statement = connection.createStatement();
            for(int i = 0; i < model.getRowCount(); i++) {
            	int getID = (int) model.getValueAt(i, 0);
        		int vtcv1Idex = -1;
            	String vtcv = (String) model.getValueAt(i, 2);
            	for (int j = 0; j < model1.getRowCount(); j++) {
            		String vtcv1 = (String) model1.getValueAt(j, 0);
            		if (vtcv.equals(vtcv1)) {
                		vtcv1Idex = j;
            			break;
            		}
            	}
            	if (vtcv1Idex == -1) {
            		return;
            	}
            	int mln = (int) model1.getValueAt(vtcv1Idex, 1); 
            	int snc = (int) model.getValueAt(i, 3);
            	int tl = snc*mln;
            	model.setValueAt(tl, i, 4);
            	String updateQuery = "UPDATE BangLuong SET \"Tiền Lương\" = '" 
                        + tl + "' WHERE ID = '" + getID + "'";
                statement.executeUpdate(updateQuery);

            }
            statement.close();
            connection.close();
    	} catch (SQLException ex) {
            ex.printStackTrace();
    	}
    }
}
