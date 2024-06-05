package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Report extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField course;
	private JTextField percentage;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 102));
		contentPane.setForeground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id = new JTextField();
		id.setBounds(186, 101, 213, 26);
		contentPane.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(186, 151, 213, 26);
		contentPane.add(name);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(186, 210, 213, 26);
		contentPane.add(course);
		
		percentage = new JTextField();
		percentage.setColumns(10);
		percentage.setBounds(186, 254, 79, 26);
		contentPane.add(percentage);
		
		grade = 	new JTextField();
		grade.setColumns(10);
		grade.setBounds(186, 307, 79, 26);
		contentPane.add(grade);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
		        	try {
		        		int Id = Integer.parseInt(id.getText());
			            String userText = name.getText().toUpperCase();
			            String courseText=course.getText().toUpperCase();
			            String percentText=percentage.getText().toUpperCase();
			            String gradeText=grade.getText().toUpperCase();

			            if(userText.isEmpty()||courseText.isEmpty()||percentText.isEmpty()||percentText.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Invalid input","Error", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			               
			                updateTutors co = new updateTutors();
			                co.reportStatus(Id,userText,courseText,percentText,gradeText);
			            }
			        } catch (NumberFormatException ex) {
			            // Handle the case where the input string is not a valid integer
			            JOptionPane.showMessageDialog(null, "Invalid Input ", "404 Error", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnNewButton.setBounds(47, 389, 129, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 101, 129, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblUserName.setBounds(47, 151, 129, 26);
		contentPane.add(lblUserName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblCourse.setBounds(31, 210, 129, 26);
		contentPane.add(lblCourse);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercentage.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblPercentage.setBounds(47, 257, 129, 26);
		contentPane.add(lblPercentage);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblGrade.setBounds(31, 307, 129, 26);
		contentPane.add(lblGrade);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBackground(new Color(192, 192, 192));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutors uu=new Tutors();
				uu.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		btnCancel.setBounds(270, 389, 129, 39);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Report\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		lblNewLabel_1.setBounds(121, 26, 363, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel bgimage = new JLabel("");
		bgimage.setIcon(new ImageIcon("C:\\Users\\shres\\Downloads\\bg-image.jpg"));
		bgimage.setBounds(0, 0, 575, 486);
		contentPane.add(bgimage);
	}
}
