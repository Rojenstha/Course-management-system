package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class updateTutors {
	public  void showData(DefaultTableModel model  ) {
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try {
	        Connection con = DriverManager.getConnection(url, username, password);
	        Statement st = con.createStatement();
	        String query = "SELECT id, username, email FROM teacher";
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
            	int id=resultSet.getInt("id");
                String usernameValue = resultSet.getString("username");
                String emailValue = resultSet.getString("email");
               

                // Add a new row to the table model
                model.addRow(new Object[]{id, usernameValue, emailValue});
            }

           
            
            st.close();
	        con.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	

	public void addTutors(String userText,String email) {
		 String username = "root";
		    String password = "";
		    String url = "jdbc:mysql://localhost:3306/cmsStudent";

		    try {
		        Connection con = DriverManager.getConnection(url, username, password);
		        Statement st = con.createStatement();
		        String query = "INSERT INTO teacher(username,email) VALUES('"+userText+"','"+email+"')";
		         st.executeUpdate(query);
		       JOptionPane.showMessageDialog(null,"Added Successfully!!");

		       
		        
		        st.close();
		        con.close();
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
	
	public  void deleteTutor(int id,String nameValue,String email){
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
	        String deleteQuery = "DELETE FROM teacher WHERE id = ? AND `username` = ? AND `email` = ? ";
	        
	        try (PreparedStatement st = con.prepareStatement(deleteQuery)) {
	            st.setInt(1, id);
	            st.setString(2, nameValue);
	            st.setString(3, email);
	           

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
	
public  void updateData(int id,String nameValue,String emailText){
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try {
        Connection con = DriverManager.getConnection(url, username, password);
      con.close();
        String deleteQuery = "UPDATE teacher SET `username` = ? ,`email` = ?  WHERE id=?";
        
        try (PreparedStatement st = con.prepareStatement(deleteQuery)) {
        	st.setString(1, nameValue);
            st.setString(2, emailText);
            st.setInt(3, id);

            

            int rowsDeleted = st.executeUpdate();
            if (rowsDeleted > 0) {
//                ("Row deleted successfully!");
            	JOptionPane.showMessageDialog(null, "Row Updated Successfully");
            } else {
            	JOptionPane.showMessageDialog(null,"No rows deleted. Check if the specified values exist.");
            }
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }	
}
public int getTutorCount() {
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try (Connection con = DriverManager.getConnection(url, username, password)) {
        String query = "SELECT COUNT(*) AS total FROM teacher";

        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int totalTutors = resultSet.getInt("total");
                return totalTutors;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return -1; // Return -1 if an error occurs
}
public void reportStatus(int Id, String userText, String courseText, String percentText, String gradeText) {
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/cmsStudent";

    try (Connection con = DriverManager.getConnection(url, username, password)) {
        String insertQuery = "INSERT INTO report (student_id, username, course, percentage, grade) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement st = con.prepareStatement(insertQuery)) {
            st.setInt(1, Id);
            st.setString(2, userText);
            st.setString(3, courseText);
            st.setDouble(4, Double.parseDouble(percentText));
            st.setString(5, gradeText);
            
            int rowsInserted = st.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Row Inserted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "No rows inserted. Check if the specified values exist.");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}