package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

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
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class CoursesS extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField course;
	private JTextField seat;
	private JTextField batch;
	private JTextField year;
	private JTextField ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesS frame = new CoursesS();
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
	public CoursesS() {
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1124, 898);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBackground(new Color(254, 231, 214));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		 setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 309, 861);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setBounds(10, 67, 410, 45);
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
		
		JButton btnNewButton_1_1_2_1 = new JButton("Students");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsS su=new StudentsS();
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
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1_1_1.setBounds(63, 306, 178, 41);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Dashboard");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashboardS ds=new DashboardS();
				ds.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setBounds(63, 201, 178, 41);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Courses\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_1.setBounds(345, 23, 341, 55);
		contentPane.add(lblNewLabel_1);
		 DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
				 
			},
			new String[] {
					"ID", "NAME" , "SEAT", "BATCH", "YEAR"			}
		);
		 updateCourse co=new updateCourse();
		co.showData(model);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 351, 805, 510);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		ListSelectionModel selectionModel = table.getSelectionModel();
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		table.setToolTipText("id\r\nname\r\nseat\r\nbatch\r\nyear");
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(151);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(151);
		table.getColumnModel().getColumn(2).setPreferredWidth(151);


		
		table = new JTable();
		table.setBounds(453, 370, 1, 1);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Add course\r\n");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);
	
			}
		});
		btnNewButton.setBounds(615, 295, 140, 45);
		contentPane.add(btnNewButton);
		
		JButton btnDeleteCourse = new JButton("Delete Course\r\n");
		btnDeleteCourse.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnDeleteCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);

		    }
		});
		btnDeleteCourse.setBounds(960, 295, 140, 45);
		contentPane.add(btnDeleteCourse);
		
		course = new JTextField();
		course.setBounds(423, 113, 170, 19);
		contentPane.add(course);
		course.setColumns(10);
		
		seat = new JTextField();
		seat.setColumns(10);
		seat.setBounds(423, 143, 170, 19);
		contentPane.add(seat);
		
		batch = new JTextField();
		batch.setColumns(10);
		batch.setBounds(423, 188, 170, 19);
		contentPane.add(batch);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(423, 222, 170, 19);
		contentPane.add(year);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Seat");
		lblNewLabel_2_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(345, 146, 68, 26);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoursesS co=new CoursesS();
				co.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(508, 259, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Year");
		lblNewLabel_2_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1_1_1.setBounds(345, 225, 68, 26);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Batch");
		lblNewLabel_2_1_1_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1_1_2.setBounds(345, 186, 68, 26);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Course Name");
		lblNewLabel_2_1_1_3.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1_1_3.setBounds(318, 111, 105, 26);
		contentPane.add(lblNewLabel_2_1_1_3);
		
		ID = new JTextField();
		ID.setColumns(10);
		ID.setBounds(423, 84, 170, 19);
		contentPane.add(ID);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("ID");
		lblNewLabel_2_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_3_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1_1_3_1.setBounds(319, 82, 105, 26);
		contentPane.add(lblNewLabel_2_1_1_3_1);
		
		JButton btnNewButton_2 = new JButton("Update course");
		btnNewButton_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);

		    }
		});
				
		btnNewButton_2.setBounds(791, 295, 140, 45);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\shres\\Downloads\\bg-image.jpg"));
		lblNewLabel_2.setBounds(305, 0, 805, 359);
		contentPane.add(lblNewLabel_2);
	}
}


