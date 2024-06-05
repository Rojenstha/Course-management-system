package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1068, 801);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		 setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 309, 861);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setBounds(21, 67, 410, 45);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 21));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1_1_4 = new JButton("Logout");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Do you want to logout?", getTitle(), JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
				    // User clicked Yes, create a Login object
				    Login l = new Login();
				    l.setVisible(true);
				    dispose();
				} else {
			Dashboard dd=new Dashboard();
			dd.setVisible(true);
				};
			}
			
		});

			
		btnNewButton_1_1_4.setForeground(Color.BLACK);
		btnNewButton_1_1_4.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_4.setBackground(new Color(153, 153, 153));
		btnNewButton_1_1_4.setBounds(63, 611, 178, 41);
		panel.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Students");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Students su=new Students();
				su.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_2_1.setBackground(new Color(153, 153, 153));
		btnNewButton_1_1_2_1.setBounds(63, 506, 178, 41);
		panel.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Tutors");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutors tu=new Tutors();
				tu.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_1_1.setBackground(new Color(153, 153, 153));
		btnNewButton_1_1_1_1.setBounds(63, 407, 178, 41);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Courses");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courses co=new Courses();
				co.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1_1_1.setBounds(63, 306, 178, 41);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Dashboard");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard ds=new Dashboard();
				ds.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1_1.setBounds(63, 201, 178, 41);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Dashboard\r\n");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(new Color(92, 92, 92));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 33));
		lblNewLabel_1.setBounds(319, 60, 341, 65);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(327, 388, 472, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tutors\r\n");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(0, 41, 170, 55);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel numCourse = new JLabel("5");
		numCourse.setHorizontalAlignment(SwingConstants.CENTER);
		numCourse.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		numCourse.setBounds(312, 41, 150, 55);
		panel_1.add(numCourse);
		updateTutors tu=new updateTutors();
		int result1=tu.getTutorCount();
		numCourse.setText(String.valueOf(result1));
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(248, 248, 255));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(327, 543, 472, 120);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Students");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(-15, 39, 245, 55);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel numStudent = new JLabel("4");
		numStudent.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		numStudent.setBounds(376, 39, 200, 55);
		panel_1_1.add(numStudent);
		updateStudents ss=new updateStudents();
		int result=ss.getStudentCount();
		numStudent.setText(String.valueOf(result));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(240, 255, 255));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(327, 240, 472, 120);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Course\r\n");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(10, 34, 137, 55);
		panel_1_2.add(lblNewLabel_1_1_2);
		
		JLabel numCourse_1 = new JLabel("4");
		numCourse_1.setHorizontalAlignment(SwingConstants.CENTER);
		numCourse_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		numCourse_1.setBounds(312, 34, 150, 55);
		panel_1_2.add(numCourse_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Admin,");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
		lblNewLabel_2.setBounds(325, 179, 500, 40);
		contentPane.add(lblNewLabel_2);
	}
}
