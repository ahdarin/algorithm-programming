package kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double hasil;
	String operasi;
	String answer;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator frame = new Kalkulator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kalkulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setBounds(10, 11, 623, 76);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace=null;
				if(textField.getText().length()>0) 
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					BackSpace=str.toString();
					textField.setText(BackSpace);
					
				}
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackspace.setBounds(10, 98, 56, 57);
		contentPane.add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 166, 56, 57);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 234, 56, 57);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 302, 56, 57);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 370, 56, 57);
		contentPane.add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(76, 98, 56, 57);
		contentPane.add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn00.setBounds(142, 98, 56, 57);
		contentPane.add(btn00);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(76, 166, 56, 57);
		contentPane.add(btn8);
		
		JButton btnTambah = new JButton("+");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operasi="+";
				lblNewLabel.setIcon(null);
			}
		});
		btnTambah.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTambah.setBounds(208, 98, 56, 57);
		contentPane.add(btnTambah);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(142, 166, 56, 57);
		contentPane.add(btn9);
		
		JButton btnKurang = new JButton("-");
		btnKurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operasi="-";
				lblNewLabel.setIcon(null);
			}
		});
		btnKurang.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKurang.setBounds(208, 166, 56, 57);
		contentPane.add(btnKurang);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(76, 234, 56, 57);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(142, 234, 56, 57);
		contentPane.add(btn6);
		
		JButton btnKali = new JButton("*");
		btnKali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operasi="*";
				lblNewLabel.setIcon(null);
			}
		});
		btnKali.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKali.setBounds(208, 234, 56, 57);
		contentPane.add(btnKali);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(76, 302, 56, 57);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(142, 302, 56, 57);
		contentPane.add(btn3);
		
		JButton btnBagi = new JButton("/");
		btnBagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operasi="/";
				lblNewLabel.setIcon(null);
			}
		});
		btnBagi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBagi.setBounds(208, 302, 56, 57);
		contentPane.add(btnBagi);
		
		JButton btnKoma = new JButton(".");
		btnKoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnKoma.getText();
				textField.setText(number);
			}
		});
		btnKoma.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnKoma.setBounds(76, 370, 56, 57);
		contentPane.add(btnKoma);
		
		JButton btnSama = new JButton("=");
		btnSama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operasi=="+") {
					hasil=first+second;
					answer=String.format("%.2f",hasil);
					textField.setText(answer);
				} 
				else if(operasi=="-") {
					hasil=first-second;
					answer=String.format("%.2f",hasil);
					textField.setText(answer);
				} 
				else if(operasi=="*") {
					hasil=first*second;
					answer=String.format("%.2f",hasil);
					textField.setText(answer);
				} else if(operasi=="/") {
					hasil=first/second;
					answer=String.format("%.2f",hasil);
					textField.setText(answer);
				} else if(operasi=="%") {
					hasil=first%second;
					answer=String.format("%.2f",hasil);
					textField.setText(answer);
				}
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ahda\\Downloads\\3d-emoji.jpg"));
				

			}
		});
		btnSama.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSama.setBounds(142, 370, 56, 57);
		contentPane.add(btnSama);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operasi="%";
				lblNewLabel.setIcon(null);
				
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod.setBounds(208, 370, 56, 57);
		contentPane.add(btnMod);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(274, 98, 359, 329);
		contentPane.add(lblNewLabel);
	}
}
