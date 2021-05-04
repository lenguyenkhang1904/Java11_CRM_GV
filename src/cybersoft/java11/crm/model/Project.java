package cybersoft.java11.crm.model;

public class Project {
	//propertites
	private int id;
	private String name;
	private String description;
	private String start_date;
	private String end_date;
	private User create_user;
	//getter,setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public User getCreate_user() {
		return create_user;
	}
	public void setCreate_user(int create_user) {
		this.create_user.setId(create_user);
	}
	//constructor
	public Project(int id, String name, String description, String start_date, String end_date, User create_user) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.create_user = create_user;
	}
	public Project()
	{
		this.id =-1;
		this.name ="";
		this.description = "";
		this.start_date = "1900/1/1";
		this.end_date = "1900/1/1";
		this.create_user = null;
	}
	//toString
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", create_user=" + create_user + "]";
	}
	
	
}	
