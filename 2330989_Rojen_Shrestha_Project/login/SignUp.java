package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.regex.*;
import javax.swing.ImageIcon;
public class SignUp extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField mail;
	private JPasswordField textPassword;
	private JLabel textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
//					frame.setUndecorated(true);
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
	public SignUp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("Welcome to SignUp\r\n");
		lblNewLabel.setBounds(72, 28, 341, 58);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 32));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username\r\n");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(72, 97, 160, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(72, 161, 160, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email\r\n");
		lblNewLabel_1_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1_2.setBounds(72, 217, 160, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mode");
		lblNewLabel_1_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
		lblNewLabel_1_3.setBounds(72, 271, 160, 26);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Course");
	    lblNewLabel_1_4.setFont(new Font("Viner Hand ITC", Font.PLAIN, 23));
	    lblNewLabel_1_4.setBounds(352, 271, 160, 26);
	    contentPane.add(lblNewLabel_1_4);
	    lblNewLabel_1_4.setVisible(false);
	    
	    JComboBox courseTextField = new JComboBox();
	    courseTextField.setModel(new DefaultComboBoxModel(new String[] {"Select Course", "Bsc Hons Computer Science", "BIBM", "BCA", "CSIT"}));
	    courseTextField.setBounds(434, 269, 117, 28);
	    contentPane.add(courseTextField);
	    courseTextField.setVisible(false);
		
		textUsername = new JTextField();
		textUsername.setBounds(191, 97, 359, 28);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(191, 215, 359, 28);
		contentPane.add(mail);
		
		
		textField = new JLabel();
		textField.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 10));
		textField.setForeground(new Color(0, 0, 255));
		textField.setText("Password must have minmum length of 6");
		textField.setBounds(191, 187, 359, 19);
		contentPane.add(textField);
		textField.setVisible(false);
		

		JLabel lblNewLabel_3 = new JLabel("Username shouldnot be empty");
		lblNewLabel_3.setFont(new Font("Corbel Light", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(201, 123, 350, 18);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 if (e.getStateChange() == ItemEvent.SELECTED) {
			            String selectedMode = comboBox.getSelectedItem().toString();
			            if (selectedMode.equals("Student")) {
			                lblNewLabel_1_4.setVisible(true);
			                courseTextField.setVisible(true);
			            } else {
			                lblNewLabel_1_4.setVisible(false);
			                courseTextField.setVisible(false);
			            }
			        }
			}
		});

		JLabel checkMail = new JLabel("Invalid mail format");
		checkMail.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 11));
		checkMail.setForeground(new Color(0, 0, 255));
		checkMail.setBounds(191, 247, 359, 13);
		contentPane.add(checkMail);
		checkMail.setVisible(false);
				 
	
		comboBox.setFont(new Font("Candara", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select User mode", "Student", "Tutor", "Admin"}));
		comboBox.setBounds(191, 271, 136, 26);
		contentPane.add(comboBox);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(191, 159, 359, 28);
		contentPane.add(textPassword);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String userName=textUsername.getText().toUpperCase();
				String passWord=textPassword.getText();
				String mode=comboBox.getSelectedItem().toString();
				String course=courseTextField.getSelectedItem().toString().toUpperCase();
				String email=mail.getText();
				System.out.println(userName);
				System.out.println(passWord);
				System.out.println(email);
				System.out.print(course);
				
				if(mode.equals("Student")){
				 boolean validPass = passWord.matches("^[a-zA-Z0-9!@#$%^&*()-_=+;:,.<>?/|`~\"'\\[\\]{}]{7,22}$");
			        boolean validName = !userName.trim().isEmpty();
			        
			        if (!validName) {
			            lblNewLabel_3.setVisible(true);
			        }
			        
			        if(!validPass) {
			        	textField.setVisible(true);
			        	textUsername.setText("");
			        }
			        boolean validEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
			        if (!validEmail) {
			        	checkMail.setVisible(true);
			           mail.setText("");
			           
			        }

			        if (validName && validPass && validEmail) {
			            insertData(userName, passWord, email, course);
			            JOptionPane.showMessageDialog(null,"Signed Up sucessfully as Student");
			            textField.setVisible(false);
			            textUsername.setText("");
			            textPassword.setText("");
			            mail.setText("");
			        } else {
			            
			            textField.setVisible(true);
			            textPassword.setText("");
			        }
				}
				
				if(mode.equals("Tutor")){
					 boolean validPass = passWord.matches("^[a-zA-Z0-9!@#$%^&*()-_=+;:,.<>?/|`~\"'\\[\\]{}]{6,}$");
				        boolean validName = !userName.trim().isEmpty();
				        
				        if (!validName) {
				            lblNewLabel_3.setVisible(true);
				        }
				        
				        if(!validPass) {
				        	textField.setVisible(true);
				        	textUsername.setText("");
				        }
				        boolean validEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
				        if (!validEmail) {
				           mail.setText("");
				        }

				        if (validName && validPass && validEmail) {
				            insertDataTutor(userName, passWord, email);
				            JOptionPane.showMessageDialog(null,"Signed Up sucessfully as Tutor");
				            textField.setVisible(false);
				            textUsername.setText("");
				            textPassword.setText("");
				            mail.setText("");
				        } else {
				           
				            textField.setVisible(true);
				            textPassword.setText("");
				        }
					}
				
				if(mode.equals("Admin")){
					 boolean validPass = passWord.matches("^[a-zA-Z0-9!@#$%^&*()-_=+;:,.<>?/|`~\"'\\[\\]{}]{6,}$");
				        boolean validName = !userName.trim().isEmpty();
				        
				        if (!validName) {
				            lblNewLabel_3.setVisible(true);
				        }
				        
				        if(!validPass) {
				        	textField.setVisible(true);
				        	textUsername.setText("");
				        }
				        boolean validEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
				        if (!validEmail) {
				           mail.setText("");
				        }

				        if (validName && validPass && validEmail) {
				            insertDataAdmin(userName, passWord, email);
				            JOptionPane.showMessageDialog(null,"Signed Up sucessfully as Admin");
				            textField.setVisible(false);
				            textUsername.setText("");
				            textPassword.setText("");
				            mail.setText("");
				        } else {
		
				            textField.setVisible(true);
				            textPassword.setText("");
				        }
					}
				
				
			}		
		});
		
		
		btnNewButton.setBounds(72, 388, 192, 58);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login\r\n");
		btnLogin.setFont(new Font("Viner Hand ITC", Font.PLAIN, 16));
		btnLogin.setBackground(new Color(192, 192, 192));
		btnLogin.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				Login log=new Login();
				log.setVisible(true);
				dispose();
			}
		});
		btnLogin.setBounds(432, 388, 192, 58);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Registered Already?");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lblNewLabel_2.setBounds(434, 359, 165, 26);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textUsername.setText("");
				textPassword.setText("");
			}
		});
		btnNewButton_1.setBounds(448, 343, 117, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel bgimage = new JLabel("");
		bgimage.setIcon(new ImageIcon("C:\\Users\\shres\\Downloads\\bg-image.jpg"));
		bgimage.setBounds(0, 0, 681, 472);
		contentPane.add(bgimage);
		
	
	}

