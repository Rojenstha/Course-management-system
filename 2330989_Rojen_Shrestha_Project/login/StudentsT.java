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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class StudentsT extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String String = null;
	private JPanel contentPane;
	private JTable table;
	private JTextField id;
	private JTextField username;
	private JTextField email;
	private JTextField course;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsT frame = new StudentsT();
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
	
	public StudentsT() {
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1073, 801);
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
		panel.setBounds(0, 0, 305, 764);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setBounds(10, 68, 410, 45);
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
			DashboardS dd=new DashboardS();
			dd.setVisible(true);
				};
			}
			
		});
		btnNewButton_1_1_4.setForeground(Color.BLACK);
		btnNewButton_1_1_4.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_4.setBackground(new Color(153, 153, 153));
		btnNewButton_1_1_4.setBounds(63, 611, 178, 41);
		panel.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Dashboard\r\n");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashboardT ds=new DashboardT();
				ds.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_2_1.setBackground(new Color(153, 153, 153));
		btnNewButton_1_1_2_1.setBounds(63, 201, 178, 41);
		panel.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Tutors");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TutorsS tu=new TutorsS();
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
				CoursesS co=new CoursesS();
				co.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1_1_1.setBounds(63, 306, 178, 41);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Students");
		btnNewButton_1_1.setBounds(63, 506, 178, 41);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsS su=new StudentsS();
				su.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(new Color(128, 128, 128));
		btnNewButton_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("Students\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
		lblNewLabel_1.setBounds(268, 34, 341, 55);
		contentPane.add(lblNewLabel_1);
		 DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
				 
			},
			new String[] {
					"ID","USERNAME", "EMAIL", "COURSE"
			}
		);
		 updateStudents su=new updateStudents();
		 su.showData(model);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(304, 396, 755, 368);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("ID\r\nusername\r\nemail\r\ncourse");
		table.setModel(model);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("ID");
		lblNewLabel_2_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_3_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1_1_3_1.setBounds(341, 100, 105, 26);
		contentPane.add(lblNewLabel_2_1_1_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(341, 145, 105, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(345, 194, 105, 26);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Course");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(345, 242, 105, 26);
		contentPane.add(lblNewLabel_2_2_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(460, 106, 170, 19);
		contentPane.add(id);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(460, 151, 170, 19);
		contentPane.add(username);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(460, 200, 170, 19);
		contentPane.add(email);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(460, 248, 170, 19);
		contentPane.add(course);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsS tt=new StudentsS();
				tt.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(544, 278, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2_2 = new JButton("Edit Students");
		btnNewButton_2_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 13));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);
	
			}});
		btnNewButton_2_2.setBounds(323, 333, 140, 45);
		contentPane.add(btnNewButton_2_2);
		
		
		JButton btnNewButton_2_2_1 = new JButton("Delete Student");
		btnNewButton_2_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 13));
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);
	
		    }
				
		});
		
		
		btnNewButton_2_2_1.setBounds(493, 333, 140, 45);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_2_2 = new JButton("View Result");
		btnNewButton_2_2_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 13));
		btnNewButton_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		btnNewButton_2_2_2.setBounds(660, 333, 140, 45);
		contentPane.add(btnNewButton_2_2_2);
		table.getColumnModel().getColumn(0).setPreferredWidth(151);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(151);
		table.getColumnModel().getColumn(2).setPreferredWidth(151);
	}}
	
	
