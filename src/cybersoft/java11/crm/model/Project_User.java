package cybersoft.java11.crm.model;

public class Project_User {
	//properities
	private Project Project_id;
	private User user_id;
	private String description;
	private String join_date;
	//getter-setter
	public Project getProject_id() {
		return Project_id;
	}
	public void setProject_id(int project_id) {
		this.Project_id.setId(project_id);
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id.setId(user_id);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	//constructor
	public Project_User(Project project_id, User user_id, String description) {
		Project_id = project_id;
		this.user_id = user_id;
		this.description = description;
	}
	public Project_User()
	{
		
			Project_id = null;
			this.user_id = null;
			this.description = "";
			this.join_date="1900/1/1";
	}
	//toString
	@Override
	public String toString() {
		return "Project_User [Project_id=" + Project_id.getId() + ", user_id=" + user_id.getId() + ", description=" + description
				+ ", join_date=" + join_date + "]";
	}
	
}	
