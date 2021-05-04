package cybersoft.java11.crm.model;

public class Task {
	//properities
	private int id;
	private String name;
	private String description;
	private User assignee;
	private Project project_id;
	private Status status_id;
	private String start_date;
	private String end_đate;
	//getter-setter
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
	public User getAssignee() {
		return assignee;
	}
	public void setAssignee(int assignee) {
		this.assignee.setId(assignee);
	}
	public Project getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id.setId(project_id);
	}
	public Status getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id.setId(status_id);
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_đate() {
		return end_đate;
	}
	public void setEnd_đate(String end_đate) {
		this.end_đate = end_đate;
	}
	//constructor
	public Task(int id, String name, String description, User assignee, Project project_id, Status status_id,
			String start_date, String end_đate) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.assignee = assignee;
		this.project_id = project_id;
		this.status_id = status_id;
		this.start_date = start_date;
		this.end_đate = end_đate;
	}
	public Task()
	{
		this.id =-1;
		this.name = "";
		this.description = "";
		this.assignee = null;
		this.project_id = null;
		this.status_id = null;
		this.start_date = "1990/1/1";
		this.end_đate = "";
	}
	//toString
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", assignee=" + assignee.getId()
				+ ", project_id=" + project_id.getId() + ", status_id=" + status_id.getId() + ", start_date=" + start_date
				+ ", end_đate=" + end_đate + "]";
	}
	
	
}
