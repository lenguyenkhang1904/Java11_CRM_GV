package cybersoft.java11.crm.biz;

import java.util.List;

import cybersoft.java11.crm.dao.StatusDao;
import cybersoft.java11.crm.model.Status;

public class StatusBiz {
	private StatusDao dao;
	public StatusBiz()
	{
		dao=new StatusDao();
	}
	
	public List<Status> findALL()
	{
		return dao.findAll();
	}
}