//DataBase for students
public static void insertData(String userName,String passWord,String email,String course) {
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try {
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
       

        String insertQuery = "INSERT INTO student (username, password, email,course) VALUES('" + userName + "','" + passWord + "','" + email + "','"+course+"')";

        st.execute(insertQuery);
       
        con.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}


//DataBase for tutors
public static void insertDataTutor(String userName,String passWord,String email) {
  String username = "root";
  String password = "";
  String url = "jdbc:mysql://localhost:3306/cmsStudent";

  try {
      Connection con = DriverManager.getConnection(url, username, password);
      Statement st = con.createStatement();
     

      String insertQuery="INSERT INTO teacher(username,password,email) VALUES('"+userName+"','"+passWord+"','"+email+"')";
      st.execute(insertQuery);
     
      con.close();
      
  } catch (Exception e) {
      e.printStackTrace();
  }
}


//DataBase foradmin
public static void insertDataAdmin(String userName,String passWord,String email) {
String username = "root";
String password = "";
String url = "jdbc:mysql://localhost:3306/cmsStudent";

try {
    Connection con = DriverManager.getConnection(url, username, password);
    Statement st = con.createStatement();
   

    String insertQuery="INSERT INTO admin(username,password,email) VALUES('"+userName+"','"+passWord+"','"+email+"')";
    st.execute(insertQuery);
   
    con.close();
    
} catch (Exception e) {
    e.printStackTrace();
}
}
}


