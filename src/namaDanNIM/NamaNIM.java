package namaDanNIM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NamaNIM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textNIM;
	private JComboBox cbJurusan;
	JLabel lblInfo1;
	JLabel lblInfo3;
	JLabel lblMakasih;
	JLabel lblInfo2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NamaNIM frame = new NamaNIM();
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
	public NamaNIM() {
		setTitle("Data Mahasiswa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input Data Mahasiswa");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(20, 10, 406, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNama.setBounds(10, 61, 49, 14);
		contentPane.add(lblNama);
		
		JLabel lblNIM = new JLabel("NIM");
		lblNIM.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNIM.setBounds(10, 96, 49, 14);
		contentPane.add(lblNIM);
		
		JLabel lblJurusan = new JLabel("Jurusan");
		lblJurusan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblJurusan.setBounds(10, 130, 49, 14);
		contentPane.add(lblJurusan);
		
		textNama = new JTextField();
		textNama.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textNama.setBounds(106, 59, 263, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		textNIM = new JTextField();
		textNIM.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textNIM.setBounds(106, 94, 116, 20);
		contentPane.add(textNIM);
		textNIM.setColumns(10);
		
		cbJurusan = new JComboBox();
		cbJurusan.setModel(new DefaultComboBoxModel(new String[] {"Agribisnis", 
				"Agroekoteknologi", "Agroteknologi", "Akuntansi", "Antropologi", 
				"Arsitektur", "Biologi", "Ekonomi Pembangunan", "Farmasi", "Fisika", 
				"Gizi", "Hubungan Internasional", "Ilmu Biomedis", "Ilmu Hukum", 
				"Ilmu Keperawatan", "Ilmu Komunikasi", "Ilmu Politik", "Ilmu Tanah", 
				"Informatika", "Kebidanan", "Kedokteran", "Kesehatan Masyarakat", 
				"Kimia", "Manajemen", "Matematika", "Pendidikan Dokter Gigi", 
				"Penyuluhan Pertanian", "Peternakan", "Proteksi Tanaman", "Psikologi", 
				"Sastra Indonesia", "Sastra Inggris", "Sastra Jepang", "Sastra Minangkabau", 
				"Sejarah", "Sistem Informasi", "Sosiologi", "Teknik Elektro", 
				"Teknik Industri", "Teknik Komputer", "Teknik Lingkungan", "Teknik Mesin", 
				"Teknik Pertanian dan Biosistem", "Teknik Sipil", "Teknologi Industri Pertanian", 
				"Teknologi Pangan dan Hasil Pertanian"}));
		cbJurusan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cbJurusan.setBounds(106, 127, 263, 22);
		contentPane.add(cbJurusan);
		
		lblInfo1 = new JLabel("");
		lblInfo1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInfo1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo1.setBounds(10, 176, 416, 41);
		contentPane.add(lblInfo1);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = textNama.getText();
				long nim = Long.parseLong(textNIM.getText());
				String jurusan = cbJurusan.getSelectedItem().toString();
				lblInfo1.setText("Halo " + nama + "!");
				lblInfo2.setText("Mahasiswa jurusan " + jurusan + ".");
				lblInfo3.setText("NIM kamu adalah " + nim + ".");
				lblMakasih.setText("Terimakasih!! ^w^");
			}
		});
		btnProses.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnProses.setBounds(337, 389, 89, 23);
		contentPane.add(btnProses);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textNIM.setText("");
				cbJurusan.setSelectedIndex(18);
				lblInfo1.setText("");
				lblInfo2.setText("");
				lblInfo3.setText("");
				lblMakasih.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnReset.setBounds(238, 389, 89, 23);
		contentPane.add(btnReset);
		
		lblInfo3 = new JLabel("");
		lblInfo3.setVerticalAlignment(SwingConstants.TOP);
		lblInfo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInfo3.setBounds(10, 241, 416, 41);
		contentPane.add(lblInfo3);
		
		lblMakasih = new JLabel("");
		lblMakasih.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakasih.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblMakasih.setBounds(10, 319, 416, 41);
		contentPane.add(lblMakasih);
		
		lblInfo2 = new JLabel("");
		lblInfo2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInfo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInfo2.setBounds(10, 217, 416, 20);
		contentPane.add(lblInfo2);
	}
}
