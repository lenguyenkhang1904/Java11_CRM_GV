package cybersoft.java11.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.crm.config.MySqlConnection;
import cybersoft.java11.crm.model.User;

public class UserDao {
	public List<User> findALL()
	{
		List<User> listUser=new LinkedList<User>();
		Connection connection=MySqlConnection.getConnection();
		try {
			Statement statment=connection.createStatement();
			String query="select id,email,password,fullname,address,phone,role_id from user";
			
			ResultSet result=statment.executeQuery(query);
			while(result.next())
			{
				User user=new User();
				user.setId(result.getInt("id"));
				user.setEmail(result.getString("email"));
				user.setPassword(result.getString("password"));
				user.setFullname(result.getString("fullname"));
				user.setAddress(result.getString("address"));
				user.setPhone(result.getString("phone"));
				user.setRole(result.getInt("role_id"));
				
				listUser.add(user);
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return listUser;
	}
}
