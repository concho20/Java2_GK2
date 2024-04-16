import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CaculatorJrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public CaculatorJrame() {
		setBackground(new Color(0, 124, 217));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		setBounds(100, 000, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 436, 563);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField("1");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setBounds(125, 70, 200, 60);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn000 = new JButton("000");
		btn000.setForeground(Color.BLACK);
		btn000.setBackground(Color.WHITE);
		btn000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				textField.setText(textField.getText() + "000");
			}
		});
		btn000.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn000.setBounds(10, 477, 94, 75);
		panel.add(btn000);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn1.setBounds(10, 391, 94, 75);
		panel.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLACK);
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn4.setBounds(10, 305, 94, 75);
		panel.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.BLACK);
		btn7.setBackground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn7.setBounds(10, 219, 94, 75);
		panel.add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.BLACK);
		btn0.setBackground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn0.setBounds(114, 477, 94, 75);
		panel.add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLACK);
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn2.setBounds(114, 391, 94, 75);
		panel.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.BLACK);
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn5.setBounds(114, 305, 94, 75);
		panel.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn8.setBounds(114, 219, 94, 75);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn9.setBounds(218, 219, 94, 75);
		panel.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.BLACK);
		btn6.setBackground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn6.setBounds(218, 305, 94, 75);
		panel.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLACK);
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn3.setBounds(218, 391, 94, 75);
		panel.add(btn3);
		
		JButton btn_clear = new JButton("Reset");
		btn_clear.setForeground(Color.WHITE);
		btn_clear.setBackground(new Color(255, 255, 113));
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_clear.setBounds(218, 477, 94, 75);
		panel.add(btn_clear);
		
		JButton btn_xoa = new JButton("Xóa");
		btn_xoa.setForeground(Color.WHITE);
		btn_xoa.setBackground(new Color(255, 66, 66));
		btn_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                if (!currentText.isEmpty()) {
                    textField.setText(currentText.substring(0, currentText.length() - 1));
                }
			}
		});
		btn_xoa.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_xoa.setBounds(322, 219, 104, 161);
		panel.add(btn_xoa);
		
		JButton btn_ok = new JButton("Ok");
		btn_ok.setForeground(Color.WHITE);
		btn_ok.setBackground(new Color(81, 255, 124));
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int up = Integer.parseInt(textField.getText());

			}
		});
		btn_ok.setFont(new Font("Tahoma", Font.BOLD, 26));
		btn_ok.setBounds(322, 391, 104, 161);
		panel.add(btn_ok);
		
		JButton bt_Tru = new JButton("-");
		bt_Tru.setForeground(Color.BLACK);
		bt_Tru.setFont(new Font("Tahoma", Font.BOLD, 30));
		bt_Tru.setBackground(Color.WHITE);
		bt_Tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				if(a > 0) {
					int b = Integer.parseInt(textField.getText()) - 1;				
					textField.setText(b + "");
				}			
			}
		});
		bt_Tru.setBounds(67, 75, 50, 50);
		panel.add(bt_Tru);
		
		JButton bt_COng = new JButton("+");
		bt_COng.setForeground(Color.BLACK);
		bt_COng.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt_COng.setBackground(Color.WHITE);
		bt_COng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());		
				int b = Integer.parseInt(textField.getText()) + 1;				
				textField.setText(b + "");
			}
		});
		bt_COng.setBounds(335, 75, 50, 50);
		panel.add(bt_COng);
	}
}