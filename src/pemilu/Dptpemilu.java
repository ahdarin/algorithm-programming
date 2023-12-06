package pemilu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Dptpemilu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textUmur;
	private JComboBox cbMenikah;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dptpemilu frame = new Dptpemilu();
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
	public Dptpemilu() {
		setTitle("DPT PEMILU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi DPT Pemilu 2024");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(67, 11, 235, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNama.setBounds(10, 53, 49, 14);
		contentPane.add(lblNama);
		
		JLabel lblUmur = new JLabel("Umur");
		lblUmur.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUmur.setBounds(10, 80, 49, 14);
		contentPane.add(lblUmur);
		
		JLabel lblMenikah = new JLabel("Menikah");
		lblMenikah.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMenikah.setBounds(10, 105, 49, 14);
		contentPane.add(lblMenikah);
		
		textNama = new JTextField();
		textNama.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textNama.setBounds(93, 51, 191, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		textUmur = new JTextField();
		textUmur.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textUmur.setColumns(10);
		textUmur.setBounds(93, 78, 75, 20);
		contentPane.add(textUmur);
		
		cbMenikah = new JComboBox();
		cbMenikah.setModel(new DefaultComboBoxModel(new String[] {"ya", "tidak"}));
		cbMenikah.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cbMenikah.setBounds(93, 101, 49, 22);
		contentPane.add(cbMenikah);
		
		lblInfo = new JLabel("");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblInfo.setBounds(10, 149, 338, 70);
		contentPane.add(lblInfo);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textNama.getText();
				int umur = Integer.parseInt(textUmur.getText());
				String status = cbMenikah.getSelectedItem().toString();
				
				if (umur>17) {
					lblInfo.setText(n+", Terdaftar Di DPT");
				} else if ((umur<17)&&(status.equals("ya"))){
					lblInfo.setText(n+", Terdaftar Di DPT");
				} else if ((umur<17)&&(!status.equals("ya"))) {
					lblInfo.setText(n+", Tidak bisa ikut memilih di Pemilu 2024");
				}
			}
		});
		btnProses.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnProses.setBounds(20, 237, 89, 23);
		contentPane.add(btnProses);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textUmur.setText("");
				cbMenikah.setSelectedIndex(0);
				lblInfo.setText("");

			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnReset.setBounds(259, 237, 89, 23);
		contentPane.add(btnReset);
	}
}
