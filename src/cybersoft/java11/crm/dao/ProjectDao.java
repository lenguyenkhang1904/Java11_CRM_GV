package cybersoft.java11.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.crm.config.MySqlConnection;
import cybersoft.java11.crm.model.Project;

public class ProjectDao {
	public List<Project> findALL()
	{
		List<Project> projectList=new LinkedList<Project>();
		
		Connection connection=MySqlConnection.getConnection();
		try {
			Statement statement=connection.createStatement();
			
			String query="select id,name,description,start_date,end_date,create_user_id from project";
			
			ResultSet result=statement.executeQuery(query);
			while(result.next())
			{
				Project project = new Project();
				project.setId(result.getInt("id"));
				project.setName(result.getString("name"));
				project.setDescription(result.getString("description"));
				project.setStart_date(result.getString("start_date"));
				project.setEnd_date(result.getString("end_date"));
				project.setCreate_user(result.getInt("create_user_id"));
				
				projectList.add(project);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return projectList;
	}
}
