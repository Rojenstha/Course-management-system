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

public class Tutors extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField id;
	private JTextField username;
	private JTextField email;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tutors frame = new Tutors();
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
	
	public Tutors() {
		setResizable(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 766);
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
			Dashboard dd=new Dashboard();
			dd.setVisible(true);
				};
			}
			
		});

			
		btnNewButton_1_1_4.setBounds(63, 611, 178, 41);
		btnNewButton_1_1_4.setForeground(Color.BLACK);
		btnNewButton_1_1_4.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_4.setBackground(new Color(153, 153, 153));
		panel.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Students");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Students su=new Students();
				su.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_2_1.setBounds(63, 506, 178, 41);
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_2_1.setBackground(new Color(153, 153, 153));
		panel.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Courses\r\n");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courses co=new Courses();
				co.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1_1.setBounds(63, 308, 178, 41);
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_1_1.setBackground(new Color(153, 153, 153));
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Dashboard");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard ds=new Dashboard();
				ds.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(63, 201, 178, 41);
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(169, 169, 169));
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Tutors");
		btnNewButton_1_1_1.setBounds(63, 408, 178, 41);
		panel.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutors tu=new Tutors();
				tu.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(128, 128, 128));
		btnNewButton_1_1_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		btnNewButton_1_1_1.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("Tutors");
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
		lblNewLabel_1.setBounds(319, 61, 341, 55);
		contentPane.add(lblNewLabel_1);
		 DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
				 
			},
			new String[] {
					"ID","USERNAME", "EMAIL"
			}
		);
		 updateTutors tur=new updateTutors();
		tur.showData(model);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(307, 400, 803, 461);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("ID\r\nusername\r\nemail");
		table.setModel(model);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2.setBounds(319, 140, 105, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(318, 190, 105, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(319, 240, 105, 26);
		contentPane.add(lblNewLabel_2_2);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(433, 142, 170, 19);
		contentPane.add(id);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(433, 192, 170, 19);
		contentPane.add(username);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(433, 242, 170, 19);
		contentPane.add(email);
		
	
		JButton btnNewButton_2_2 = new JButton("Add Tutor");
		btnNewButton_2_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
//				String idText=id.getText();
				String userText=username.getText();
				String emailText=email.getText();
			
				if(userText.isEmpty()||emailText.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Invalid input","Error", JOptionPane.INFORMATION_MESSAGE);
				}else { 
					updateTutors tu=new updateTutors();
//					int idValue=Integer.parseInt("idText");
					tu.addTutors(userText,emailText);
				}
			
				}}
		);
		btnNewButton_2_2.setBounds(319, 346, 140, 45);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2 = new JButton("Edit Tutor");
		btnNewButton_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            int Id = Integer.parseInt(id.getText());
		            String userText = username.getText().toUpperCase();
		            String emailText = email.getText();
		           
		            if(userText.isEmpty()||emailText.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Invalid input","Error", JOptionPane.INFORMATION_MESSAGE);
		            } else {
		               
		                updateTutors co = new updateTutors();
		                co.updateData(Id,userText, emailText);
		            }
		        } catch (NumberFormatException ex) {
		            // Handle the case where the input string is not a valid integer
		            JOptionPane.showMessageDialog(null, "Invalid Input ", "404 Error", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		btnNewButton_2.setBounds(469, 344, 140, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Delete Tutor");
		btnNewButton_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            int Id = Integer.parseInt(id.getText());
		            String nameValue = username.getText().toUpperCase();
		            String mailText = email.getText();
		            
		           

		            if (nameValue.isEmpty() || mailText.isEmpty() ) {
		                JOptionPane.showMessageDialog(null, "Invalid Input", "404 Error", JOptionPane.INFORMATION_MESSAGE);
		            } else {
		               
		                updateTutors co = new updateTutors();
		                co.deleteTutor(Id, nameValue, mailText);
		            }
		        } catch (NumberFormatException ex) {
		            // Handle the case where the input string is not a valid integer
		            JOptionPane.showMessageDialog(null, "Invalid Input ", "404 Error", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		btnNewButton_2_1.setBounds(619, 346, 140, 45);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutors tu=new Tutors();
				tu.setVisible(true);
				dispose();
				}
		});
		btnNewButton_1.setBounds(518, 272, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2_2_1 = new JButton("Create Report");
		btnNewButton_2_2_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are not authorized to perform this action", "Unauthorized Access", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		btnNewButton_2_2_1.setBounds(769, 344, 140, 45);
		contentPane.add(btnNewButton_2_2_1);
		table.getColumnModel().getColumn(0).setPreferredWidth(151);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(151);
		table.getColumnModel().getColumn(2).setPreferredWidth(151);
	}	
}
	

