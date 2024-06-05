package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateCourse {
	public  void showData(DefaultTableModel model  ) {
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try {
	        Connection con = DriverManager.getConnection(url, username, password);
	        Statement st = con.createStatement();
	        String query = "SELECT id, name, seat,batch, years FROM course";
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
            	int id=resultSet.getInt("id");
                String nameValue = resultSet.getString("name");
                int seatValue = resultSet.getInt("seat");
                int batchValue = resultSet.getInt("batch");
                int yearValue = resultSet.getInt("years");
               
                

                // Add a new row to the table model
                model.addRow(new Object[]{id, nameValue,seatValue,batchValue,  yearValue});
            }

           
            
            st.close();
	        con.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public  void addData(String nameValue,String seatValue,String batchValue, String yearValue){
	    String username = "root";
	    String password = "";
	    String url = "jdbc:mysql://localhost:3306/cmsStudent";

	    try {
	        Connection con = DriverManager.getConnection(url, username, password);
	        Statement st = con.createStatement();
	        String query = "INSERT INTO course(name,seat,batch,years) VALUES('"+nameValue+"','"+seatValue+"','"+batchValue+"','"+yearValue+"')";
	         st.executeUpdate(query);
	       

	       
	        
	        st.close();
	        con.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public  void deleteData(int id,String nameValue,int seatValue,int batchValue, int yearValue){
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
	        String deleteQuery = "DELETE FROM course WHERE id = ? AND `name` = ? AND `seat` = ? AND `batch` = ? AND `years` = ?";
	        
	        try (PreparedStatement st = con.prepareStatement(deleteQuery)) {
	            st.setInt(1, id);
	            st.setString(2, nameValue);
	            st.setInt(3, seatValue);
	            st.setInt(4, batchValue);
	            st.setInt(5, yearValue);

	            int rowsDeleted = st.executeUpdate();

	            if (rowsDeleted > 0) {
	                System.out.println("Row deleted successfully!");
	            } else {
	                System.out.println("No rows deleted. Check if the specified values exist.");
	            }
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public  void updateData(int id,String nameValue,int seatValue,int batchValue, int yearValue){
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
	        String deleteQuery = "UPDATE course SET `name` = ? ,`seat` = ? , `batch` = ? , `years` = ? WHERE id=?";
	        
	        try (PreparedStatement st = con.prepareStatement(deleteQuery)) {
	        	st.setString(1, nameValue);
	            st.setInt(2, seatValue);
	            st.setInt(3, batchValue);
	            st.setInt(4, yearValue);
	            st.setInt(5, id);

	            

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
}
       