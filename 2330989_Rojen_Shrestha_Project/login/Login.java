package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DropMode;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int INORMATION_MESSAGE = 0;
	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JTextField emailTxt;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
//					frame.setUndecorated(true);;
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		 setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Login page\r\n");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 68, 345, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username\r\n");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(82, 154, 151, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password\r\n");
		lblNewLabel_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(81, 204, 109, 49);
		contentPane.add(lblNewLabel_1_1);
		
		textUsername = new JTextField();
		textUsername.setBounds(230, 156, 345, 34);
		contentPane.add(textUsername);
		textUsername.setColumns(12);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(230, 212, 345, 33);
		contentPane.add(textPassword);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select User Mode", "Student", "Tutor", "Admin"}));
		comboBox.setBounds(230, 343, 156, 28);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Select Mode");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(81, 344, 179, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel userMode = new JLabel("Invalid User mode");
		userMode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		userMode.setForeground(new Color(255, 0, 0));
		userMode.setBounds(230, 377, 232, 13);
		contentPane.add(userMode);
		userMode.setVisible(false);
		

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 
				String username=textUsername.getText().toUpperCase();
				String password=textPassword.getText();
				String email=emailTxt.getText();
				String mode=comboBox.getSelectedItem().toString();
				System.out.println(username);
				System.out.println(password);
				System.out.print(mode);
		
				if(mode.equals("Student")) {
					
				insertData(username,password,email);
			
				}
				if(mode.equals("Tutor")) {
					
					insertDataTutor(username,password,email);
					
					}
				if(mode.equals("Admin")) {
					insertDataAdmin(username,password,email);
					
		
					}
				if(mode.equals("Select User Mode")) {
					userMode.setVisible(true);
				}
				
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(230, 416, 156, 55);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBackground(new Color(192, 192, 192));
		btnSignUp.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp sg= new SignUp();
				sg.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setBounds(454, 415, 156, 55);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel_3 = new JLabel("Not Registered?");
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(454, 401, 151, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1_1_1.setBounds(81, 267, 109, 49);
		contentPane.add(lblNewLabel_1_1_1);
		
		emailTxt = new JTextField();
		emailTxt.setBounds(230, 275, 345, 33);
		contentPane.add(emailTxt);
		
		JLabel bg_image = new JLabel("");
		bg_image.setIcon(new ImageIcon("C:\\Users\\shres\\Downloads\\bg-image.jpg"));
		bg_image.setBounds(0, 0, 821, 573);
		contentPane.add(bg_image);
		
		
	}

public  void insertData(String username,String password,String email) {
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try {

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        String databaseuName="Select* from student";
        ResultSet rs=st.executeQuery(databaseuName);
        boolean foundmatch=false;
        while(rs.next()) {
        	String duserName=rs.getString(2);
        	String dPassword=rs.getString(3);
        	String demail=rs.getString(4);
        	if(username.equals(duserName)&&(password.equals(dPassword))&&(email.equals(demail))) {
        		DashboardS ds= new DashboardS();
        		ds.setVisible(true);
        		dispose();
        		foundmatch=true;
        		break;
        	}
        }
        if (!foundmatch) {
            JOptionPane.showMessageDialog(null, "Invalid INPUT ");
        }
        
    
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public  void insertDataTutor(String username,String password,String email) {
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try {
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        String databaseuName="Select* from teacher";
        ResultSet rs=st.executeQuery(databaseuName);
        boolean foundmatch=false;
		while(rs.next()) {
        	String duserName=rs.getString(2);
        	String dPassword=rs.getString(3);
        	String demail=rs.getString(4);
        	if(username.equals(duserName)&&(password.equals(dPassword))&&(email.equals(demail))) {
        		DashboardT ds= new DashboardT();
        		ds.setVisible(true);
        		dispose();
        		foundmatch=true;
        		break;
        	}
        }
        if (!foundmatch) {
            JOptionPane.showMessageDialog(null, "Invalid INPUT ");
        }
        
        
    
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public  void insertDataAdmin(String username,String password,String email) {
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try {
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        String databaseuName="Select* from admin";
        ResultSet rs=st.executeQuery(databaseuName);
        boolean foundmatch=false;
        while(rs.next()) {
        	
        	String duserName=rs.getString(1);
        	String dPassword=rs.getString(2);
        	String demail=rs.getString(3);
        	if(username.equals(duserName)&&(password.equals(dPassword))&&(email.equals(demail))) {
        		
        		Dashboard ds= new Dashboard();
        		ds.setVisible(true);
        		dispose();
        		foundmatch=true;
        		break;
        	}
        }
        if (!foundmatch) {
            JOptionPane.showMessageDialog(null, "Invalid INPUT ");
        }
    
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}



