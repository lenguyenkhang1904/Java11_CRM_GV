package cybersoft.java11.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.crm.config.MySqlConnection;
import cybersoft.java11.crm.model.Status;

public class StatusDao {
	public List<Status> findAll()
	{
		List<Status> statusList=new LinkedList<Status>();
		
		Connection connection=MySqlConnection.getConnection();
		try {
			Statement statement=connection.createStatement();
			String query="select id, name, description from task";
			
			ResultSet results=statement.executeQuery(query);
			while(results.next())
			{
				Status status=new Status();
				status.setId(results.getInt("id"));
				status.setName(results.getString("name"));
				status.setDescription(results.getString("description"));
						
				statusList.add(status);		
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return statusList;
		
	}
}
