package login;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class viewReport extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;

	private JTable table_2;
	private JTable model1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewReport frame = new viewReport();
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
	public viewReport() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 830);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		 setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 200, 120, 60);
		contentPane.add(lblNewLabel);
		
		id = new JTextField();
		id.setBounds(114, 218, 300, 25);
		contentPane.add(id);
		id.setColumns(10);
		DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STUDENT_ID", "USERNAME", "COURSE", "PERCENTAGE", "GRADE"
			}
		);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 277, 736, 516);
		contentPane.add(scrollPane);

		model1 = new JTable();
		scrollPane.setViewportView(model1);
		model1.setModel(model);

		
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 11));
		btnNewButton.setBounds(424, 215, 95, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				  int Id = Integer.parseInt(id.getText());
				updateStudents rr=new updateStudents();
				rr.showReport(Id,model);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT REPORT\r\n");
		lblNewLabel_1.setFont(new Font("Wide Latin", Font.BOLD, 34));
		lblNewLabel_1.setBounds(40, 31, 686, 60);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}
