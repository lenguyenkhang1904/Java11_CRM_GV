package cybersoft.java11.crm.biz;

import java.util.List;

import cybersoft.java11.crm.dao.Project_UserDao;
import cybersoft.java11.crm.model.Project_User;

public class Project_UserBiz {
	private Project_UserDao dao;
	public Project_UserBiz()
	{
		dao=new Project_UserDao();
	}
	public List<Project_User> findall()
	{
		return dao.findALL();
	}
}
