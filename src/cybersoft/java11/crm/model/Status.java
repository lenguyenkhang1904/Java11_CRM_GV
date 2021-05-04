package cybersoft.java11.crm.model;

public class Status {
	private int id;
	private String name;
	private String description;
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
	//constructor
	public Status(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Status()
	{
		this.id = -1;
		this.name = "";
		this.description = "";
	}
	//toString
	@Override
	public String toString() {
		return "Status [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
