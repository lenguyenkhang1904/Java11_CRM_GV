package cybersoft.java11.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.crm.config.MySqlConnection;
import cybersoft.java11.crm.model.Project_User;

public class Project_UserDao {
	public List<Project_User> findALL()
	{
		List<Project_User> project_userList=new LinkedList<Project_User>();
		Connection connection=MySqlConnection.getConnection();
		 try {
			Statement statement=connection.createStatement();
			String query="select project_id,user_id,join_date,description from project_user";
			
			ResultSet result=statement.executeQuery(query);
			while(result.next())
			{
				Project_User project_user=new Project_User();
				project_user.setProject_id(result.getInt(" project_id"));
				project_user.setUser_id(result.getInt(" user_id"));
				project_user.setDescription(result.getString("description"));
				project_user.setJoin_date(result.getString("join_date"));
				
				project_userList.add(project_user);
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 return project_userList;
	}
}
