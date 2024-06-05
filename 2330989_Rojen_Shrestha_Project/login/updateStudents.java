package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateStudents {
	 String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	public  void showData(DefaultTableModel model  ) {
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try {
	        Connection con = DriverManager.getConnection(url, username, password);
	        Statement st = con.createStatement();
	        String query = "SELECT id, username, email, course FROM student";
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
            	int id=resultSet.getInt("id");
                String usernameValue = resultSet.getString("username");
                String emailValue = resultSet.getString("email");
                String courseValue = resultSet.getString("course");

                // Add a new row to the table model
                model.addRow(new Object[]{id, usernameValue, emailValue, courseValue});
            }

           
            
            st.close();
	        con.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	public  void deleteStud(int id,String nameValue,String email,String coursE){
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try {
	        Connection con = DriverManager.getConnection(url, username, password);
//	        Statement st = con.createStatement();
//	        String query ="DELETE FROM course WHERE id = '" + id + "' name = '" + nameValue + "' AND seat = '" + seatValue + "' AND batch = '" + batchValue + "' AND years = '" + yearValue + "'";
//	        st.executeUpdate(query);
//	        
//	        
//	        con.close();
	        String deleteQuery = "DELETE FROM student WHERE id = ? AND `username` = ? AND `email` = ? AND `course` =? ";
	        
	        try (PreparedStatement st = con.prepareStatement(deleteQuery)) {
	            st.setInt(1, id);
	            st.setString(2, nameValue);
	            st.setString(3, email);
	            st.setString(4, coursE);
	           

	            int rowsDeleted = st.executeUpdate();

	            if (rowsDeleted > 0) {
	            	 JOptionPane.showMessageDialog(null,"Deleted Successfully!!");

	            } else {
	            	 JOptionPane.showMessageDialog(null,"No rows deleted!!");

	          
	            }
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public  void updateStud(int id,String nameValue,String emailText,String couRSE){
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try {
	        Connection con = DriverManager.getConnection(url, username, password);
//	        Statement st = con.createStatement();
//	        String query ="DELETE FROM course WHERE id = '" + id + "' name = '" + nameValue + "' AND seat = '" + seatValue + "' AND batch = '" + batchValue + "' AND years = '" + yearValue + "'";
//	        st.executeUpdate(query);
//	        
//	        
//	        con.close();
	        String deleteQuery = "UPDATE student SET `username` = ? ,`email` = ? ,`course`=? WHERE id=?";
	        
	        try (PreparedStatement st = con.prepareStatement(deleteQuery)) {
	        	st.setString(1, nameValue);
	            st.setString(2, emailText);
	            st.setString(3, couRSE);
	            st.setInt(4, id);

	            

	            int rowsDeleted = st.executeUpdate();
	            if (rowsDeleted > 0) {
//	                ("Row deleted successfully!");
	            	JOptionPane.showMessageDialog(null, "Row Updated Successfully");
	            } else {
	            	JOptionPane.showMessageDialog(null,"No rows deleted. Check if the specified values exist.");
	            }
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }	
	
}
	public int getStudentCount() {
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try (Connection con = DriverManager.getConnection(url, username, password)) {
	        String query = "SELECT COUNT(*) AS total FROM student";

	        try (PreparedStatement statement = con.prepareStatement(query);
	             ResultSet resultSet = statement.executeQuery()) {

	            if (resultSet.next()) {
	                int totalStudents = resultSet.getInt("total");
	                return totalStudents;
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return -1; // Return -1 if an error occurs
	}
	
	
		public  void showReport(int Id ,DefaultTableModel model ) {
		    String username = "root";
		    String password = "";
		    String url = "jdbc:mysql://localhost:3306/cmsStudent";
		   

//		    try (
//		            Connection con = DriverManager.getConnection(url, username, password);
//		            PreparedStatement pstmt = con.prepareStatement(query);
//		        ) {
//		            
//
//		            try (ResultSet resultSet = pstmt.executeQuery()) {
//		                model.setRowCount(0); // Clear existing rows
//
//		                while (resultSet.next()) {
//		                    int ID = resultSet.getInt("student_id");
//		                    String usernameValue = resultSet.getString("username");
//		                    String courseValue = resultSet.getString("course");
//		                    String percentValue = resultSet.getString("percentage");
//		                    String gradeValue = resultSet.getString("grade");
//		                    System.out.print(percentValue);
//		                    System.out.println("Found data: " + ID + ", " + usernameValue + ", " + courseValue + ", " + percentValue + ", " + gradeValue);
//		                    model.addRow(new Object[]{ID, usernameValue, courseValue, percentValue, gradeValue});
//		                }
//		            }
//		        } catch (SQLException e) {
//		            e.printStackTrace();
//		        }
//		
//	}}
String query=" SELECT * FROM report WHERE student_id =" + Id;
		    try {
		        Connection con = DriverManager.getConnection(url, username, password);
		        Statement st = con.createStatement();
		        
	           
//
		    ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
            	int ID = resultSet.getInt("student_id");
                String usernameValue = resultSet.getString("username");
                String courseValue = resultSet.getString("course");
                String percentValue = resultSet.getString("percentage");
                String gradeValue = resultSet.getString("grade");
                System.out.print(percentValue);
                System.out.println("Found data: " + ID + ", " + usernameValue + ", " + courseValue + ", " + percentValue + ", " + gradeValue);
                model.addRow(new Object[]{ID, usernameValue, courseValue, percentValue, gradeValue});
            }

           
            
            st.close();
	        con.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}}

