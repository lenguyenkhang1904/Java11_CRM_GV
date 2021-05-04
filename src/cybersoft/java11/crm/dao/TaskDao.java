package cybersoft.java11.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.crm.config.MySqlConnection;
import cybersoft.java11.crm.model.Task;

public class TaskDao {
	public List<Task> findall()
	{
		List<Task> taskList=new LinkedList<Task>();
		Connection connection=MySqlConnection.getConnection();
		try {
			Statement statment=connection.createStatement();
			String query="select id,name,description,start_date,due_date,assignee,projectid,statusid from task";
			
			ResultSet result=statment.executeQuery(query);
			
			while(result.next())
			{
				Task task=new Task();
				task.setId(result.getInt("id"));
				task.setName(result.getString("name"));
				task.setDescription(result.getString("description"));
				task.setStart_date(result.getString("start_date"));
				task.setEnd_đate(result.getString("due_date"));
				task.setAssignee(result.getInt("assignee"));
				task.setProject_id(result.getInt("projectid"));
				task.setStatus_id(result.getInt("statusid"));
				
				taskList.add(task);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return taskList;
	}
}
